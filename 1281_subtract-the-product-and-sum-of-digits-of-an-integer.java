class Solution {
    public int subtractProductAndSum(int n) {
        
        /*
            Complexity
            Time O(logN)
            Space O(1)
        */
        
        int product = 1;
        int sum = 0;

        while (n > 0)
        {
            product *= n % 10;
            sum += n % 10;
            
            n /= 10;
        }
        
        return product - sum;
        
    }
}
