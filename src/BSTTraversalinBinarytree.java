public class BSTTraversalinBinarytree {
        //in the program searches the key in BST so the time complexity is always (log n)
    public static void main(String[] args){
        BST tree = new BST();

        tree.root = new Node2(4);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(6);
        tree.root.left.left = new Node2(1);
        tree.root.left.right = new Node2(3);
        tree.root.right.left = new Node2(5);
        tree.root.right.right = new Node2(7);

        System.out.println("In Order BST: ");
        tree.inOrder(tree.root);
        System.out.println();
        if(tree.searchBST(tree.root,11)){
            System.out.println("The key is present");
        }else{
            System.out.println("Not Found !!");
        }

    }
}
class Node2{
    int data;
    Node2 right,left;
    Node2(int val){
        this.data = val;
        right = left = null;
    }
}
class BST{
    Node2 root;
    BST(){
        root = null;
    }
    //function to print the tree in in-Order traversal
    void inOrder(Node2 node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    //function to search the key in BST
    boolean searchBST(Node2 node,int key){
        if(node == null){
           return false;
        }
        if(node.data == key){
            return true;
        }
        if(key < node.data){
            return searchBST(node.left,key);
        }else{
            return searchBST(node.right,key);
        }
    }
}
