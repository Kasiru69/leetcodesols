import java.util.*;
public class LeetCode_3151{
    public boolean isArraySpecial(int[] a) {
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2==a[i+1]%2) return false;
        }
        return true;
    }
    public static void main(String args[]){

    }
}