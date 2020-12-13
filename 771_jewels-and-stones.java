class Solution {
        public int numJewelsInStones(String J, String S) {
            
            /*
            Explanation
            read J and build jewels hash set.
            read S and count jewels.
            
            Complexity
            I used hash set and it's O(1) time to check if it contains an element.
            So the total time complexity will be O(J+S), instead of O(JS)
            Space is O(J)
            
            */
            int res = 0;
            Set setJ = new HashSet();
            for (char j: J.toCharArray())
                setJ.add(j);
            for (char s: S.toCharArray())
                if (setJ.contains(s)) res++;
            return res;
    }
}
