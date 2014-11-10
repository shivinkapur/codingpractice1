public boolean isBST()
{
	return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
private boolean isBST(Node node,int min, int max)
{
	if(node==null)
		return false;
	else
	{
		boolean leftOK=isBST(node.left,min,node.data);
		if(!leftOK)
			return false;
		boolean rightOK=isBST(node.right,node.data,max);
		return rightOK;
	}
}