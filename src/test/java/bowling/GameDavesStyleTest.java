package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameDavesStyleTest {

    private Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void gutter_game() {
        rollXTimesKnockingDownY(20,0);
        assertScore(0);
    }

    @Test
    public void test_all_ones() {
        rollXTimesKnockingDownY(20,1);
        assertScore(20);
    }

    @Test
    public void test_one_spare() {
        rollSpare();
        roll(3);
        rollXTimesKnockingDownY(17,0);
        assertScore(16);
    }

    @Test
    public void test_one_strike() {
        rollStrike();
        roll(3);
        roll(4);
        rollXTimesKnockingDownY(16, 0);
        assertScore(24);
    }

    @Test
    public void test_perfect_game() {
        rollXTimesKnockingDownY(12,10);
        assertScore(300);
    }

    private void roll(int pins) {
        game.roll(pins);
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollXTimesKnockingDownY(int x, int y) {
        for(int i = 0 ; i<x; i++) {
            game.roll(y);
        }
    }

    private void assertScore(int expectedScore) {
        assertThat(game.score(), is(expectedScore));
    }

}
