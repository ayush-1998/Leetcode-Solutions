class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int start = 0; 
    int last = matrix[0].length - 1;
    
    while (last >= 0 && start < matrix.length) {
        if (matrix[start][last] < target) start++;
        else if (matrix[start][last] > target) last--;
        else return true;
    }
	
    return false;
    }
}