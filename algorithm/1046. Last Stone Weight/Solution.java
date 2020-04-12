class Solution {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 2) {
			return Math.abs(stones[1] - stones[0]);
		}

		Arrays.sort(stones);
		List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
		int diff = 0;
		for (int i = list.size() - 1; i > 0; i--) {
			diff = Math.abs(list.get(i) - list.get(i - 1));
			list.remove(i);
			if (diff == 0) {
				list.remove(i - 1);
				i--;
			} else {
				list.set(i - 1, diff);
			}
			Collections.sort(list);
		}

		return list.isEmpty() ? 0 : list.get(0);

	}
}