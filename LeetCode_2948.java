import java.util.*;
public class LeetCode_2948{
    public int[] lexicographicallySmallestArray(int[] num, int limit) {
        int a[][]=new int[num.length][2];
        int n=num.length;
        for(int i=0;i<n;i++){
            a[i][0]=num[i];
            a[i][1]=i;
        }
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int i=0,cnt=0;
        int ans[]=new int[n];
        while(i<n){
            int j=i;
            ArrayList<Integer> arr=new ArrayList<>();
            while(j<n-1){
                if(a[j+1][0]-a[j][0]<=limit) arr.add(a[j][1]);
                else{
                    arr.add(a[j][1]);
                    break;
                }
                j++;
            }
            if(j==n-1) arr.add(a[j][1]);
            Collections.sort(arr);
            for(int x=0;x<arr.size();x++) ans[arr.get(x)]=a[cnt++][0];
            i=j+1;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}