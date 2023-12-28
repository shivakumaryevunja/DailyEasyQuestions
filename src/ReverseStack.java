import java.util.Scanner;

/*Given an input sequence of characters stored in a stack and the stack is created using a linked list.
 Write a code to reverse the elements within the stack without using any auxiliary memory or recursive algorithm.
 Your code should take following lines of input:
  - The number of elements to be reversed in the stack.
  - The elements to be reversed in the stack.
*/
public class ReverseStack {

    class Node{
        Node next;
        char data;

        Node(char x){
            this.data = x;
            this.next = null;
        }
    }
    Node top;

    public void push(char x){
        Node new_node = new Node(x);
        if(top == null){
            top = new_node;
        }else{
            new_node.next = top;
            top = new_node;
        }
    }

    public Node pop(){
        Node node = top;
        top = top.next;
        return node;
    }

    public void display(Node node){
        Node temp = node;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //Reversing the stack using simple linkedList
    //reversal logic
    public Node reverse(){
        if(top == null){
            System.out.println("Stack is Empty");
            return null;
        }else{
            //Here we use three node to reverse the stack

            Node current, prev, next;
            /* Current traverses the node one by one and changes its reference such that it points to its previous node now.
               Previous keeps record of the node that exists just before the current node and
               next keeps the record of node just after the current node.*/

            current = prev = top;
            current = current.next;
            prev.next = null;

            while(current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            top = prev;
            return top;

        }
    }


    public static void main(String[] args){
        ReverseStack obj = new ReverseStack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.top);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        obj.display(temp);
    }
}
