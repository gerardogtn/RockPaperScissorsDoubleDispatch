/**
 * Created by gerardogtn on 2/20/16.
 */
public class Game {

    public static final String PLAYER_ONE_WINS_MESSAGE = "Player one wins";
    public static final String PLAYER_TWO_WINS_MESSAGE = "Player two wins";
    public static final String TIE = "It's a tie";

    public Game() {

    }

    public String play(GameObject playerOneChoice, GameObject playerTwoChoice) {
        if (playerOneChoice.beats(playerTwoChoice) && !playerTwoChoice.beats(playerOneChoice)) {
            return PLAYER_ONE_WINS_MESSAGE;
        } else if (!playerOneChoice.beats(playerTwoChoice) && playerTwoChoice.beats(playerOneChoice)) {
            return PLAYER_TWO_WINS_MESSAGE;
        } else {
            return TIE;
        }
    }

}
