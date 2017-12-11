package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.engine.Engine;
import com.mygdx.game.assets.Textures;

public class Game extends ApplicationAdapter {
	private final Engine engine;

	private SpriteBatch batch;
	private Textures textures;

	public Game(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void create () {
		textures = engine.newTextures();
		textures.load();
		textures.finishLoading();
		batch = engine.newSpriteBatch();
	}

	@Override
	public void render () {
		engine.getGl().glClearColor(1, 0, 0, 1);
		engine.getGl().glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(textures.getTexture(Textures.someTexture), 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		textures.dispose();
	}
}
