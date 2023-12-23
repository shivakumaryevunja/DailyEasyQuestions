import java.util.Stack;
public class ReverseStringusingStack {
    public static void main(String[] args){
        String str = "Hello world";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                st.push(str.charAt(i));
            }else{
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
