
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private int score = 0;  //everyone starts with 0
    private String name;
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
    }
}
