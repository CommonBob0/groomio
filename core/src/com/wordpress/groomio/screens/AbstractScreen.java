package com.wordpress.groomio.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.wordpress.groomio.Groomio;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class AbstractScreen implements Screen {

    protected Groomio game;

    protected Stage stage;
    private OrthographicCamera camera;

    protected SpriteBatch batch;

    public AbstractScreen(Groomio game){
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(Groomio.WIDTH, Groomio.HEIGHT, camera));
        batch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);
    }

    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Groomio.WIDTH, Groomio.HEIGHT);
        camera.update();

    }


    @Override
    public void render(float delta){
        clearScreen();
        camera.update();
        batch.setProjectionMatrix(camera.combined);
    }

    private void clearScreen(){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void show(){}

    @Override
    public void  resume(){
        game.setPaused(false);
    }

    @Override
    public void pause(){
        game.setPaused(true);
    }

    @Override
    public void hide(){}

    @Override
    public void dispose(){
        game.dispose();
    }

    @Override
    public void resize(int width, int height) {
       //gamePort.update(width, height);
    }



}