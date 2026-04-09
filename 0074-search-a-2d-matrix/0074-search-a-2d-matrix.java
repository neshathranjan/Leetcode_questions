class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m=matrix[0].length;
        int left = 0,right=(n*m)-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int midValue =matrix[mid/m][mid%m];
            if(midValue == target) return true;
            else if(target<midValue) right =mid-1;
            else left = mid+1;
        } 
        return false;
    }
}