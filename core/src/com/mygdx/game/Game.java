package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.factory.Factory;
import com.mygdx.game.assets.Textures;

public class Game extends ApplicationAdapter {
	private final Factory factory;

	private SpriteBatch batch;
	private Textures textures;

	public Game(Factory factory) {
		this.factory = factory;
	}

	@Override
	public void create () {
		textures = factory.newTextures();
		textures.load();
		textures.finishLoading();
		batch = factory.newSpriteBatch();
	}

	@Override
	public void render () {
		factory.getGl().glClearColor(1, 0, 0, 1);
		factory.getGl().glClear(GL20.GL_COLOR_BUFFER_BIT);
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
