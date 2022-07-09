class Solution {
    public int lengthOfLongestSubstring(String s) {
        int largestSubstring = 0;
        for(int i = 0; i < s.length(); i++){
            String tempStr= "";
            int tempVal = i;
            while(tempVal < s.length() && tempStr.indexOf(s.charAt(tempVal)) == -1){
                tempStr += s.charAt(tempVal);
                tempVal++;
            }
            if(tempStr.length() > largestSubstring){
                largestSubstring = tempStr.length();
            }
        }
        return largestSubstring;
    }
}
