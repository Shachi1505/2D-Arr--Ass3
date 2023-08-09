public boolean checkXMatrix(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;

    // Check main diagonal
    for (int i = 0; i < n; i++) {
        if (grid[i][i] == 0) {
            return false;
        }
    }

    // Check secondary diagonal
    for (int i = 0; i < n; i++) {
        if (grid[i][n - 1 - i] == 0) {
            return false;
        }
    }

    // Check non-diagonal elements
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (i != j && i != n - 1 - j && grid[i][j] != 0) {
                return false;
            }
        }
    }

    return true;
}
