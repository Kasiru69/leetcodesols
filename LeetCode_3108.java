import java.util.*;
public class LeetCode_3108{
    public static HashMap<Integer,Integer> map;
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        List<List<int[]>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int it[]:edges){
            arr.get(it[0]).add(new int[]{it[1],it[2]});
            arr.get(it[1]).add(new int[]{it[0],it[2]});
        }
        Integer group[]=new Integer[n];
        map=new HashMap<>();
        int cnt=1;
        for(int i=0;i<n;i++){
            if(group[i]==null){
                dfs(arr,i,cnt,group);
                cnt++;
            }
        }
        for(int it[]:edges){
            int grp=group[it[0]];
            if(!map.containsKey(grp)) map.put(grp,it[2]);
            else map.put(grp,map.get(grp)&it[2]);
        }
        int ans[]=new int[query.length];
        for(int i=0;i<query.length;i++){
            if(n<300 && group[query[i][0]]!=group[query[i][1]]){
                ans[i]=-1;
                continue;
            }
            ans[i]=map.get(group[query[i][0]]);
        }
        return ans;
    }
    public void dfs(List<List<int[]>> arr,int u,int cnt,Integer grp[]){
        grp[u]=cnt;
        for(int it[]:arr.get(u)){
            if(grp[it[0]]==null) {
                dfs(arr,it[0],cnt,grp);
            }
        }
    }
    public static void main(String args[]){

    }
}