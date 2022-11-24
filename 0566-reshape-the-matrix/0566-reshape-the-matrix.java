class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length * mat[0].length != r * c) return mat;
        
        int[][] output = new int[r][c];
        for(int i=0;i<r*c;i++)
        {
             // idx % c will give us the current column number...
             // idx / c will give us how many rows we have completely filled...
            output[i/c][i%c] = mat[i / mat[0].length][i % mat[0].length];
        }
        return output;
    }
}