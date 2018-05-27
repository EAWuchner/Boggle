
/**
 * The board for a game of Boggle
 *
 * @author Katherine Chong, Caitlin Hruby, and Emily Wuchner
 * @version 5/26/2018
 */
import java.util.Random;
import java.util.ArrayList;

public class Boggle
{
    char[][] board = new char[5][5];
    public Boggle()
    {
        ArrayList<Character> letters = new ArrayList<>();
        String alphabet = "aabcddeefghhiijkllmnnoopqrrssttuuvwxyz";
        Random num = new Random();
        for (int f = 0; f < alphabet.length(); f++)
        {
            letters.add(alphabet.charAt(f));
        }
        
        
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                int letter = num.nextInt(letters.size());
                board[i][j] = alphabet.charAt(letter);
                letters.remove(letter);
            }
        }
    }
    
    public void toStringMeth()
    {
        String boards="";
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board.length; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}