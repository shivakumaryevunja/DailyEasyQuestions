
import java.util.Stack;
public class ReverseStackusingRecursion {

    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        reverse(st);

        insertBottom(temp,st);
    }

    public static void insertBottom(int temp, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }

        int topElem = stack.pop();
        insertBottom(temp,stack);
        stack.push(topElem);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);

        System.out.println(st);

        reverse(st);

        System.out.println(st);
    }

}
