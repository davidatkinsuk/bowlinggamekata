package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameTest {

    private Game g;

    @BeforeEach
    public void setup() {
        g = new Game();
    }

    @Test
    public void gutterGame() {
        rollMany(20,0);
        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnes() {
        rollMany(20,1);
        assertThat(g.score(), is(20));
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        roll(3);
        rollMany(17,0);
        assertThat(g.score(), is(16));
    }

    @Test
    public void testOneStrike() {
        rollStrike();
        roll(3);
        roll(4);
        rollMany(16, 0);
        assertThat(g.score(), is(24));
    }

    @Test
    public void testPerfectGame() {
        rollMany(12,10);
        assertThat(g.score(), is(300));
    }

    private void roll(int pins) {
        g.roll(pins);
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollMany(int n, int pins) {
        for(int i = 0 ; i<n; i++) {
            g.roll(pins);
        }
    }

}
