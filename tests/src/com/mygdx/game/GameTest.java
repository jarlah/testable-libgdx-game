package com.mygdx.game;

import com.mygdx.game.util.GdxTestRunner;
import com.mygdx.game.util.MockGameEngine;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class GameTest {

    private Game game;

    @Before
    public void init() {
        this.game = new Game(new MockGameEngine());
    }

    @Test
    public void test() {
        game.create();
        game.render();
        game.dispose();
    }
}
