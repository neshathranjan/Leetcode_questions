class Solution {
    public int lengthOfLastWord(String s) {
        String[] part =s.trim().split("\\s+");
        int n=part.length-1;
        return part[n].length();
    }
}