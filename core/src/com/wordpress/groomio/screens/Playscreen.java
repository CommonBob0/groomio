package com.wordpress.groomio.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wordpress.groomio.Groomio;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Playscreen extends AbstractScreen {

    private Texture logo;

    public Playscreen(Groomio game){
        super(game);
        init();
    }

    private void init() {
        //TODO
        logo = new Texture("logo.png");
    }

    @Override
    public void render(float delta){
        super.render(delta);

        batch.begin();
        batch.draw(logo,Groomio.WIDTH/2, Groomio.HEIGHT/2);
        batch.end();
    }
}
