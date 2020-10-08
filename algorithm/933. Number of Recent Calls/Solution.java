class RecentCounter {
	List<Integer> results = null;
	int section = 3000;

	public RecentCounter() {
		results = new ArrayList<>();
	}

	public int ping(int t) {
		int count = 1;
		Integer ping;
		for (int i = results.size() - 1; i >= 0; i--) {
			ping = results.get(i);
			if (ping.intValue() >= (t - section) && ping.intValue() <= t)
				count++;
			else
				break;
		}
		results.add(t);
		return count;
	}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter(); int param_1 = obj.ping(t);
 */