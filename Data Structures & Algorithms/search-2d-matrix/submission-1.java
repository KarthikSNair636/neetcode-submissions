class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null)
            return false;

        int left = 0;
        int right =  matrix[0].length - 1;
        int end = right;
        int top = 0;
        int bottom = matrix.length - 1;

        int colMid;
        int rowMid;

        while(top <= bottom){
            rowMid = top + (bottom - top)/2;
            if(matrix[rowMid][0] == target || matrix[rowMid][end] == target)
                return true;
            else if(target > matrix[rowMid][0] && target < matrix[rowMid][end]){
                while(left <= right){
                    colMid = left + (right - left)/2;
                    if(matrix[rowMid][colMid] == target)
                        return true;
                    else if(matrix[rowMid][colMid] < target)
                        left = colMid + 1;
                    else
                        right = colMid - 1;
                }
                return false;
            }
            else if(matrix[rowMid][0] > target)
                bottom = rowMid - 1;
            else
                top = rowMid + 1;
        }
        return false;
    }
}
