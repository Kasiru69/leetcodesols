import java.util.*;
public class LeetCode_2460{
    public int[] applyOperations(int[] a) {
        int n=a.length,i,j,c=0;
        int b[]=new int[n];
        for(i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                a[i]=a[i]*2;
                a[i+1]=0;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
                b[c++]=a[i];
        }
        return b;
    }
    public static void main(String args[]){

    }
}