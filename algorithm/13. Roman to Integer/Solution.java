class Solution {
	public int romanToInt(String s) {
		Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

		int result = map.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 1; i > 0; i--) {
			Integer current = map.get(s.charAt(i));
			Integer before = map.get(s.charAt(i - 1));
			result = current <= before ? result + before : result - before;
		}
		return result;
	}
}