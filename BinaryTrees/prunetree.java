public Node prune(Node root,int k)
{
  int sum=0;
  prune(root,k,sum);
}
private Node prune(Node node,int k, int sum)
{
  if(node==null)
    return null;
  int lsum=sum+node.data;
  int rsum=lsum;

  node.left=prune(node.left,k,lsum);
  node.right=prune(node.right,k,rsum);

  if(sum<k)
  {
    delete(node);
    root=null;
  }
  return node;
}
/*
Given a binary tree, a complete path is defined as a path from root to a leaf. The sum of all nodes on that path is defined as the sum of that path. Given a number K, you have to remove (prune the tree) all nodes which don’t lie in any path with sum>=k.

Note: A node can be part of multiple paths. So we have to delete it only in case when all paths from it have sum less than K.

Consider the following Binary Tree
          1 
      /      \
     2        3
   /   \     /  \
  4     5   6    7
 / \    /       /
8   9  12      10
   / \           \
  13  14         11
      / 
     15 

For input k = 20, the tree should be changed to following
(Nodes with values 6 and 8 are deleted)
          1 
      /      \
     2        3
   /   \        \
  4     5        7
   \    /       /
    9  12      10
   / \           \
  13  14         11
      / 
     15 
*/