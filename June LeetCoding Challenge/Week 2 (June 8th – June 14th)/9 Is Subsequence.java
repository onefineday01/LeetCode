class Solution {
    public boolean isSubsequence(String s, String t){
        int curidx = -1;
        for(int i=0;i<s.length();i++)
        {
            curidx = t.indexOf(s.charAt(i),curidx+1);
                if(curidx==-1)
                    return false;
        }
        return true;
    }
}