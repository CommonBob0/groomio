package com.wordpress.groomio;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//import com.wordpress.groomio.screens.Playscreen;
import com.wordpress.groomio.assets.Assets;
import com.wordpress.groomio.screens.*;

public class Groomio extends Game {

	public final static String GAME_NAME = "Groomio";
	public final static int WIDTH = 800;
	public final static int HEIGHT = 480;

	private boolean paused;

	@Override
	public void create () {
		//batch = new SpriteBatch();
		//assets = new Assets();
		this.setScreen(new LogoScreen(this));

	}

	@Override
	public void render () {

		super.render();
	}
	
	@Override
	public void dispose () {

	}

	// Getters and Setters //

	public boolean isPaused() {

		return paused;
	}

	public void setPaused(boolean paused) {

		this.paused = paused;
	}
}
