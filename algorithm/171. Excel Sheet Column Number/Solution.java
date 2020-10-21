class Solution {
	public int titleToNumber(String s) {
		double result = 0.0;
		for (int i = 0; i < s.length(); i++) {
			double multiplier = Math.pow(26, s.length() - 1 - i);
			result += multiplier * (s.charAt(i) - 'A' + 1);
		}

		return (int) result;
	}
}