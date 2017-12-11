package com.mygdx.game.engine;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public interface Engine {
    Textures newTextures();
    SpriteBatch newSpriteBatch();
    GL20 getGl();
}
