import java.util.Arrays;

/*
 * Activity 3.8.1
 */
public class TileTester {
    private static String[] tileValues = {"lion", "lion", "penguin", "penguin", "dolphin",
            "dolphin", "fox", "fox", "monkey", "monkey", "turtle", "turtle"};

    public static void main(String[] args) {

        /* your code here */
        Tile[][] gameboard = new Tile[3][4];

        int numRows = 3;
        int numCols = 4;
        int tileCount = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                gameboard[i][j] = new Tile(tileValues[tileCount]);
                tileCount++;
            }
        }
        System.out.println(java.util.Arrays.toString(gameboard[0]));
        System.out.println(java.util.Arrays.toString(gameboard[1]));
        System.out.println(java.util.Arrays.toString(gameboard[2]));
    }
}
