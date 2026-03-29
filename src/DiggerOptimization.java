import java.util.Scanner;

public class DiggerOptimization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] grid = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxAbove = dp[i - 1][j];

                if (j > 0)
                    maxAbove = Math.max(maxAbove, dp[i - 1][j - 1]);

                if (j < n - 1)
                    maxAbove = Math.max(maxAbove, dp[i - 1][j + 1]);

                dp[i][j] = grid[i][j] + maxAbove;
            }
        }

        int maxProfit = 0;
        for (int j = 0; j < n; j++) {
            maxProfit = Math.max(maxProfit, dp[n - 1][j]);
        }

        System.out.println(maxProfit);
    }
}
