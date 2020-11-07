class Solution {
  public static int lastStoneWeight(int[] stones) {
    // we first sort the stones so we can start from the end of the array
    Arrays.sort(stones);
    //start from the end of the array, we replace the stones[i-1] = stones[i] - stones[i-1]
    for(int i=stones.length-1; i>0; i--) {
      stones[i-1] = stones[i] - stones[i-1];
        
    /* *** after we smash/replace the stone, we sort the array again 
        For exmaple, 8-7=1, we sort the array again to put 1 to the front of the array
        At the end, we will return the first element of the array as it is the alst stone weight
    */  ***
      Arrays.sort(stones);
    }
    return stones[0];
  }
}
