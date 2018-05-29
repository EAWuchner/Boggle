
/**
 * Write a description of class Player here.
 *
 * @author Katherine Chong, Caitlin Hruby, and Emily Wuchner
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.time.LocalTime;
import java.util.Scanner;
public class Player
{
    private int score = 0;  //everyone starts with 0
    private String name = "Computer";
    private ArrayList<String> words = new ArrayList<>();
    /**
     * Creates a player for the game Boggle
     * @param   name    the name of the player
     */
    public Player(String name)
    {
        name = this.name;
    }
    
    /**
     * Gets the name of the player
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the player's score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Updates the player's score
     */
    public void updateScore(int points)
    {
        score += points;
        words = new ArrayList<>();  //resets the number of words
        System.out.println(name+" has a score of "+score);
    }
    
    public boolean getAISTatus()
    {
        return false;   //this is a human player
    }
    
    public void takeTurn()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("It is now "+name+"'s turn.");
        LocalTime endTurn = LocalTime.now();
        endTurn.minusMinutes(3);
        while (LocalTime.now() != endTurn)
        {
            System.out.print("Enter a word based on what you see: ");
            String word = scan.next();
            if (word.length() >= 3)
            {
                words.add(word);
            }
        }
    }
}
