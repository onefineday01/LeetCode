class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new LinkedList();
        if(s == null || s.length() == 0 || s.length() < p.length())
            return ans;
        int arr[] = new int[26];
        int pArr[] = new int[26];
        for(int i = 0; i < p.length(); i++){
            pArr[p.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']++;
        }
            
        for(int i = 0; i < s.length() - p.length() + 1; i++){
            if (i != 0) {
                arr[s.charAt(i - 1) - 'a']--;
                arr[s.charAt(i + p.length() - 1) - 'a']++;
            }
            if(isAnagram(arr, pArr))
                ans.add(i);
        }
        return ans;
    }
    boolean isAnagram(int arr[], int pArr[]){
        for(int j = 0; j < 26; j++)
            if(arr[j] != pArr[j])
                return false;
        return true;
    }
}