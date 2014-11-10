//the leaf becomes the root, and tree is twisted
public Node printReverse()
{
	 return printReverse(root,root.left,root.right);
}
private Node printReverse(Node r,Node lr,Node rr)
{
	if(r==null)
		return lr;
	else
	{
		Node newlr=r;
		Node newr=newlr.left;
		Node newrr=newlr.right;
		return printReverse(newr,newlr,newrr);
	}	
}