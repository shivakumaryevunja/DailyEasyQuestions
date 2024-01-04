import java.util.Stack;
public class InfixToPostfix {
    //this code is to convert infix to postfix expression

    //function to return the precedence of operators
    static int prec(char c){
        if(c == '^'){
            return 3;
        }else if(c == '/' || c == '*'){
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        }else{
            return -1;
        }
    }

    //function to return the associativity of operators
    static char assoc(char c){
        if(c == '^'){
            return 'R';
        }else{
            return 'L';
        }
    }

    //function to convert infix to postfix expression

    static void infixToPostfix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //adding the operands to the result
            if(c >= 'a' && c <= 'z' || c>='A' && c<='Z' || c>='0' && c<='9'){
                result.append(c);
            }else if(c == '('){
                stack.push(c);   //if the character is ( then push it to the stack
            }else if( c == ')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                }
                stack.pop(); //this pops the ( bracket
            }else{
                //checking the precedence of the operator
                while(!stack.isEmpty() && (prec(s.charAt(i)) < prec(stack.peek())  ||
                        prec(s.charAt(i)) == prec(stack.peek()) && assoc(s.charAt(i)) == 'L')){
                        result.append(stack.pop());
                }

                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            result.append(stack.pop());  //remaining elements in the stack are popped out
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        String exp = "a+b*c+d";
        infixToPostfix(exp);
    }
}
