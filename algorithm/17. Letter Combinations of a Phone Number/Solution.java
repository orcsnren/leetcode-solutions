class Solution {
	public List<String> letterCombinations(String digits) {
		Map<Character, String> map = new HashMap<Character, String>() {
			{
				put('2', "abc");
				put('3', "def");
				put('4', "ghi");
				put('5', "jkl");
				put('6', "mno");
				put('7', "pqrs");
				put('8', "tuv");
				put('9', "wxyz");
			}
		};

		List<String> ret = new ArrayList<>();
		if (digits.equals(""))
			return ret;

		dfs(digits, 0, "", map, ret);
		return ret;
	}

	private void dfs(String digits, int index, String path, Map<Character, String> map, List<String> ret) {
		if (digits.length() == path.length()) {
			ret.add(path);
			return;
		}
		for (int i = index; i < digits.length(); i++)
			for (char c : map.get(digits.charAt(i)).toCharArray())
				dfs(digits, i + 1, path + c, map, ret);

	}
}