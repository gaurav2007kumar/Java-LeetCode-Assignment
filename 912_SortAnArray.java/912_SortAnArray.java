class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return nums;
        }
        int m = n / 2;
        int[] a = new int[m];
        int[] b = new int[n - m];
        for (int i = 0; i < m; i++) {
            a[i] = nums[i];
        }
        for (int i = 0; i < n - m; i++) {
            b[i] = nums[m + i];
        }
        a = sortArray(a);
        b = sortArray(b);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n - m) {
            if (a[i] < b[j]) {
                nums[k] = a[i];
                i++;
            } else {
                nums[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            nums[k] = a[i];
            i++;
            k++;
        }
        while (j < n - m) {
            nums[k] = b[j];
            j++;
            k++;
        }
        return nums;
    }
}
