class Solution {
	public int removeCoveredIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int[] curr = { -1, -1 };
		int result = 0;
		for (int[] interval : intervals) {
			if (curr[0] < interval[0] && curr[1] < interval[1]) {
				curr[0] = interval[0];
				result++;
			}
			curr[1] = Math.max(curr[1], interval[1]);
		}

		return result;
	}
}