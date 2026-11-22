class Solution {
    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = nums.length - 1;
        while (b <= c) {
            if (nums[b] == 0) {
                int t = nums[a];
                nums[a] = nums[b];
                nums[b] = t;
                a++;
                b++;
            } else if (nums[b] == 1) {
                b++;
            } else {
                int t = nums[b];
                nums[b] = nums[c];
                nums[c] = t;
                c--;
            }
        }
    }
}
