package com.mygdx.game.screens;

import com.mygdx.game.assets.Textures;
import com.mygdx.game.engine.Engine;

public class MainMenu extends AbstractScreen {
    public MainMenu(Engine game) {
        super(game);
    }

    public void render(float delta) {
        getEngine().clear();
        getEngine().getBatch().begin();
        getEngine().getBatch().draw(getEngine().getTextures().getTexture(Textures.someTexture), 0, 0);
        getEngine().getBatch().end();
    }
}
