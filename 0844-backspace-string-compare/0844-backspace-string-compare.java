class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        StringBuilder Sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(ch == '#') {
                if(Sb.length()>0) {
                    Sb.deleteCharAt(Sb.length()-1);
                }
            } else {
                Sb.append(ch);
            }
        }
        return Sb.toString();
    }
}
            