public void doubleTree()
{
	doubleTree(root);
}
private void doubleTree(Node node)
{
	if(node!=null)
	{
		doubleTree(node.left);
		doubleTree(node.right);

		Node oldleft;
		oldleft=node.left;
		node.left=new Node(node.data);
		node.left.left=oldleft;
	}
}