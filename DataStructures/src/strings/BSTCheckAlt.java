package strings;
class Node
{
    int data;
    Node1 left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class BSTCheckAlt
{
    // Root of the Binary Tree
    Node1 root;
 
    // To keep tract of previous node in Inorder Traversal
    Node1 prev;
 
    boolean isBST()  {
        prev = null;
        return isBST(root);
    }
 
    /* Returns true if given search tree is binary
       search tree (efficient version) */
    boolean isBST(Node1 node)
    {
        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null)
        {
            if (!isBST(node.left))
                return false;
 
            // allows only distinct values node
            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BSTCheckAlt tree = new BSTCheckAlt();
        tree.root = new Node1(4);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(5);
        tree.root.left.left = new Node1(1);
        tree.root.left.right = new Node1(3);
 
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}