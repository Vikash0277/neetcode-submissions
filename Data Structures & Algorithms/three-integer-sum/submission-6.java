class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>();

        if(nums.length == 3 && nums[0] + nums[1] + nums[2] == 0) {
            result.add(Arrays.asList(nums[0], nums[1], nums[2]));
            return result;
        }
       
       for(int i = 0; i < nums.length - 2; i++) {
            int sum = 0;
            int start = i + 1;
            int end = nums.length - 1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    start++;
                    end--;

                    while(start < end && nums[start] ==  nums[start - 1]) start++;
                    while(start < end && nums[end] ==  nums[end + 1]) end--;
                }
                else if(sum > 0) {
                    end--;
                }
                else{
                    start++;
                }
            }
       } 
       return result;
    }
}
