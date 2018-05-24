
/**
 * Write a description of class Boggle here.
 *
 * @author (your name)
 * @version (a version number or a date)
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