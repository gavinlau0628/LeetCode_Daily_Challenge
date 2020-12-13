class Solution {
    public int hammingDistance(int x, int y) {
        
        // The XOR logical operation, or exclusive or, takes two boolean operands and returns true if and only if the operands are different. 
        
        return Integer.bitCount(x ^ y);
    }
}

/*
class Solution {
    public int hammingDistance(int x, int y) {
    
        //The XOR logical operation, or exclusive or, takes two boolean operands and returns true if and only if the operands are different. 
    
        int diff = x ^ y; //xor for the difference of x and y，same=0，diff=1
        return countOne(diff);
    }
    
    private int countOne(int num){
        int count = 0;
        while(num != 0){
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}

*/
