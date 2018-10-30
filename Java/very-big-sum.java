// Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
//
// Function Description -------
//
// Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
//
// aVeryBigSum has the following parameter(s):
//
// ar: an array of integers .

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
