class Solution {

    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int[] arr = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--; 
        }
        for(int freq : arr){
            if(freq != 0) return false;
        }
        return true;
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int n = strs.length;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;
            List<String> anagram = new ArrayList<>();
            anagram.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1; j < strs.length; j++ ){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    anagram.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(anagram);
        }
        return result;
    }
}
