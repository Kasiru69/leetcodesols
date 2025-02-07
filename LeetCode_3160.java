import java.util.*;
public class LeetCode_3160{
    public int[] queryResults(int limit, int[][] que) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int ans[]=new int[que.length];
        for(int i=0;i<que.length;i++){
            if(map2.containsKey(map1.getOrDefault(que[i][0],-1))){
                if(map1.containsKey(que[i][0])){
                    map2.put(map1.get(que[i][0]),map2.get(map1.get(que[i][0]))-1);
                    if(map2.get(map1.get(que[i][0]))==0)
                    map2.remove(map1.get(que[i][0]));
                }
            }
            map1.put(que[i][0],que[i][1]);
            map2.put(map1.get(que[i][0]),map2.getOrDefault(map1.get(que[i][0]),0)+1);
            ans[i]=map2.size();
        }
        return ans;
    }
    public static void main(String args[]){

    }
}