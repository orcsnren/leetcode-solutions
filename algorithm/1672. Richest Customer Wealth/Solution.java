class Solution {
	public int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int y = 0; y < accounts[i].length; y++) {
				sum += accounts[i][y];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}