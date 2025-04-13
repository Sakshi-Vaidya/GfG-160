package Arrays;

public class maxSubarraySum {
        static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
          
            // Update res if maximum subarray sum ending at index i > res
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}