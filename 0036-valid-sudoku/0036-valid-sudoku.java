class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num == '.') continue;
                
                // check row
                for (int c = j + 1; c < 9; c++) {
                    if (board[i][c] == num) {
                        // System.out.print("failed for row: "+num+" at "+i+","+j);
                        return false;
                    }
                }

                // check column
                for (int r = i + 1; r < 9; r++) {
                    if (board[r][j] == num) {
                        // System.out.print("failed for col: "+num+" at "+i+","+j);
                        return false;
                    }
                }

                // check sub-box
                int startRow = i == 0 ? 0 : 3 * (i / 3);
                int startCol = j == 0 ? 0 : 3 * (j / 3);
                
                for (int r = startRow; r < startRow + 3; r++) {
                    for (int c = startCol; c < startCol + 3; c++) {
                        if (board[r][c] == num && (r != i || c != j)) {
                            // System.out.print("failed for sub-box: "+num+" at "+i+","+j);
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}