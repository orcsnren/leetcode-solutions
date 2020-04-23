class Solution {
	public int minStartValue(int[] nums) {
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				array[i] += nums[i];
			} else {
				array[i] += array[i - 1] + nums[i];
			}

		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			min = Math.min(min, array[i]);
		}
		if (min > 0) {
			return 1;
		}
		return Math.abs(min) + 1;

	}
}