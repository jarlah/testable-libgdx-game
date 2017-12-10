package com.mygdx.game.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;
import com.mygdx.game.factory.Factory;

import static org.mockito.Mockito.mock;

public class MockGameFactory implements Factory{
    private final GL20 gl;

    public MockGameFactory() {
        this.gl = mock(GL20.class);
        Gdx.gl = this.gl;
    }
    @Override
    public Textures newTextures() {
        return new Textures();
    }

    @Override
    public SpriteBatch newSpriteBatch() {
        return mock(SpriteBatch.class);
    }

    @Override
    public GL20 getGl() {
        return gl;
    }
}