class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char value = board[i][j];

                if (value != '.') {
                    if (row.contains(value)) {
                        return false;
                    }
                    row.add(value);
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            HashSet<Character> col = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                char value = board[i][j];

                if (value != '.') {
                    if (col.contains(value)) {
                        return false;
                    }
                    col.add(value);
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
    for (int j = 0; j < 9; j += 3) {

        HashSet<Character> box = new HashSet<>();

        for (int row = i; row < i + 3; row++) {
            for (int col = j; col < j + 3; col++) {

                char value = board[row][col];
                if (value != '.') {
                    if (box.contains(value)) {
                        return false;
                    }
                    box.add(value);
                }
            }
        }
    }
}

return true;

    }
}