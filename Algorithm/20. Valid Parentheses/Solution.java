class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
				stack.push(')');
				continue;
			case '{':
				stack.push('}');
				continue;
			case '[':
				stack.push(']');
				continue;
			}
			if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}

		}

		return stack.isEmpty();
	}
}