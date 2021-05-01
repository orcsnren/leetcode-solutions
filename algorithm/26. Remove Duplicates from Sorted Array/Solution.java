class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1)
			return nums.length;

		int lastElementIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[lastElementIndex] != nums[i]) {
				lastElementIndex++;
				nums[lastElementIndex] = nums[i];
			}

		}
		return lastElementIndex + 1;
	}
}