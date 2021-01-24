/*

Intuition
One observation is that, (not sure if it's obvious)
we can greedily explore the grid.
We will never detour the path to a node that we can already reach.

In the view of graph,
the fleche indicates a directed edge of weight = 0.
The distance between all neighbours are at most 1.
Now we want to find out the minimum distance between top-left and bottom-right.


Explanation
Find out all reachable nodes without changing anything.
Save all new visited nodes to a queue bfs.
Now iterate the queue
3.1 For each node, try changing it to all 3 other direction
3.2 Save the new reachable and not visited nodes to the queue.
3.3 repeat step 3

Complexity
Time O(NM)
Space O(NM)

*/



class Solution {
        int INF = (int) 1e9;
    int[][] DIR = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length, cost = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], INF);
        Queue<int[]> bfs = new LinkedList<>();
        dfs(grid, 0, 0, dp, cost, bfs);
        while (!bfs.isEmpty()) {
            cost++;
            for (int size = bfs.size(); size > 0; size--) {
                int[] top = bfs.poll();
                int r = top[0], c = top[1];
                for (int i = 0; i < 4; i++) dfs(grid, r + DIR[i][0], c + DIR[i][1], dp, cost, bfs);
            }
        }
        return dp[m - 1][n - 1];
    }

    void dfs(int[][] grid, int r, int c, int[][] dp, int cost, Queue<int[]> bfs) {
        int m = grid.length; int n = grid[0].length;
        if (r < 0 || r >= m || c < 0 || c >= n || dp[r][c] != INF) return;
        dp[r][c] = cost;
        bfs.offer(new int[]{r, c}); // add to try change direction later
        int nextDir = grid[r][c] - 1;
        dfs(grid, r + DIR[nextDir][0], c + DIR[nextDir][1], dp, cost, bfs);
    }
}
