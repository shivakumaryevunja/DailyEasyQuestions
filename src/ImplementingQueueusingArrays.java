public class ImplementingQueueusingArrays {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<>(6);

        queue.enqueue(22);
        queue.enqueue(44);
        queue.enqueue(66);
        queue.enqueue(77);

        queue.queueDisplay();

        queue.dequeue();
        System.out.println();
        System.out.println("After removing the first element:");
        queue.queueDisplay();

    }
}

class Queue<T>{
    private int rear, front, capacity;
    private T[] arr;

    Queue(int c){
        front = rear = 0;
        this.capacity = c;
        arr = (T[]) new Object[capacity];
    }

    public void enqueue(T e){
        if(capacity == rear){
            System.out.println("Queue is full");
            return;
        }else{
            arr[rear] = e;
            rear++;
        }
        return;
    }

    public void dequeue(){
        if(rear == front){
            System.out.println("Queue is empty");
            return;
        }else{
            for(int i=0;i<rear-1;i++){
                arr[i] = arr[i+1];
            }
            arr[rear] = (T) "0";
            rear--;
        }
        return;
    }

    public void queueDisplay(){   //for printing all the elements in the queue
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.print( arr[i]+" ");
        }
        return;
    }

    public void queueFront()
    {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: "+ arr[front]);
        return;
    }
}
