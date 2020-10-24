class Solution {
	public int kthSmallest(int[][] matrix, int k) {
		int[] nums = new int[(int) Math.pow(matrix.length, 2)];
		for (int i = 0; i < matrix.length; i++) {
			for (int y = 0; y < matrix.length; y++) {
				nums[i * matrix.length + y] = matrix[i][y];
			}
		}
		Arrays.sort(nums);
		return nums[k - 1];
	}
}