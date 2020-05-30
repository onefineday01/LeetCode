class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> ((a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])));
        for(int arr[] : points)
            pq.add(arr);
        int narr[][] = new int[K][2];
        for(int i=0;i<K;i++)
            narr[i] = pq.poll();
        return narr; 
    }
}