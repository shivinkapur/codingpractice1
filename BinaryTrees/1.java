public void build123a()
{
	root=new Node(2);
	Node lchild=new Node(1);
	Node rchild=new Node(3);
	root.left=lchild;
	root.right=rchild;
}
public void build123b()
{
	root=new Node(2);
	root.left=new Node(1);
	root.right=new Node(3);
}
public void build123c()
{
	root=null;
	root=insert(root,2);
	root=insert(root,1);
	root=insert(root,3);
}