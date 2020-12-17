/*

Time O(N)
Space O(1)

*/

class Solution {
        public int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0}, res = 0 , i = 0, n = s.length();
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j) - 'a'];
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                --count[s.charAt(i++) - 'a'];
            res += i;
        }
        return res;
    }
}


/*

Solution II
last will record the position of last occurrence.
If the ending index of substring is i,
the starting position should be on the left of min(last),
in order to have all 3 different letters.
And in this case, the starting index can be in range [0, min(last)],
min(last) + 1 in total.

Time O(N)
Space O(1)



    public int numberOfSubstrings(String s) {
        int last[] = {-1, -1, -1}, res = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            last[s.charAt(i) - 'a'] = i;
            res += 1 + Math.min(last[0], Math.min(last[1], last[2]));
        }
        return res;
    }

*/
