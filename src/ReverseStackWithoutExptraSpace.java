//Reverse a stack without using extra space and time complexity using O(n)

class StackNode{
    int data;
    StackNode next;
    StackNode(int d){
        this.data = d;
        this.next = null;
    }
}

class StackNew {
    StackNode top;
    public void push(int data) {
        if(this.top == null){
            top = new StackNode(data);
            return;
        }
        StackNode s = new StackNode(data);
        s.next = this.top;
        this.top = s;
    }

    public StackNode pop(){
        StackNode s = this.top;
        this.top = this.top.next;
        return s;
    }

    public void display(){
        StackNode s = this.top;
        while(s!= null){
            System.out.print(s.data+ " ");
            s = s.next;
        }
        System.out.println();
    }

    public void reverse(){
        StackNode prev,curr,newNext;
        curr = prev = this.top;
        curr = curr.next;
        prev.next = null;
        while(curr != null){
            newNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNext;
        }
        this.top = prev;
    }
}
public class ReverseStackWithoutExptraSpace {
    public static void main(String[] args) {
        StackNew s = new StackNew();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.display();

        // reverse
        s.reverse();

        System.out.println("Reversed Stack");
        s.display();
    }

}