class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        int len1 = matrix[0].length;
        if(target<matrix[0][0] || target>matrix[len-1][len1-1]){
            return false;
        }
        else{
            return binarySearch2D(0,len-1,matrix,target,len);
        }
    }
    public boolean binarySearch2D(int start , int end , int[][] matrix , int target , int len)
    {
        int mid;
        while(start<=end){
        mid = (start+end)/2;
        if(target < matrix[mid][0])
        {
            end = mid - 1;
        }
        else if(target > matrix[mid][matrix[0].length-1])
        {
            start = mid + 1;
        }
        else{
            return binarySearch(mid,matrix,len,target);
        }
        }
        return false;
    }

    public boolean binarySearch(int val , int[][] matrix , int len , int target)
    {
        int left = 0;
        int mid;
        int right = matrix[0].length-1;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(matrix[val][mid] == target){
                return true;
            }
            else if(matrix[val][mid]>target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}