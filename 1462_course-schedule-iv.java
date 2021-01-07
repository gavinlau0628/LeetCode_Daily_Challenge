/*

Idea
This problem is about check if 2 vertices are connected in directed graph. Floyd-Warshall O(n^3) is an algorithm that will output the minium distance of any vertices. We can modified it to output if any vertices is connected or not.

Complexity:

Time: O(n^3)
Space: O(n^2)

*/


class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] connected = new boolean[n][n];
        for (int[] p : prerequisites)
            connected[p[0]][p[1]] = true; // p[0] -> p[1]
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    connected[i][j] = connected[i][j] || connected[i][k] && connected[k][j];
        List<Boolean> ans = new ArrayList<>();
        for (int[] q : queries)
            ans.add(connected[q[0]][q[1]]);
        return ans;
    }
} 
