public boolean hasPathSum(int sum)
{
	return hasPathSum(root,sum)
}
private boolean hasPathSum(Node node,int sum)
{
	if(node==null)
	{
		if(sum==0)
			return true;
		else return false;
	}
	else
	{
		int subSum=sum-node.data;
		return (hasPathSum(node.left,subSum) || hasPathSum(node.right,subSum));
	}		
}