package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.EntryPoint;
import com.mygdx.game.engine.GameEngine;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		EntryPoint entryPoint = new EntryPoint(new GameEngine());
		new LwjglApplication(entryPoint, config);
	}
}
