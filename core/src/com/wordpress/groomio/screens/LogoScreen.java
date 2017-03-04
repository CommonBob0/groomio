package com.wordpress.groomio.screens;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.wordpress.groomio.Groomio;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class LogoScreen extends AbstractScreen {

    private Texture logo;

    public LogoScreen(final Groomio game){
        super(game);
        init();

        Timer.schedule(new Timer.Task() {

            @Override
            public void run() {
                game.setScreen(new Main_menu(game));
            }
        }, 2);


    }

    private void init() {
        //TODO
        logo = new Texture("logo2.png");
    }

    @Override
    public void render(float delta){
        super.render(delta);

        batch.begin();
        batch.draw(logo,Groomio.WIDTH/2 - logo.getWidth()/2, Groomio.HEIGHT/2 - logo.getHeight()/2);
        batch.end();
    }
}