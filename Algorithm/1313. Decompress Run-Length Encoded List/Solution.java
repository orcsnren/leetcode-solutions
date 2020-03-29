
class Solution {
	public int[] decompressRLElist(int[] nums) {
		int[] results = new int[getArraySize(nums)];
		int index = 0;
		for (int i = 0; i < nums.length; i += 2) {
			int count = nums[i];
			for (int co = 0; co < count; co++) {
				results[index] = nums[i + 1];
				index++;
			}
		}
		return results;
	}

	public int getArraySize(int[] nums) {
		int size = 0;
		for (int i = 0; i < nums.length; i += 2) {
			size += nums[i];
		}
		return size;
	}
}