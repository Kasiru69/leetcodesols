import java.util.*;
public class LeetCode_2503{
    public int[] maxPoints(int[][] a, int[] queries) {
        int n=a.length,m=a[0].length;
        int que[][]=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            que[i][0]=queries[i];
            que[i][1]=i;
        }
        Arrays.sort(que,(x,y)->(x[0]-y[0]));
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->(x[2]-y[2]));
        pq.add(new int[]{0,0,a[0][0]});
        int dis[][]={{0, 1},{0, -1},{1, 0},{-1, 0}};
        int ans[]=new int[queries.length];
        int c=0,cnt=0;
        boolean vis[][]=new boolean[n][m];
        vis[0][0]=true;
        while(pq.size()>0){
            int size=pq.size();
            while(size-->0){
                int arr[]=pq.poll();
                while(c<queries.length && arr[2]>=que[c][0]){
                    ans[que[c][1]]=cnt;
                    c++;
                }
                if(c==queries.length) return ans;
                for(int it[]:dis){
                    int x=arr[0]+it[0],y=arr[1]+it[1];
                    if(x>=0 && x<n && y>=0 && y<m && !vis[x][y]){
                        vis[x][y]=true;
                        pq.add(new int[]{x,y,a[x][y]});
                    }
                }
                cnt++;
            }
        }
        while(c<queries.length){
            ans[que[c][1]]=cnt;
            c++;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}