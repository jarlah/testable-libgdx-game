package com.mygdx.game.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public class GameEngine implements Engine {
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
