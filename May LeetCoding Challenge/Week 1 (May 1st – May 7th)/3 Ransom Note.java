class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (char c : magazine.toCharArray())
            ++hash[c-'a'];
        for (char c : ransomNote.toCharArray())
            if (--hash[c-'a'] < 0) 
                return false;
        return true;
    }
}
