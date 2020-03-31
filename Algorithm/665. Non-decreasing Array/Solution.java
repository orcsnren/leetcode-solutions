class Solution {
	public boolean checkPossibility(int[] nums) {
		boolean changed = false;
		for (int index = 1; index < nums.length; index++) {
			if (nums[index] < nums[index - 1]) {
				if (changed) {
					return false;
				}
				if (index - 2 < 0 || nums[index - 2] <= nums[index]) {
					nums[index - 1] = nums[index];
				} else {
					nums[index] = nums[index - 1];
				}
				changed = true;
			}
		}
		return true;
	}
}