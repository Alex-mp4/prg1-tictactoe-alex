import javax.swing.*;

public class tictactoe {
    public static void main(String[] args) {

        String one = " ";
        String two = " ";
        String three = " ";
        String four = " ";
        String five = " ";
        String six = " ";
        String seven = " ";
        String eight = " ";
        String nine = " ";

        String board = "| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |";
        char[] boardC = board.toCharArray();

        while() {
            String pick = JOptionPane.showInputDialog(board + "\nWhich spot will you pick?");
            int pickI = Integer.parseInt(pick);
        }

    }
}
