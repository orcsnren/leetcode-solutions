
class Solution {
	public int[] decompressRLElist(int[] nums) {
		int[] results = new int[getArraySize(nums)];
		int index = 0;
		for (int i = 0; i < nums.length; i += 2) {
			Arrays.fill(results, index, index + nums[i], nums[i + 1]);
			index += nums[i];
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