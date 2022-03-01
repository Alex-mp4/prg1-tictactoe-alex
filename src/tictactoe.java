import javax.swing.*;

public class tictactoe {
    public static void main(String[] args) {
        String size = JOptionPane.showInputDialog("Size:");
        int sizeI = Integer.parseInt(size);
        int sizeT = sizeI * sizeI;

        String board = boardplan(sizeI);
        char[] boardA = board.toCharArray();

        int j = 3;

        String player1 = "X";
        String player2 = "O";
        char play1 = player1.charAt(0);
        char play2 = player2.charAt(0);

        while(winCon() == false) {
            String spot = JOptionPane.showInputDialog(board + "\nWhat spot?");
            int spotI = Integer.parseInt(spot);
            char spotC = spot.charAt(0);
            j = j + 1;
            int curTurnI = currentPlayer(j);

            for (int l = 0; l < sizeT; l++) {
                if (spotI < 10) {
                    if (spotC == boardA[l]) {
                        if(curTurnI == 1){
                            boardA[l] = play1;
                            board = String.valueOf(boardA);
                        }
                        if(curTurnI == 2){
                            boardA[l] = play2;
                            board = String.valueOf(boardA);
                        }
                    }
                }

                //bif (spotI > 10 && spotI < 100) {
                    //checka ifall spot är samma som char[] och ta nog många siffror ifrån det beroende på antalet siffror
                //}
                //bif (spotI > 100 && spotI < 1000) {

                //}
                else{
                    break;
                }
            }
        }

    }

    private static int currentPlayer(int j) {
        int c;

        while(j > 2) {
            j = j - 2;
        }
        if(j == 2){
            c = 1;
        }
        else {
            c = 2;
        }

        return c;
    }

    static boolean winCon() {
        return false;
    }

    static String boardplan(int sizeI) {

        StringBuilder board = new StringBuilder();
        int p = 0;

        for(int i = 0; i < sizeI; i++) {
            for(int o = 0; o < sizeI; o++) {
                p++;
                board.append(p).append(" ");
            }
            board.append("\n");
        }
        return board.toString();
    }
}
