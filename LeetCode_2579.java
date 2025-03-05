import java.util.*;
public class LeetCode_2579{
    public long coloredCells(int n) {
        long x=((long)(n-1)*(4L+(4L*(long)(n-1))))/2L;
        return x+1;
    }
    public static void main(String args[]){

    }
}