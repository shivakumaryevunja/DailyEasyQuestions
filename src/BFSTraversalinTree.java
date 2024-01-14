public class BFSTraversalinTree {
    // Breadth First search in tree data structure using recursive method
    public static void main(String[] args){

        Tree1 tree = new Tree1();
        tree.root = new Node1(1);
        tree.root.left = new Node1(6);
        tree.root.right = new Node1(8);

        tree.root.right.right = new Node1(7);

        tree.root.left.left = new Node1(2);
        tree.root.left.right = new Node1(5);

        tree.root.left.right.left = new Node1(4);
        tree.root.left.right.right = new Node1(3);

        System.out.println("Leve Order Traversal: ");
        tree.levelOrderBFS(tree.root);
    }
}

class Node1{
    int data;
    Node1 right,left;
    Node1(int v){
        data = v;
        left = right = null;
    }
}

class Tree1{
    Node1 root;
    Tree1(){
        root = null;
    }

    int height(Node1 node){
        if(node == null){
            return 0;
        }

        int heightLeft = 1 + height(node.left);
        int heightRight = 1 + height(node.right);

        if(heightLeft > heightRight){
            return  heightLeft;
        }else{
            return heightRight;
        }
    }

    void levelOrderBFS(Node1 node){
        int h = height(node);
        for(int i = 1;i<=h;i++){
            printNodeAtLevel(node,i,1);
        }
    }

    void printNodeAtLevel(Node1 node,int level,int currentLevel){
        if (node == null) {
            return;
        }
        if(level == currentLevel){
            System.out.print(node.data+" ");
        }else{
            printNodeAtLevel(node.left,level,currentLevel+1);
            printNodeAtLevel(node.right,level,currentLevel+1);
        }
    }
}