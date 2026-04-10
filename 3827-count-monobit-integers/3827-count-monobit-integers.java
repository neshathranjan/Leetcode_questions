class Solution {
    public int countMonobit(int n) {
        if (n < 0) return 0;

    int count = 1;
    long val = 1;

    while (val <= n) {
        count++;
        val = (val << 1) | 1;
    }

    return count;
}
    }