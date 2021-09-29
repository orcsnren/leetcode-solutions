class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        if (nums.length == 1)
            return nums[0];

        int beginWithFirstHouse = robTraversal(nums, 0, nums.length - 2);
        int beginWithSecondHouse = robTraversal(nums, 1, nums.length - 1);
        return Math.max(beginWithFirstHouse, beginWithSecondHouse);
    }

    public int robTraversal(int[] nums, int start, int end) {
        if (start == end)
            return nums[start];

        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end];
    }
}