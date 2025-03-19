import java.util.*;
public class LeetCode_2401{
    public int longestNiceSubarray(int []a) {
        int i=0,j=0,n=a.length,ans=1;
       label: while(j<n)
        {
            for(int k=i;k<j;k++)
            {
                if((a[j]&a[k])>0)
                {
                    i++;
                    continue label;
                }    
            }
           j++;
           ans=Math.max(ans,j-i);
        }
        return ans;
    }
    public static void main(String args[]){

    }
}