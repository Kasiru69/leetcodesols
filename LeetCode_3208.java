import java.util.*;
public class LeetCode_3208{
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int a[]=new int[colors.length+k-1];
        for(int i=0;i<colors.length;i++) a[i]=colors[i];
        for(int i=colors.length;i<colors.length+k-1;i++) a[i]=colors[i%colors.length];
        int left=0,right=0,n=a.length,ans=0;
        while(right<n){
            if(right>0 && a[right]==a[right-1]) left=right;
            if((right-left+1)>=k) ans++;
            right++;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}