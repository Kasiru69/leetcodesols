import java.util.*;
public class LeetCode_2568{
    public int findMaxFish(int[][] a) {
        int n=a.length,m=a[0].length,i,j,ans=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]==0) continue;
                int val=dfs(a,i,j,n,m);
                ans=Math.max(ans,val);
            }
        }
        return ans;
    }
    public int dfs(int a[][],int i,int j,int n,int m)
    {
        if(i<0 || j<0 || i==n || j==m) return 0;
        if(a[i][j]==0) return 0;
        int sum=a[i][j];
        a[i][j]=0;
        sum+=dfs(a,i+1,j,n,m);
        sum+=dfs(a,i,j+1,n,m);
        sum+=dfs(a,i-1,j,n,m);
        sum+=dfs(a,i,j-1,n,m);
        return sum;
    }
    public static void main(String args[]){

    }
}