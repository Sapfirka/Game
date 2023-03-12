import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void testFirstPlayerStronger() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 70);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSecondPlayerStronger() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 20);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoPlayerStronger() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 50);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNotRegisteredPlayer1() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 70);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 1;
        Assertions.assertThrows(NoRegisteredException.class,
                () -> game.round("Viki", "Kate"));
    }

    @Test
    public void testNotRegisteredPlayer2() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 70);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 1;
        Assertions.assertThrows(NoRegisteredException.class,
                () -> game.round("Mary", "Viki"));
    }

    @Test
    public void testNotRegisteredPlayers() {
        Game game = new Game();
        Player Kate = new Player(1, "Kate", 50);
        Player Mary = new Player(2, "Mary", 70);

        game.register(Kate);
        game.register(Mary);
        int actual = game.round("Mary", "Kate");
        int expected = 1;
        Assertions.assertThrows(NoRegisteredException.class,
                () -> game.round("", ""));
    }
}