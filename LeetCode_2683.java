import java.util.*;
public class LeetCode_2425{
    public boolean doesValidArrayExist(int[] derived) {
        int ans=0;
        for(int it:derived) ans^=it;
        return (ans==0);
    }
    public static void main(String args[]){

    }
}