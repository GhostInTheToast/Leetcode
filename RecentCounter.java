class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        this.q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        int start = t - 3000;
        q.add(t);
        while (!q.isEmpty() && q.peek() < start) {
            q.remove();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
