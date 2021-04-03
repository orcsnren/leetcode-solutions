class Solution {
	public int longestValidParentheses(String s) {

		if (s.length() == 0 || s.length() == 1)
			return 0;

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push(i);
			else {
				if (!stack.isEmpty() && s.charAt(stack.peek()) == '(')
					stack.pop();
				else
					stack.push(i);

			}
		}

		int max = 0;
		int last = s.length();
		while (!stack.isEmpty()) {
			int val = stack.pop();
			max = Math.max(max, last - val - 1);
			last = val;
		}
		return Math.max(max, last);
	}
}
