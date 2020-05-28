class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<stones.length;i++){
            pq.add(-stones[i]);
        }
        while(pq.size()>1){
            int a = -pq.remove();
            int b = -pq.remove();
            if(a!=b)
                pq.add(-(a-b));
        }
        return pq.isEmpty() ? 0 : -pq.remove();
    }
}