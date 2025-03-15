import java.util.*;
public class LeetCode_2560{
    public int minCapability(int[] a, int k) {
        int min=(int)1e9,max=0;
        for(int it:a){
            min=Math.min(min,it);
            max=Math.max(max,it);
        }
        int low=min,high=max;
        while(high>=low)
        {
            int mid=(high+low)/2;
            int i=0,cnt=0;
            while(i<a.length){
                if(a[i]<=mid){
                    cnt++;
                    i+=2;
                }
                else i++;
            }
            if(cnt>=k)
                high=mid-1;
            else
                low=mid+1;
        }
        return high+1;
    }
    public static void main(String args[]){

    }
}