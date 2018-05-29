
/**
 * A game of boggle is played.
 *
 * @author Katherine Chong, Caitlin Hruby, and Emily Wuchner
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PlayBoggle
{
    /**
     * A game of Boggle is played
     */
    public PlayBoggle()
    {
        Scanner sc = new Scanner(System.in);
        Player[] players;
        System.out.print("How many players are there?");
        int numPlayers = sc.nextInt();  //the number of players
        /*construct an array of players
         * if numPlayers == 1, then the size of the array is 2
         * The second player is an AI
         */
        if (numPlayers > 1)
        {
            players = new Player[numPlayers];
            for (int i = 0; i < numPlayers; i++)
            {
                System.out.print("What is your name? ");
                String name = sc.nextLine();
                players[i] = new Player(name);
            }
        }
        else
        {
            players = new Player[2];
            //initializes human player
            System.out.print("What is your name? ");
            String name = sc.nextLine();
            players[0] = new Player(name);
            players[1] = new AIPlayer("Computer");
            numPlayers = 2;
        }
        System.out.println("How many turns do you want this to last for?");
        int numTurns = sc.nextInt();    /*the number of turns included
                                         * in this particular game
                                         * since there wasn't a set number
                                         * in any set of rules that I found
                                         */
        for (int i = 0; i < numTurns; i++)
        {
            Boggle board = new Boggle();
            board.toStringMeth();
            for (int j = 0; j < numPlayers; j++)
            {
                players[j].takeTurn();
            }
            int[] playerPoints = new int[numPlayers];
            //check to see if all words are valid and if there are any duplicates
            //make assign points to each player
            for (int k = 0; k < numPlayers; k++)    //update player scores
            {
                players[k].updateScore(playerPoints[k]);
            }
        }
        
        int[] totalScores = new int[numPlayers];
        int highScore = 0;  //records the highest score in the Player array
        int winner = 0; //records the position in the array of the winning player
        for (int i = 0; i < numPlayers; i++)
        {
            int score = players[i].getScore();
            if (score > highScore)
            {
                highScore = score;
                winner = i;
            }
            System.out.println(players[i].getName()+" has a score of: "+score);
        }
        System.out.println(players[winner].getName()+" won!");
    }
}
