public class Main {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4);
        tree.insert(8);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(5);
        tree.insert(9);

        System.out.println("The lease common ancestor of 9 and 1 is " + tree.findLCA(9,1).getData()) ;
        System.out.println("The lease common ancestor of 4 and 8 is " + tree.findLCA(4,8).getData()) ;
    }
    //Define Binary Search Tree Node
    static class BSTNode
    {
        public BSTNode(int d )
        {
            data = d;
            left = null;
            right = null;
        }
        public BSTNode(int d, BSTNode l, BSTNode r)
        {
            data = d;
            left = l;
            right = r;
        }
        public int getData()
        {
            return data;
        }
        public void setData(int d)
        {
            data = d;
        }

        public BSTNode getLeft()
        {
            return left;
        }

        public void setLeft(BSTNode l)
        {
            left = l;
        }
        public BSTNode getRight()
        {
            return right;
        }

        public void setRight(BSTNode r)
        {
            right = r;
        }
        private int data; //data
        private BSTNode left; //left subtree
        private BSTNode right; //right subtree
    }
    //Define Binary Search Tree
    static class BinarySearchTree
    {
        public BinarySearchTree()
        {
            root = null;
        }
        public BSTNode getRoot()
        {
            return root;
        }
        //Finds the least common ancestor for the given two nodes
        public BSTNode findLCA(int a, int b)
        {
            //Find the two nodes with given values
            BSTNode nodeA = find(a);
            BSTNode nodeB = find(b);

            BSTNode r = root;

            while ( r != null )
            {
                if( r.getData() < a && r.getData() < b )
                    r = r.getRight();
                else if( r.getData() > a && r.getData() > b)
                    r = r.getLeft();
                else
                    break;
            }
            return r;
        }
        //Finds the BST node with the given data
        public BSTNode find(int d)
        {
            BSTNode r = root;

            while ( r != null && r.getData() != d )
            {
                if( r.getData() == d )
                    break;
                else if( r.getData() < d )
                    r = r.getRight();
                else
                    r = r.getLeft();
            }
            return r;
        }
        //inserts the given data into a BST
        public void insert(int d)
        {
            if( root == null )
            {
                root = new BSTNode(d);
            }
            else
            {
                BSTNode current = root;
                BSTNode prev = null;
                while( current != null )
                {
                    prev = current;
                    if( current.getData() < d )
                    {
                        current = current.getRight();
                    }
                    else
                    {
                        current = current.getLeft();
                    }
                }
                if( d < prev.getData() )
                {
                    prev.setLeft( new BSTNode(d));
                }
                else
                {
                    prev.setRight(new BSTNode(d));
                }
            }
        }
        private BSTNode root;
    }
}