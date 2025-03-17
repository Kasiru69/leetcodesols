import java.util.*;
public class LeetCode_2594{
    public long repairCars(int[] rank, int car) {
        long low=0,high=(long)1e18;
        while(high>=low){
            long mid=(low+high)>>1;
            long cnt=0L;
            for(int it:rank)
            cnt+=(long)Math.sqrt(mid/(long)it);
            if(cnt>=car) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public static void main(String args[]){

    }
}