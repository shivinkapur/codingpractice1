public void printPaths()
{
	int[] path=new int[1000];
	printPaths(root,path,0);
}
private void printPaths(Node node,int[] path,int pathLength)
{
	if(node==null)
		return;
	path[pathLength]=node.data;
	pathLength++;
	if(node.left==null)
		printArray(path,pathLength);
	else
	{
		printPaths(node.left,path,pathLength);
		printPaths(node.right,path,pathLength);
	}
}
private void printArray(int[] path,int pathLength)
{
	for(int i=0;i<pathLength;i++)
		System.out.println(path[i]+" ");
	System.out.println();
}