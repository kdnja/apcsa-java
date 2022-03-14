/*
 * Activity 3.8.2
 */
public class Traversing2DArrays {
    public static void main(String[] args) {
        String board[][] =
                {{"close", "quarter"}, {"moon", "rock"}, {"band", "stand"}, {"out", "shine"}};

        // for each loop, row-major order
        for (String[] row : board) {
            for (String str : row) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }
        System.out.println();



        System.out.println("rows in board: " + board.length);
        System.out.println("columns in board: " + board[0].length);
        System.out.println();

        // indexed for loop, row-major order
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // indexed for loop, column-major order
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
