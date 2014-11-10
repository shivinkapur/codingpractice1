//LCA in normal binary tree
public Node lca(Node p,Node q)
{
	lca(root,p,q);
}
private Node lca(Node node,Node p, Node q)
{
	if(!node)
		return null;
	if(node==p || node==q)
		return node;
	Node l=lca(node.left,p,q);
	Node r=lca(node.right,p,q);
	if(l && r)
		return node;
	return l?l:r;
}

//Other Approach
int countMatchesPQ(Node root, Node p, Node q)
{
  if (!root)
  	return 0;
  int matches = countMatchesPQ(root->left, p, q) + countMatchesPQ(root->right, p, q);
  if (root == p || root == q)
    return 1 + matches;
  else
    return matches;
}
 
Node LCA(Node root, Node p, Node q)
{
  if (!root || !p || !q)
  	return NULL;
  if (root == p || root == q)
  	return root;
  int totalMatches = countMatchesPQ(root->left, p, q);
  if (totalMatches == 1)
    return root;
  else if (totalMatches == 2)
    return LCA(root->left, p, q);
  else /* totalMatches == 0 */
    return LCA(root->right, p, q);
}

//Without recursion. We have the parent to all nodes. Parent of Root will be null
Node LCA(Node root, Node p, Node q)
{
  hash_set<Node> visited;
  while (p!=null || q!=null)
  {
    if (p!=null)
    {
     	if (!visited.insert(p).second)
        	return p; // insert p failed (p exists in the table)
     	p = p.parent;
    }
    if (q)
    {
     	if (!visited.insert(q).second)
        	return q; // insert q failed (q exists in the table)
      	q = q.parent;
    }
  }
  return NULL;
}

//Using Height
int getHeight(Node p)
{
  int height = 0;
  while (p!=null)
  {
   	height++;
    p = p.parent;
  }
  return height;
}
 
// As root->parent is NULL, we don't need to pass root in.
Node LCA(Node p, Node q)
{
  int h1 = getHeight(p);
  int h2 = getHeight(q);
  // swap both nodes in case p is deeper than q.
  if (h1 > h2)
  {
    swap(h1, h2);
    swap(p, q);
  }
  // invariant: h1 <= h2.
  int dh = h2 - h1;
  for (int h = 0; h < dh; h++)
    q = q.parent;
  while (p && q)
  {
    if (p == q)
    	return p;
    p = p.parent;
    q = q.parent;
  }
  return NULL;  // p and q are not in the same tree
}