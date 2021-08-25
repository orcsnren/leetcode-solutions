class Solution {
	public int[] getConcatenation(int[] nums) {
		int[] expandedArray = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			expandedArray[i] = nums[i];
			expandedArray[i + nums.length] = nums[i];
		}
		return expandedArray;
	}
}