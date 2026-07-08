class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        int prefixProd = 1;
        for(int i = 1; i < n; i++) {
            prefixProd = prefixProd * nums[i-1];
            prefix[i] = prefixProd;
        }
        int suffixProd = 1;
        for(int i = n-2; i >= 0; i--) {
            suffixProd = suffixProd * nums[i+1];
            suffix[i] = suffixProd;
        }

        for(int i = 0; i < n; i++) {
            prefix[i] = prefix[i] * suffix[i];
        }
        return prefix;
    }
}  
