package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.engine.Engine;
import com.mygdx.game.screens.MainMenu;

public class EntryPoint extends Game {
	private final Engine engine;

	public EntryPoint(Engine engine) {
		this.engine = engine.withGame(this);
	}

	@Override
	public void create () {
		this.engine.setScreen(new MainMenu(this.engine));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		engine.dispose();
	}
}
