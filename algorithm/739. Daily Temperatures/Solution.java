class Solution {
	public int[] dailyTemperatures(int[] T) {
		for (int i = 0; i < T.length - 1; i++) {
			for (int y = i + 1; y < T.length; y++) {
				if (T[y] > T[i]) {
					T[i] = y - i;
					break;
				}
				if (y == T.length - 1)
					T[i] = 0;

			}
		}
		T[T.length - 1] = 0;
		return T;
	}

}