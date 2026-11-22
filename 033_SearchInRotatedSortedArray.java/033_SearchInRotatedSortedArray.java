class Solution {
    public int search(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        while (a <= b) {
            int c = a + (b - a) / 2;
            if (nums[c] == target) {
                return c;
            }
            if (nums[a] <= nums[c]) {
                if (target >= nums[a] && target < nums[c]) {
                    b = c - 1;
                } else {
                    a = c + 1;
                }
            } else {
                if (target > nums[c] && target <= nums[b]) {
                    a = c + 1;
                } else {
                    b = c - 1;
                }
            }
        }
        return -1;
    }
}
