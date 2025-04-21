package Arrays;

public class getLastMoment {

    static int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;

        // Find the time to fall off the plank for all 
        // ants moving towards left
        for (int i = 0; i < left.length; i++) {
            res = Math.max(res, left[i]);
        }

        // Find the time to fall off the plank for all 
        // ants moving towards right
        for (int i = 0; i < right.length; i++) {
            res = Math.max(res, n - right[i]);
        }

        // Return the maximum time among all ants
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] left = {2};
        int[] right = {0, 1, 3};
        System.out.println(getLastMoment(n, left, right));
    }
}