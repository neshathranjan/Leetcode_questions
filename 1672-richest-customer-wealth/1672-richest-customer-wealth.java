class Solution {
    public int maximumWealth(int[][] accounts) {
        int m= accounts.length;
        int n=accounts[0].length;
        int sum[]= new int[m];
        int max = sum[0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i]+= accounts[i][j];
            }
           
           if(max<=sum[i]) max = sum[i];
        }
        return max;
    }
}
