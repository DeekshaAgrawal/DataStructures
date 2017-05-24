package binarytree;

class Node{
	int key;
	Node left,right;
	Node(int k)
	{
		key=k;
		right=left=null;	
	}
}
public class BinaryTreeImp {
	Node root;
	BinaryTreeImp(){
		root=null;
	}
	BinaryTreeImp(int k)
	{
		root= new Node(k);
	}

	public static void main(String[] args)
	{
		BinaryTreeImp tree= new BinaryTreeImp();
		tree.root=new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
	}
}
