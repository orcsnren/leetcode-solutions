class SubrectangleQueries {

	private int[][] rectangle = new int[100][100];

	public SubrectangleQueries(int[][] rectangle) {
		this.rectangle = rectangle;
	}

	public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
		for (int r = row1; r <= row2; r++) {
			Arrays.fill(rectangle[r], col1, col2 + 1, newValue);
		}
	}

	public int getValue(int row, int col) {
		return this.rectangle[row][col];
	}
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue); int param_2 =
 * obj.getValue(row,col);
 */