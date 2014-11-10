public void printTree()
{
	printTree(root);
}
private void printTree(Node node)
{
	if(node==null)
		return
	printTree(node.left);
	System.out.println(node.data+" ");
	printTree(node.right);
}