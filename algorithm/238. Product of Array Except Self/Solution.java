class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		for (int i = 0, mulp = 1; i < nums.length; i++) {
			res[i] = mulp;
			mulp *= nums[i];
		}
		for (int i = nums.length - 1, mulp = 1; i >= 0; i--) {
			res[i] *= mulp;
			mulp *= nums[i];
		}
		return res;
	}
}