package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;
import com.mygdx.game.engine.Engine;
import com.mygdx.game.util.GdxTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(GdxTestRunner.class)
public class EntryPointTest {

    private EntryPoint entryPoint;

    @Before
    public void init() {
        final Engine fakeEngine = mock(Engine.class);
        final SpriteBatch fakeBatch = mock(SpriteBatch.class);
        when(fakeEngine.getBatch()).thenReturn(fakeBatch);
        final Textures textures = new Textures(mock(AssetManager.class));
        when(fakeEngine.getTextures()).thenReturn(textures);
        when(fakeEngine.withGame(any(Game.class))).thenReturn(fakeEngine);
        this.entryPoint = new EntryPoint(fakeEngine);
    }

    @Test
    public void test() {
        entryPoint.create();
        entryPoint.render();
        entryPoint.dispose();
    }
}
