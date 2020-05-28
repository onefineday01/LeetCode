class Solution {
    public String frequencySort(String s) {
        
        StringBuilder sB = new StringBuilder();
        int[] charArr = new int[256];
        
        for(char c: s.toCharArray()){
            charArr[(int) c]++;
        }
        int max;
        int index;
        while(true){
            max = 0;
            index = -1;
            for(int i=0; i<charArr.length;i++){
                if(charArr[i] > max){
                    index = i;
                    max = charArr[i];
                }
            }
            if(max == 0 && index == -1){
                return sB.toString();
            }
            else{
                charArr[index] = 0;
                for(int i=0; i<max;i++){
                    sB.append((char) index);
                }
            }
        }
    }
}