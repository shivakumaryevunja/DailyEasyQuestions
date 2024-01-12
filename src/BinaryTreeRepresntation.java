public class BinaryTreeRepresntation {
    //Variant traversal in Depth First Search(DFS) :
    //pre-Order, in-Order, post-Order
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(4);

        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(3);



        System.out.print("Pre-Order: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("In-Order: ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Post-Order: ");
        tree.postOrder(tree.root);
    }
}

class Node{
    int data;
    Node left, right;
    Node(int val){
        this.data = val;
        left = right = null;
    }
}

class Tree{
    Node root;
    Tree(){
        this.root = null;
    }

    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" "); // prints the parent of left and right subtree

        preOrder(node.left); //traverse to the left subtree

        preOrder(node.right); //traverse to roght subtree
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left); //traverse to left subtree

        System.out.print(node.data+" "); //prints the root of the left and right subtree

        inOrder(node.right); //traverse to the right subtree
    }

    void postOrder(Node node){
        if(node == null)
            return;

        postOrder(node.left);

        postOrder(node.right);

        System.out.print(node.data+" ");
    }
}
