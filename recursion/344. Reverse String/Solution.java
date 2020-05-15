class Solution {
	public void reverseString(char[] s) {
		next(0, s);
	}

	public void next(int index, char[] str) {
		if (str == null || index >= str.length / 2)
			return;

		char c = str[str.length - index - 1];
		str[str.length - index - 1] = str[index];
		str[index] = c;
		next(index + 1, str);
	}
}