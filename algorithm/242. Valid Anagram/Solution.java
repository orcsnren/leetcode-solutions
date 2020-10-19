class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] charsOfFirst = s.toCharArray();
		char[] charsOfSecond = t.toCharArray();
		Arrays.sort(charsOfFirst);
		Arrays.sort(charsOfSecond);

		return Arrays.equals(charsOfFirst, charsOfSecond);
	}
}