public class InsertSortedLinkedList {
    // Insertion Sort for Singly Linked List
    //in this we add the new node in a sorted order
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    Node head;  //head of the LinkedList

    void sortedInsert(Node newNode){ // function to add new node in sorted order
        Node curr;
        if(head == null || head.data >= newNode.data){
            newNode.next = head;
            head = newNode;
        }else{
            curr = head;
            while(curr.next!= null && curr.next.data < newNode.data){
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    // funtion to create new Node
    Node newNode(int data){
        Node x = new Node(data);
        return x;
    }
    public static void main(String[] args){
        InsertSortedLinkedList list = new InsertSortedLinkedList();

        list.sortedInsert(list.newNode(2));
        list.sortedInsert(list.newNode(5));
        list.sortedInsert(list.newNode(7));
        list.sortedInsert(list.newNode(10));
        System.out.print("Orginal: ");
        list.printList();

        list.sortedInsert(list.newNode(9));
        System.out.println();
        System.out.print("Final: ");
        list.printList();
    }
}
