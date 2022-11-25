class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, newColor, color);
        }
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int newColor, int original) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != original) {
            return;
        }

        image[sr][sc] = newColor;

        dfs(image, sr + 1, sc, newColor, original);
        dfs(image, sr - 1, sc, newColor, original);
        dfs(image, sr, sc + 1, newColor, original);
        dfs(image, sr, sc - 1, newColor, original);
    }
}
