import java.util.EmptyStackException;
// in this we are implementing stack using array
public class ImplementationOfStackUsingArrays {
     public static void main(String[] args){
         Stack<String> stack = new Stack<>(5);
         System.out.println("is Empty: "+stack.isEmpty());
         stack.push("John");
         stack.push("Vishnu");
         stack.push("Joy");
         System.out.println("is Empty: "+stack.isEmpty());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
         System.out.println(stack.pop());
     }
}

class Stack<T>{
    T[] arr;
    int capacity;
    int index;
    Stack(int capacity){
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        index = -1;
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public boolean isFull() {
        return index == (capacity - 1);
    }

    public T push(T data){ // time complexity - O(1)
        if(isFull()){
            throw new StackOverflowError("Stack Already on Full capacity");
        }
        return arr[++index] = data;
    }

    public T pop(){ // time complexity - O(1)
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arr[index--];
    }
}
