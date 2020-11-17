public class MaxSumSubarray {
    // Returns maximum sum in
    // a subarray of size k.
    static int maxSum(int arr[], int n, int k)
    {
        // Initialize result
        int max_sum = Integer.MIN_VALUE;
 
        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
				
            max_sum = Math.max(current_sum, max_sum);
        }
 
        return max_sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 2,1,5,1,3,2 };
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}