class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) {
            return ans;
        }

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                ans[i] = sum;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= -1 * k; j++) {
                    sum += code[(i - j + n) % n];

                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}