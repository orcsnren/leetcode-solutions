class Solution {
	public int numJewelsInStones(String J, String S) {
		int count = 0;
		for (int index = 0; index < S.length(); index++) {
			if (J.indexOf(S.charAt(index)) > -1) {
				count++;
			}
		}
		return count;
	}
}