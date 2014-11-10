public boolean sameTree(BinaryTree other)
{
	return sameTree(root,other.root)
}
private boolean sameTree(Node a, Node b)
{
	if(a==null && b==null)
		return true;
	else if(a!=null && b!=null)
	{
		return (a.data==b.data
			&&	sameTree(a.left,b.left) 
			&&	sameTree(a.right,b.right));
	}
	else return false;
}