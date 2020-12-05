class Solution {
	int[] originalNums;
	int[] modifiedNums;

	public Solution(int[] nums) {

		originalNums = new int[nums.length];
		modifiedNums = new int[nums.length];

		System.arraycopy(nums, 0, originalNums, 0, nums.length);
		System.arraycopy(nums, 0, modifiedNums, 0, nums.length);

	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return originalNums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {

		Random rand = new Random();

		for (int i = 0; i < modifiedNums.length; i++) {
			int randomIndexToSwap = rand.nextInt(modifiedNums.length);
			int temp = modifiedNums[randomIndexToSwap];
			modifiedNums[randomIndexToSwap] = modifiedNums[i];
			modifiedNums[i] = temp;
		}
		return modifiedNums;

	}
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */