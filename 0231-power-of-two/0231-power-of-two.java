class Solution {
    public boolean isPowerOfTwo(int n) {
        int num=n&(n-1);
        if(n<=0) return false;
        if(num==0)
            return true;
        else
            return false;
    }
}