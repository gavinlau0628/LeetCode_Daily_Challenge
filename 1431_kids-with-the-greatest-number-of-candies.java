class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<Boolean>();
        
        int highest = candies[0];
        
        
        for (int i : candies)
        {
            if(i >= highest) highest = i;
        }
        
        for(int j : candies)
        {
            if(j+extraCandies >= highest) result.add(true);
            else result.add(false);
        }
        
        return result;
        
        /*
        Deduct extraCandies from max to avoid plus n times.

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans = new ArrayList<>(candies.length);
            int gauge = 0;
            for (int candy : candies) {
                gauge = Math.max(candy, gauge);
            }
            gauge -= extraCandies;
            for (int candy : candies) {
                ans.add(candy >= gauge);
            }
            return ans;
    }
        
        */
        
    }
}
