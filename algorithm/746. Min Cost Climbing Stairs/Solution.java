class Solution {

    // referenced by another leetcode user
    public int minCostClimbingStairs(int[] cost) {
        // We initialize an array of size = cost, and it means the minimun cost of reaching n^th stair
        int[] dp = new int[cost.length];
        // We assign values to the first 2 numbers in the array because it can´t be smaller than 3
        dp[0] = cost[0];
        dp[1] = cost[1];
        // We iterate from n=2 to n-1, and in each position we save the min
        // value to reach the stair, the MIN is (dp[i-1] + cost[i] , dp[i-2] + cost[i]
        // that is so that the min way of reaching that stair is either using the n-1 or n-2
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }

        // We return the min value of the last 2 stairs because both can reach the end
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);

		 /*
			 cost[1,100,1,1,1,100,1,1,100,1]
		 1.- Imagine this is the array
			 dp[]
		 2.- We add the first two values
			 dp[1,100]
		 3.- Iterate form 2 to n
			 This is a representation of the first one
		 dp[2] = Math.min(1+1, 100+1)
		 dp[2] = Math.min(2,101)
		 dp[2] = 2
		 dp[1,100,2]
			 After the for, this is how it should look
		 dp[1,100,2,3,3,103,4,5,105,6]
		 4.- Select the min between last 2 because both can reach last step
			return min (105,6)
			return 6

			It should have a space complexity of O(n) becuase we´re using an array of n size
			The time complexity should also be O(n) because we have to iterate through all the array once

		 */
    }
}