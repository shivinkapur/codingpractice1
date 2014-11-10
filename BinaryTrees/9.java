public void mirror()
{
	mirror(root);
}
private void mirror(Node node)
{
	if(node!=null)
	{
		mirror(node.left);
		mirror(node.right);

		Node temp=node.left;
		node.left=node.right;
		node.right=temp;
	}
}