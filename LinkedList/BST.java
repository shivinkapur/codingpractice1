import java.util.*;
import java.io.*;
class Node
{
	private int data;
	private Node left,right;
	int getData()
	{
		return data;
	}
	Node getLeft()
	{
		return left;
	}
	Node getRight()
	{
		return right;
	}
	void setData(int d)
	{
		data=d;
	}
	void setLeft(Node l)
	{
		left=l;
	}
	void setRight(Node r)
	{
		right=r;
	}
}

class BST
{
	Node root;
	void insert(int v)
	{
		Node t=new Node();
		t.setData(v);
		if(root==null)
			root=t;
		else
		{
			Node p=root,prev=null;
			while(p!=null)
			{
				prev=p;
				if(p.getData()>v)
					p=p.getLeft();
				else
					p=p.getRight();	
			}
			if(prev.getData()>v)
				prev.setLeft(t);
			else
				prev.setRight(t);	
		}	
	}
	void preorder()
	{
		preorder(root);
	}
    private void preorder(Node p)
    {
    	if(p==null)
    		return;
    	else
    	{
    		System.out.print(p.getData()+" ");
    		preorder(p.getLeft());
    		preorder(p.getRight());
    	}	
    }
    	void inorder()
	{
		inorder(root);
	}
    private void inorder(Node p)
    {
    	if(p==null)
    		return;
    	else
    	{
    		inorder(p.getLeft());
    		System.out.print(p.getData()+" ");
    		inorder(p.getRight());
    	}	
    }
    	void postorder()
	{
		postorder(root);
	}
    private void postorder(Node p)
    {
    	if(p==null)
    		return;
    	else
    	{
    		postorder(p.getLeft());
    		postorder(p.getRight());
    		System.out.print(p.getData()+" ");
    	}	
    }
    boolean delete(int v)
    {
    	Node p=root,prev=null;
    	while(p!=null)
    	{
    		if(p.getData()==v)
    			break;
    		prev=p;
    		if(p.getData()>v)
    			p=p.getLeft();
    		else
    			p=p.getRight();		
    	}
    	if(p==null)
    		return false;
        if(p.getLeft()!=null&&p.getRight()!=null)
        {
        	prev=p;
        	Node succ=p.getRight();
        	while(succ.getLeft()!=null)
        	{
        		prev=succ;
        		succ=succ.getLeft();
        	}
		p.setData(succ.getData());
		p=succ;

        /*	succ.setData(p.getData());
        	if(succ.getLeft()!=null&&p.getRight()==succ)
        		p.setRight(succ.getLeft());
        	else if(succ.getLeft()!=null&&p.getLeft()==succ)
        		p.setLeft(succ.getLeft());
        	else if(succ.getRight()!=null&&p.getRight()==succ)
        		p.setRight(succ.getRight());
        	else
        		p.setLeft(succ.getRight());				
        */
	}
        if(p==root)
        {
        	if(p.getLeft()!=null)
        		root=p.getLeft();
        	else
        		root=p.getRight();
        }
        else if(p.getLeft()!=null&&p.getRight()==null)
        {
        	if(prev.getRight()==p)
        		prev.setRight(p.getLeft());
        	else
        		prev.setLeft(p.getLeft());	
        }
        else if(p.getLeft()==null&&p.getRight()!=null)
        {
        	if(prev.getRight()==p)
        		prev.setRight(p.getRight());
        	else
        		prev.setLeft(p.getRight());	
        }
        else if(p.getLeft()==null&&p.getRight()==null)
        {
        	if(prev.getLeft()==p)
        		prev.setLeft(null);
        	else
        		prev.setRight(null);	
        }
        return true;
        		
    }
}

class BSTDemo
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		BST x=new BST();
		int choice;
		do
		{
			System.out.println("enter 1 to insert 2 to delete 3 to quit ");
			choice=sc.nextInt();
			if(choice==1)
			{
			  System.out.print("Enter Node ");
			  x.insert(sc.nextInt());
			}
			else if (choice==2)
			{
				System.out.print("Enter Node to be deleted ");
				x.delete(sc.nextInt());
			}
				
			else if(choice==3)
			break;  
		}while(true);
		x.preorder();
		x.inorder();
		x.postorder();
	}
}