class Solution {
    public int findMinArrowShots(int[][] points) {

        if (points == null || points.length == 0 ) return 0;
        Arrays.sort(points, (p1, p2) -> p1[1]-p2[1]);
        int arrowPoint = points[0][1];
        int minArrow = 1;
        for(int index=1; index < points.length; index++){
            if (arrowPoint >= points[index][0] && 
                    arrowPoint <= points[index][1]){
                continue;   
            }            
            minArrow++;
            arrowPoint = points[index][1];
        }
        return minArrow;
    }
}
