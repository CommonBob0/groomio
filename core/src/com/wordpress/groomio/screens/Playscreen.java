package com.wordpress.groomio.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wordpress.groomio.Groomio;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Playscreen implements Screen {
    private Groomio game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    Texture texture;
    int w = 0;
    int h = 0;
    int tw = 0;
    int th = 0;

    public Playscreen(Groomio game){
        this.game = game;

        w = Gdx.graphics.getWidth();
        h = Gdx.graphics.getHeight();
        texture = new Texture("logo2.png");
        gameCam = new OrthographicCamera(w, h);
        gameCam.position.set(w/2, h/2 ,0);
        gameCam.update();
        tw = texture.getWidth();
        th = texture.getHeight();
        gamePort = new FitViewport(Groomio.WIDTH, Groomio.HEIGHT, gameCam);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();

        game.batch.draw(texture, gameCam.position.x - (tw/2), gameCam.position.y - (th/2));
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
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
