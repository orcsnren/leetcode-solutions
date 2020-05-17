class Solution {
	public List<Integer> getRow(int rowIndex) {
		int[][] row = new int[rowIndex + 1][rowIndex + 1];
		createPascal(row, 0, rowIndex);
		List<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j <= rowIndex; j++) {
			list.add(row[rowIndex][j]);
		}
		return list;
	}

	public void createPascal(int[][] row, int start, int end) {
		if (start <= end) {
			for (int i = 0; i <= start; i++) {
				if (start == i || i == 0) {
					row[start][i] = 1;
					continue;
				}
				row[start][i] = row[start - 1][i - 1] + row[start - 1][i];
			}
			createPascal(row, start + 1, end);
		}

	}
}