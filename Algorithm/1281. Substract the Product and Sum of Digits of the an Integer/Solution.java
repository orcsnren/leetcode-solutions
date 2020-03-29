class Solution {
	public int subtractProductAndSum(int n) {
		int sum = 0;
		int multiply = 1;
		char[] chars = String.valueOf(n).toCharArray();
		for (int ind = 0; ind < chars.length; ind++) {
			sum += Integer.parseInt(String.valueOf(chars[ind]));
			multiply *= Integer.parseInt(String.valueOf(chars[ind]));
		}

		return multiply - sum;
	}
}