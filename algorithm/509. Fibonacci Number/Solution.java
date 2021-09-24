class Solution {
    public int fib(int n) {
        return fibTraversal(n);
    }

    public int fibTraversal(int target) {
        if (target < 2) {
            return target;
        } else {
            return fibTraversal(target - 1) + fibTraversal(target - 2);
        }
    }
}