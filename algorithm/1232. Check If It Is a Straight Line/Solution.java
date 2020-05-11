class Solution {
	public boolean checkStraightLine(int[][] coordinates) {
		if (coordinates.length == 2) {
			return true;
		}
		int x = coordinates[1][0] - coordinates[0][0];
		int y = coordinates[1][1] - coordinates[0][1];
		float slope = 0F;
		float curSlope = 0F;
		if (x == 0) {
			slope = 90F;
		} else if (y == 0) {
			slope = 0F;
		} else {
			slope = (float) y / x;
		}
		for (int i = 2; i < coordinates.length; i++) {
			curSlope = (coordinates[i][0] - coordinates[i - 1][0]) != 0
					? (float) ((coordinates[i][1] - coordinates[i - 1][1])
							/ (coordinates[i][0] - coordinates[i - 1][0]))
					: 0F;
			if (curSlope != slope) {
				return false;
			}
		}

		return true;
	}

}