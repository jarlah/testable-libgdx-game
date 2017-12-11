package com.mygdx.game.util;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;
import com.mygdx.game.engine.Engine;

import static org.mockito.Mockito.mock;

public class MockGameEngine implements Engine {

    public static final Textures TEXTURES = new Textures();
    public static final SpriteBatch SPRITE_BATCH = mock(SpriteBatch.class);

    @Override
    public Textures getTextures() {
        return TEXTURES;
    }

    @Override
    public SpriteBatch getBatch() { return SPRITE_BATCH; }

    @Override
    public Engine withGame(Game game) {
        return this;
    }

    @Override
    public void setScreen(Screen screen) {}

    @Override
    public void clear() {}

    @Override
    public void dispose() {}
}
