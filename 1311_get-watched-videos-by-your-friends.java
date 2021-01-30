class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        boolean[] visited = new boolean[friends.length];
        visited[id] = true;
        List<Integer> q = getKthLevelFriends(friends, id, level, visited);
        Map<String, Integer> freq = new HashMap<>();
        for (int person : q)
            for (String v : watchedVideos.get(person))
                freq.put(v, 1 + freq.getOrDefault(v, 0));
        List<String> ans = new ArrayList<>(freq.keySet());
        ans.sort((a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            return (fa != fb) ? (fa - fb) : a.compareTo(b);
        });
        return ans;
    }

    private List<Integer> getKthLevelFriends(int[][] friends, int id, int level, boolean[] visited) {
        List<Integer> q = new ArrayList<>();
        q.add(id);
        for (int k = 0; k < level; k++) {   // depth less than level
            List<Integer> newQ = new ArrayList<>();
            for (int v : q) {
                for (int w : friends[v]) {
                    if (visited[w]) continue;
                    visited[w] = true;
                    newQ.add(w);
                }
            }
            q = newQ;     //change the list to own frnd of frnd
        }
        return q;
    }
}
