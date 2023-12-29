import java.util.Queue;
import java.util.LinkedList;
public class SortingQueueWithoutExtraSpace {
    //Sorting the elements in the queue without using extra space

    public static int minIndex(Queue<Integer> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();

            // This is dequeue()
            list.poll();

            // we add the condition i <= sortIndex
            // because we don't want to traverse
            // on the sorted part of the queue,
            // which is the right part.
            if (current <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = current;
            }
            list.add(current); //here we add the element add the rear
        }
        return min_index;
    }

    public static void insertMinToRear(Queue<Integer> list,
                                       int min_index)
    {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            list.poll();
            if (i != min_index)
                list.add(current);
            else
                min_value = current;
        }
        list.add(min_value);
    }

    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() - i);
            insertMinToRear(list, min_index);
        }
    }


    public static void main (String[] args)
    {
        Queue<Integer> list = new LinkedList<Integer>();
        list.add(30);
        list.add(11);
        list.add(15);
        list.add(4);

        //Sort Queue
        sortQueue(list);
        System.out.println(list);
        //print sorted Queue
        while(list.isEmpty()== false)
        {
            System.out.print(list.peek() + " ");
            list.poll();
        }
    }
}
