class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        for (int i = 1; i <= n; i++) {
            array[2 * (i - 1)] = nums[i - 1];
            array[2 * i - 1] = nums[i + n - 1];
        }
        return array;
    }
}