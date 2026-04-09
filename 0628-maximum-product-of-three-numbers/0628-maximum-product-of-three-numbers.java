class Solution {
    public int maximumProduct(int[] arr) {
        int product=1;
        int n=arr.length;
        Arrays.sort(arr);
        int a=arr[0]*arr[1]*arr[n-1];
        int b=arr[n-1]*arr[n-2]*arr[n-3];
        if(a<b) return b;
        return a;
    }
}