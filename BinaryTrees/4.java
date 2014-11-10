public int minValue()
{
	return minValue(root);
}
private int minValue(Node node)
{
	Node current=node;
	while(current.left!=null)
		current=current.left;
	return current.data;
}