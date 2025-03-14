import java.util.*;
public class LeetCode_3356{
    public int minZeroArray(int[] a, int[][] que) {
        int low=0,high=que.length,i,n=a.length;
        while(high>=low){
            int mid=(low+high)>>1,cnt=0;
            int freq[]=new int[n+1];
            for(i=0;i<mid;i++){
                int it[]=que[i];
                freq[it[0]]+=it[2];
                freq[it[1]+1]-=it[2];
            }
            boolean flag=true;
            for(i=0;i<n;i++){
                cnt+=freq[i];
                if(a[i]>cnt) flag=false;
            }
            if(!flag) low=mid+1;
            else high=mid-1;
        }
        if(low>que.length) return -1;
        return low;
    }
    public static void main(String args[]){

    }
}