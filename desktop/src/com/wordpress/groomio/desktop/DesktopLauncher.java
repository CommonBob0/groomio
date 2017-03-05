package com.wordpress.groomio.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wordpress.groomio.Groomio;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Groomio.WIDTH;
		config.height = Groomio.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new Groomio(), config);
	}
}
