package com.wordpress.groomio.screens;
import com.badlogic.gdx.graphics.Texture;
import com.wordpress.groomio.Groomio;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class LogoScreen extends AbstractScreen {

    private Texture logo;

    public LogoScreen(Groomio game){
        super(game);
        init();
    }

    private void init() {
        //TODO
        logo = new Texture("logo2.png");
    }

    @Override
    public void render(float delta){
        super.render(delta);

        batch.begin();
        batch.draw(logo,Groomio.WIDTH/2, Groomio.HEIGHT/2);
        batch.end();
    }
}