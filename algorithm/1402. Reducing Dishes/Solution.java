class Solution {
	public int maxSatisfaction(int[] satisfaction) {
		boolean sorted = false;
		int tmp = 0;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < satisfaction.length - 1; i++) {
				if (satisfaction[i] > satisfaction[i + 1]) {
					tmp = satisfaction[i];
					satisfaction[i] = satisfaction[i + 1];
					satisfaction[i + 1] = tmp;
					sorted = false;
				}
			}
		}
		int maxSum = 0;
		for (int i = 0; i < satisfaction.length; i++) {
			int l = 1;
			int curSum = 0;
			for (int k = i; k < satisfaction.length; k++) {
				curSum += (l * satisfaction[k]);
				l++;
			}
			maxSum = Math.max(curSum, maxSum);
		}
		return maxSum;
	}
}