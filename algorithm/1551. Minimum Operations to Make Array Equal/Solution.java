class Solution {
	public int minOperations(int n) {
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++)
				sum += n - (2 * i) - 1;
		} else
			return (n * n) / 4;

		return sum;

	}
}