class Solution {
	public boolean backspaceCompare(String S, String T) {
		return getBackSpacedStr(S).equals(getBackSpacedStr(T));
	}

	public String getBackSpacedStr(String str) {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '#') {
				build.append(str.charAt(i));
			} else {
				build.setLength(build.length() > 0 ? build.length() - 1 : 0);
			}
		}
		return build.toString();
	}
}