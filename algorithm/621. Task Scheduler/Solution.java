class Solution {
	public int leastInterval(char[] tasks, int n) {
		int[] counts = new int[26];
		for (char c : tasks)
			counts[c - 'A']++;

		Arrays.sort(counts);
		int max = counts[25] - 1;
		int idle = max * n;
		for (int i = 24; i >= 0; --i)
			idle = idle - Math.min(max, counts[i]);

		return idle > 0 ? idle + tasks.length : tasks.length;
	}

}