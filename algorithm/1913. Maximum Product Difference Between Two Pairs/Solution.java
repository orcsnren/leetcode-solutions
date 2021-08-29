class Solution {
	public int maxProductDifference(int[] nums) {

		// 10^4 possible max value for this question
		int min1 = 10000; // smallest num
		int min2 = 10000; // second smallest num
		int max1 = 0; // biggest num
		int max2 = 0; // second biggest num
		for (int i = 0; i < nums.length; i++) { // O(n) complexity
			if (nums[i] < min1) {
				min2 = min1;
				min1 = nums[i];
			} else if (nums[i] < min2)
				min2 = nums[i];
			if (nums[i] > max1) {
				max2 = max1;
				max1 = nums[i];
			} else if (nums[i] > max2)
				max2 = nums[i];

		}
		return (max1 * max2) - (min1 * min2);
	}
}