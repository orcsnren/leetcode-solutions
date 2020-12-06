class Solution {
	public int getSum(int a, int b) {
		if (b == 0)
			return a;
		int digit = (a & b) << 1;
		int sum = a ^ b;
		return getSum(sum, digit);
	}
}