import java.util.*;
public class LeetCode_2570{
    public int[][] mergeArrays(int[][] a, int[][] b) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int it[]:a){
            map.put(it[0],it[1]);
        }
        for(int it[]:b){
            map.put(it[0],map.getOrDefault(it[0],0)+it[1]);
        }
        //System.out.println(map);
        int ans[][]=new int[map.size()][2];
        int c=0;
        for(Integer it:map.keySet()){
            ans[c][0]=it;
            ans[c][1]=map.get(it);
            c++;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}