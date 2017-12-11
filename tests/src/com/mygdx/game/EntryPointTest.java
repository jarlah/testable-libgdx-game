package com.mygdx.game;

import com.mygdx.game.util.GdxTestRunner;
import com.mygdx.game.util.MockGameEngine;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class EntryPointTest {

    private EntryPoint entryPoint;

    @Before
    public void init() {
        this.entryPoint = new EntryPoint(new MockGameEngine());
    }

    @Test
    public void test() {
        entryPoint.create();
        entryPoint.render();
        entryPoint.dispose();
    }
}
