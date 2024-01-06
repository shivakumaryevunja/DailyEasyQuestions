import java.util.HashMap;
public class FindingFirstUniqueCharacter {
    public static void main(String[] args){
        String str = "adcbdace";
        HashMap<Character,Integer> h = new HashMap<>();

        int n = str.length();
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(h.containsKey(c) == false){
                h.put(c,1);
            }else{
                h.put(c,h.get(c)+1);
            }
        }

        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(h.get(c) == 1){
                System.out.println(c+" is the unique charater in this string: "+str);
                break;
            }
        }
    }
}
