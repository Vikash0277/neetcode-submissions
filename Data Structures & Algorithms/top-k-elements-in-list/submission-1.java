class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        int[] result = new int[k];

        for(int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet());

        int[] topKFreq = new int[k];

        for(int i = 0; i < k; i++) {
            topKFreq[i] = pq.poll();
        }
        return topKFreq;
    }
}
