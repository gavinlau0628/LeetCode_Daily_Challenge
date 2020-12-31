class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {

        
        
        int start = 0;
        int res = Integer.MIN_VALUE;
        int len = points.length;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[]{points[0][1] - points[0][0], 0});
        
        //y_i + y_j + x_j - x_i == y_i - x_i + y_j + x_j
        
        for(int i=1;i<len;i++){
            int cur = points[i][0] + points[i][1];
            while(points[i][0] - points[start][0]>k){
                start++;
            }
            while(deque.size()!=0 && deque.peekFirst()[1]<start){
                deque.pollFirst();
            }
            
            
            if(deque.size()!=0){
                int[] ele = deque.peekFirst();
                res = Math.max(res, cur + ele[0]);
            }
            while(deque.size()!=0 && deque.peekLast()[0]<=points[i][1]-points[i][0]){
                   deque.pollLast();
            }
            deque.offerLast(new int[]{points[i][1]-points[i][0], i});
        }
        
        
        return res;
        
    }
}
