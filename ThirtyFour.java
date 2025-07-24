class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if (n == 0){ 
            return new int[]{-1, -1};
        }
        if (n == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            }
             return new int[]{-1, -1};
        }

        int first = -1;
        int last = -1;

        for (int idx = 0; idx < n; idx++) {
            if (nums[idx] == target) {
                if (first == -1) {
                    first = idx;
                }
                last = idx;
            }
        }
        return new int[]{first, last};
    }
}

