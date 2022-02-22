import javax.swing.*;

public class tictactoe {
    public static void main(String[] args) {
        String size = JOptionPane.showInputDialog("Size:");
        int sizeI = Integer.parseInt(size);
        int sizeT = sizeI * sizeI;

        String board = boardplan(sizeI);
        char[] boardA = board.toCharArray();

        String spot = JOptionPane.showInputDialog(board + "\nWhat spot?");
        int spotI = Integer.parseInt(spot);

        for(int l = 0; l < sizeT; l++) {
            if(spotI < 100){
            //checka ifall spot är samma som char[] och ta nog många siffror ifrån det beroende på antalet siffror
            }
            if(spotI > 100 && spotI < 1000){

            }
        }

    }
    static String boardplan(int sizeI) {

        String board = "";
        int p = 0;

        for(int i = 0; i < sizeI; i++) {
            for(int o = 0; o < sizeI; o++) {
                p++;
                board += p + " ";
            }
            board += "\n";
        }
        return board;
    }
}
