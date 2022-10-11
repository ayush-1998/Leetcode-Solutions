class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row ++)  {
            for(int col = 0; col < 9; col ++) {
                if(board[row][col] != '.') {     // we'll check
                    char temp = board[row][col];
                    board[row][col] = '.';
                    if(!isSafe(board, row, col, temp)) {
                        return false;
                    }
                    board[row][col] = temp;
                }
            }
        }
        return true;
    }
    
    
    static boolean isSafe(char[][] board, int row, int col, char value) {
        // Checking Col
        for(int i = 0; i < 9; i ++) {
            if(board[i][col] == value) {
                return false;
            }
        }
        // Checking Row
        for(int i = 0; i < 9; i ++) {
            if(board[row][i] == value) {
                return false;
            }
        }
        // Checking in sub grid
        int rowStart = row - row % 3;
        int colStart = col - col % 3;
        for(int i = rowStart; i < rowStart + 3; i ++) {
            for(int j = colStart; j < colStart + 3; j ++) {
                if(board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }
}