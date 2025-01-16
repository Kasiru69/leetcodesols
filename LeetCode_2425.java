import java.util.*;
public class LeetCode_2425{
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0,xor2=0;
        for(int it:nums1) xor1^=it;
        for(int it:nums2) xor2^=it;
        if(nums2.length%2==0) xor1=0;
        if(nums1.length%2==0) xor2=0;
        return xor1^xor2;
    }
    public static void main(String args[]){

    }
}