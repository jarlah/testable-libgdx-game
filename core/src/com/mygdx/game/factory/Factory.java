package com.mygdx.game.factory;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public interface Factory {
    Textures newTextures();
    SpriteBatch newSpriteBatch();
    GL20 getGl();
}
