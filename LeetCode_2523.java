import java.util.*;
public class LeetCode_2523{
    public int[] closestPrimes(int low, int high) {
        if (high < 2) {
            return new int[]{-1, -1};
        }
        int[] prime = new int[high + 1];
        prime[0] = 1;
        prime[1] = 1;
        for (int j = 2 * 2; j <= high; j += 2) {
            prime[j] = 1;
        }
        int sqrtHigh = (int) Math.sqrt(high);
        for (int i = 3; i <= sqrtHigh; i += 2) {
            if (prime[i] == 0) {
                int step = i * 2;
                for (int j = i * i; j <= high; j += step) {
                    prime[j] = 1;
                }
            }
        }
        ArrayList<Integer> primesInRange = new ArrayList<>();
        for (int i = Math.max(low, 2); i <= high; i++) {
            if (prime[i] == 0) {
                primesInRange.add(i);
            }
        }
        if (primesInRange.size() < 2) {
            return new int[]{-1, -1};
        }
        int[] result = new int[]{-1, -1};
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < primesInRange.size() - 1; i++) {
            int current = primesInRange.get(i);
            int next = primesInRange.get(i + 1);
            int diff = next - current;
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = current;
                result[1] = next;
            }
        }
        return result;
    }
    public static void main(String args[]){

    }
}