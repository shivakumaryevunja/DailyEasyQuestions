import java.util.EmptyStackException;
import java.util.Stack;
// in this program we're matching the parenthesis of different type
public class ParenthesisMatchingUsingStack {
    public static void main(String[] args){
        try {
            System.out.println(match("(()((()(()))(()()"));
            System.out.println(match("{[(}"));
            System.out.println(match("[{{{{{{{}}}}}}}]"));
            System.out.println(match("{{{{{{{}}}}}}}"));
            System.out.println(match("{{{{{{}}}}}}}"));
            System.out.println(match("{{{{{{}}}}}}}"));
            System.out.println(match("{{{{}{{{{}}}}}}}"));
            System.out.println(match("{{({}{{{{}}}})}}"));
            System.out.println(match("{{({}{{{{}}})}}}"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static Stack<Character> stack = new Stack<Character>();
    public static boolean match(String paren) throws Exception{
        for(char a: paren.toCharArray()){
            if(a == '(' || a=='{' || a== '['){
                stack.push(a);
            }else if(a == ')'){
                try {
                    char t = stack.pop();
                    if (t != '(') {
                        return false;
                    }
                }catch (EmptyStackException e){
                    System.out.println("empty");
                    return false;
                }
            }else if(a == '}'){
                try {
                    char t = stack.pop();
                    if (t != '{') {
                        return false;
                    }
                }catch (EmptyStackException e){
                    return false;
                }
            }else if(a == ']'){
                try {
                    char t = stack.pop();
                    if (t != '[') {
                        return false;
                    }
                }catch (EmptyStackException e){
                    return false;
                }
            }else{
                throw new Exception("invalid character "+stack.peek());
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
