class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet();
        for(char i : J.toCharArray())
            set.add(i);
        int count = 0;
        for(char i : S.toCharArray())
            if(set.contains(i))
                count++;
        return count;
    }
}