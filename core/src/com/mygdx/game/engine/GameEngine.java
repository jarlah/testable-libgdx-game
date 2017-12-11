package com.mygdx.game.engine;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.assets.Textures;

public class GameEngine implements Engine {
    private SpriteBatch spriteBatch;
    private Textures textures;
    private Game game;

    @Override
    public Textures getTextures() {
        if (textures == null) {
            textures = new Textures();
            textures.load();
            textures.finishLoading();
        }
        return textures;
    }

    @Override
    public SpriteBatch getBatch() {
        if (spriteBatch == null) {
            spriteBatch = new SpriteBatch();
        }
        return spriteBatch;
    }

    @Override
    public void clear() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        textures.dispose();
    }

    @Override
    public Engine withGame(Game game) {
        this.game = game;
        return this;
    }

    @Override
    public void setScreen(Screen screen) {
        if (this.game == null) {
            throw new IllegalStateException("game is not set");
        }
        this.game.setScreen(screen);
    }
}
