import java.util.*;
public class Leetcode_2661{
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int i,n=mat.length,m=mat[0].length,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                map.put(mat[i][j],new ArrayList<>());
                map.get(mat[i][j]).add(i);
                map.get(mat[i][j]).add(j);
            }
        }
        int a[]=new int[n]; int b[]=new int[m];
        for(i=0;i<arr.length;i++)
        {
            ArrayList<Integer> tmp=map.get(arr[i]);
            a[tmp.get(0)]++;
            b[tmp.get(1)]++;
            if(a[tmp.get(0)]==m || b[tmp.get(1)]==n) return i;
        }
        return -1;
    }
    public static void main(String args[]){

    }
}