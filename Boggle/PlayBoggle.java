
/**
 * A game of boggle is played.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.time.LocalTime;
import java.util.Scanner;
public class PlayBoggle
{
    /**
     * A game of Boggle is played
     */
    public PlayBoggle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players are there?");
        int numPlayers = sc.nextInt();  //the number of players
        /*construct an array of players
         * if numPlayers == 1, then the size of the array is 2
         * The second player is an AI
         */
        if (numPlayers > 1)
        {
            Player[] players = new Player[numPlayers];
        }
        else
        {
            Player[] players = new Player[2];
        }
        System.out.println("How many turns do you want this to last for?");
        int numTurns = sc.nextInt();    /*the number of turns included
                                         * in this particular game
                                         * since there wasn't a set number
                                         * in any set of rules that I found
                                         */
        for (int i = 0; i < numTurns; i++)
        {
            //takes a turn
        }
    }
}
