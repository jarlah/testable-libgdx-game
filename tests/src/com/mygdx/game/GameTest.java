package com.mygdx.game;

import com.mygdx.game.util.GdxTestRunner;
import com.mygdx.game.util.MockGameFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class GameTest {

    private Game game;

    @Before
    public void init() {
        this.game = new Game(new MockGameFactory());
    }

    @Test
    public void test() {
        game.create();
        game.render();
        game.dispose();
    }
}
