//LCA of a BST
private Node lcabst(int p,int q)
{
	lcabst(root,p,q);
	lcabstiterative(root,p,q);
}
public Node lcabst(Node node,int p,int q)
{
	if(node==null)
		return null;
	if(node.data>p && node.data>q)
		lcabst(node.left,p,q);
	if(node.data<p && node.data<q)
		lcabst(node.right,p,q);
	return root;
}
//iterative solution
public Node lcabstiterative(Node node,int p,int q)
{
	while(node!=null)
	{
		if(node.data>p && node.data>q)
			node=node.left;
		else if(node.data<p && node.data<q)
			node=node.right;
		else break;
	}
	return node;
}