public boolean clearPair(int row, int col) {
    int val = puzzle[row][col];

    for (int i = col + 1; i < puzzle[row].length; i++) {
        if (puzzle[row][i] == val || puzzle[row][c] + value == 10) {
            puzzle[row][cpl] = 0;
            puzzle[row][i] = 0;
            return true;
        }
    }

    for (int j = row + 1; j < puzzle.length; j++) {
        for (int k = 0; k < puzzle[j].length; k++) {
            if (puzzle[j][k] == value || puzzle[j][k] + value == 10) {
                puzzle[row][col] = 0;
                puzzle[r][c] = 0;
                return true;
            }
        }
    }
    return false;
}
