class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;

		int res = 0, left = 0, right = 0;
		char c = ' ';
		int[] lastSeen = new int[128];

		Arrays.fill(lastSeen, 0, lastSeen.length - 1, -1);

		while (left < s.length() && right < s.length()) {
			c = s.charAt(right);
			if (lastSeen[c] != -1 && lastSeen[c] >= left) {
				left = lastSeen[c] + 1;
			}
			res = Math.max(res, right - left + 1);
			lastSeen[c] = right;
			right++;
		}

		return res;
	}

//     public int lengthOfLongestSubstring(String s) {
//         int res = 0;
//         int[] index = new int[128];

//         for (int left = 0, right = 0; right < s.length(); right++) {
//             left = Math.max(index[s.charAt(right)], left);
//             res = Math.max(res, right - left + 1);
//             index[s.charAt(right)] = right + 1;
//         }
//         return res;
//     }
}