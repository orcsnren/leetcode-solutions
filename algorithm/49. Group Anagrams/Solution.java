class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String newStr = new String(chars);
			if (!map.containsKey(newStr)) {
				map.put(newStr, new ArrayList<>());
			}
			map.get(newStr).add(str);
		}
		res.addAll(map.values());
		return res;

	}
}