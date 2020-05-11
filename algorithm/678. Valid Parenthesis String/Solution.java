class Solution {
	public boolean checkValidString(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		int revCount = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (c == ')' && !stack.isEmpty()) {
					stack.pop();
				} else if (c == ')' && revCount > 0) {
					revCount--;
				} else if (c == ')') {
					return false;
				} else {
					revCount++;
					if (!stack.isEmpty()) {
						stack.pop();
						revCount++;
					}
				}
			}
		}
		return stack.isEmpty();
	}
}