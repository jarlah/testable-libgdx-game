package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.mygdx.game.engine.Engine;

public abstract class AbstractScreen implements Screen {
    private final Engine engine;

    AbstractScreen(Engine game) {
        super();
        this.engine = game;
    }

    Engine getEngine() {
        return engine;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
