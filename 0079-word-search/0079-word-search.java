class Solution {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board, int i, int j, int index, String word) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length
                || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        boolean found =
                find(board, i + 1, j, index + 1, word) ||
                find(board, i - 1, j, index + 1, word) ||
                find(board, i, j + 1, index + 1, word) ||
                find(board, i, j - 1, index + 1, word);

        visited[i][j] = false;
        return found;
    }
}
