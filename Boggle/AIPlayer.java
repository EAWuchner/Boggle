
/**
 * Write a description of class AIPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class AIPlayer extends Player
{
    private int score = 0;  //everyone starts with 0
    private String name;
    private ArrayList words = new ArrayList<>();
    /**
     * Creates a player for the game Boggle
     * @param   name    the name of the player
     */
    public AIPlayer(String name)
    {
        super(name);
    }
    
    public boolean getAISTatus()
    {
        return true;
    }
}
