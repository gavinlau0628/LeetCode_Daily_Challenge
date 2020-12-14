/*

Greedily split the string, and with the counting
L +1
R -1

when the counter is reset to 0, we get one balanced string.

*/


class Solution {
    public int balancedStringSplit(String s) {
    int res = 0, cnt = 0;
    for (int i = 0; i < s.length(); ++i) {
        cnt += s.charAt(i) == 'L' ? 1 : -1;
        if (cnt == 0) ++res;
    }
    return res;             
}    
}
