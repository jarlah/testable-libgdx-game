package com.mygdx.game.factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public class GameFactory implements Factory {
    @Override
    public Textures newTextures() {
        return new Textures();
    }

    @Override
    public SpriteBatch newSpriteBatch() {
        return new SpriteBatch();
    }

    @Override
    public GL20 getGl() {
        return Gdx.gl;
    }
}
