package com.wordpress.groomio;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.wordpress.groomio.screens.Playscreen;

public class Groomio extends Game {
	public SpriteBatch batch;
	public final static int WIDTH = 800;
	public final static int HEIGHT = 480;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new Playscreen(this));

	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {

	}
}
