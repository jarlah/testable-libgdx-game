package com.mygdx.game.engine;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public interface Engine {
    Textures getTextures();
    SpriteBatch getBatch();
    Engine withGame(Game game);
    void setScreen(Screen screen);
    void clear();
    void dispose();
}
