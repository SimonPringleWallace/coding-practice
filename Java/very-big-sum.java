public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long total = 0;
            for(int i = 0; i <= ar.length -1; i++)
            {
                total += ar[i];
            }
return total;
    }
