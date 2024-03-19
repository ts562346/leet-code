import java.util.Arrays;

/*

70. Climbing Stairs - Easy

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct
ways can you climb to the top?

 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n==1 || n==0)
            return 1;

        int [] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n+1; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
