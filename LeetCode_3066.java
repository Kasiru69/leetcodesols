import java.util.*;
public class LeetCode_3066{
    public int minOperations(int[] arr, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int it:arr) pq.add((long)it);
        long ans=0;
        while(pq.size()>0){
            long it=pq.poll();
            long a=it;
            if(a>=k) break;
            //yoooo
            ans++;
            if(pq.size()==0) break;
            it=pq.poll();
            long b=it;
            if(b>=k) break;
            long ok=Math.min(a,b)*2+Math.max(a,b);
            pq.add(ok);
        }
        return (int)ans;
    }
    public static void main(String args[]){

    }
}