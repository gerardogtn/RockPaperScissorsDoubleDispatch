import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerardogtn on 2/20/16.
 */
public class GameTest {

    GameObject rock;
    GameObject paper;
    GameObject scissors;
    Game game;


    @Before
    public void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        game = new Game();
    }

    @Test
    public void testTie() throws Exception {
        assertEquals(Game.TIE, game.play(rock, rock));
        assertEquals(Game.TIE, game.play(paper, paper));
        assertEquals(Game.TIE, game.play(scissors, scissors));
    }

    @Test
    public void testFirstPlayerWins() throws Exception {
        assertEquals(Game.PLAYER_ONE_WINS_MESSAGE, game.play(rock, scissors));
        assertEquals(Game.PLAYER_ONE_WINS_MESSAGE, game.play(scissors, paper));
        assertEquals(Game.PLAYER_ONE_WINS_MESSAGE, game.play(paper, rock));
    }

    @Test
    public void testSecondPlayerWins() throws Exception {
        assertEquals(Game.PLAYER_TWO_WINS_MESSAGE, game.play(rock, paper));
        assertEquals(Game.PLAYER_TWO_WINS_MESSAGE, game.play(paper, scissors));
        assertEquals(Game.PLAYER_TWO_WINS_MESSAGE, game.play(scissors, rock));
    }
}