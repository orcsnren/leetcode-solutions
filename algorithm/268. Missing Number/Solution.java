class Solution {
	public int missingNumber(int[] nums) {
		int expectedSum = (nums.length * (nums.length + 1)) / 2;
		for (int i = 0; i < nums.length; i++) {
			expectedSum -= nums[i];
		}

		return expectedSum;
	}
}