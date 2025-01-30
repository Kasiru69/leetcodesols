import java.util.*;
public class LeetCode_2493{
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0] - 1).add(e[1] - 1);
            adj.get(e[1] - 1).add(e[0] - 1);
        }
        int[] color = new int[n];
        Arrays.fill(color, -1);
        List<List<Integer>> components = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                List<Integer> component = new ArrayList<>();
                if (!dfs(i, 0, adj, color, component))
                    return -1;
                components.add(component);
            }
        }
        int ans=0;
        for (List<Integer> comp : components)
            ans+= bfs(n,comp, adj);
        return ans;
    }
    public boolean dfs(int node, int col, List<List<Integer>> adj, int[] color, List<Integer> comp) {
        color[node] = col;
        comp.add(node);
        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == col) {
                return false;
            }
            if (color[neighbor] == -1 && !dfs(neighbor, 1 - col, adj, color, comp)) {
                return false;
            }
        }
        return true;
    }
    
    public int bfs(int n,List<Integer> comp, List<List<Integer>> adj) {
        int max= 0;
        for (int start : comp) {
            int vis[]=new int[n+1];
            Queue<Integer> que = new LinkedList<>();
            que.add(start);
            vis[start]=1;
            int dep=0;
            while (!que.isEmpty()) {
                int size=que.size();
                while(size-->0){
                    int top=que.poll();
                    for(int it:adj.get(top)){
                        if(vis[it]==0){
                            vis[it]=1;
                            que.add(it);
                        }
                    }
                }
                dep++;
            }
            max=Math.max(max,dep);
        }
        return max;
    }
    public static void main(String args[]){

    }
}