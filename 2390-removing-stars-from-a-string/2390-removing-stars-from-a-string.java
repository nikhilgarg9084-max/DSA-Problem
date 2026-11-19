class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(char Ch :s.toCharArray()) {
            if (Ch == '*') {
                sb.deleteCharAt(sb.length()-1);
            } else{
                sb.append(Ch);
            }
        }
        return sb.toString();
    }
}
           