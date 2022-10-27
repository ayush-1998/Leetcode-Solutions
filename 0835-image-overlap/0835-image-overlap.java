class Solution {
    public int largestOverlap(int[][] a, int[][] b) {
		int max = 0;
		for (int x = 1 - a.length; x < a.length; x++) {
			for (int y = 1 - a[0].length; y < a.length; y++) {
				max = Math.max(max, overlapCount(a, b, x, y));
			}
		}
		return max;
	}

	private int overlapCount(int[][] a, int[][] b, int x, int y) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i - x >= 0 && j - y >= 0 && i - x < a.length && j - y < a[0].length) {
					if (a[i][j] == b[i - x][j - y] && a[i][j] == 1) {
						count++;
					}
				}
			}
		}
		return count;
	}
}