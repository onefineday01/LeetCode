class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[] = s.trim().split(" ");
        for(int i = arr.length - 1; i >= 0; i--)
            if(!arr[i].equals("")) sb.append(arr[i].trim()+" ");
        if(sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}