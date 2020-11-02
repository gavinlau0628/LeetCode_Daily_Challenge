class Solution {
  private int[] cache;
  public boolean winnerSquareGame(int n) {
    this.cache = new int[n + 1];
    return this.win(n) > 0;
  }
  
  private int win(int n) {
    if (n == 0) return -1;
    if (this.cache[n] != 0) return this.cache[n];
    for (int i = (int)Math.sqrt(n); i >= 1; --i)
      if (win(n - i * i) < 0) 
        return this.cache[n] = 1;
    return this.cache[n] = -1;
  }
}
