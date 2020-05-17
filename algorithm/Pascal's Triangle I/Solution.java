class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists = new ArrayList<>();
		if (numRows == 0) {
			return lists;
		}
		lists.add(new ArrayList<Integer>(Arrays.asList(1)));
		for (int row = 1; row < numRows; row++) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			for (int x = 1; x < row; x++) {
				list.add(lists.get(row - 1).get(x - 1) + lists.get(row - 1).get(x));
			}
			list.add(1);

			lists.add(list);
		}
		return lists;
	}
}