import java.util.*;
public class LeetCode_2529{
    public int maximumCount(int[] a) {
        int pos=0,neg=0;
        for(int it:a){
            if(it>0) pos++;
            if(it<0) neg++;
        }
        return Math.max(pos,neg);
    }
    public static void main(String args[]){

    }
}