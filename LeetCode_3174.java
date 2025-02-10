import java.util.*;
public class LeetCode_3174{
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char it:s.toCharArray()){
            if(it>='a' && it<='z') st.add(it);
            if(it>='0' && it<='9') st.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String args[]){

    }
}