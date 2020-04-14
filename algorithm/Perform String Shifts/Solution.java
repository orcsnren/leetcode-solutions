class Solution {
	public String stringShift(String s, int[][] shift) {
		StringBuilder sb = new StringBuilder();
		int[] directions = new int[2];
		for (int i = 0; i < shift.length; i++) {
			directions[shift[i][0]] += shift[i][1];
		}
		if (directions[0] == directions[1]) {
			return s;
		} else {
			int diff = (directions[0] - directions[1]) % s.length();
			if (diff > 0) {
				sb.append(s.substring(diff, s.length()));
				sb.append(s.substring(0, diff));
				return sb.toString();

			}
			sb.append(s.substring(s.length() - Math.abs(diff), s.length()));
			sb.append(s.substring(0, s.length() - Math.abs(diff)));
		}

		return sb.toString();
	}
}