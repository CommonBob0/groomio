package com.wordpress.groomio.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.wordpress.groomio.Groomio;
import com.wordpress.groomio.hud.GameButton;
import com.wordpress.groomio.hud.IClickCallback;
import com.wordpress.groomio.objects.Entity;
import com.wordpress.groomio.objects.GameObject;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Main_menu extends AbstractScreen {

    //private Texture button; // TODO button as a actor it means it should be clickable and set correctly screen
    private Texture background; // TODO Village in the background
    private Entity entity;
    private TextButton playButton;
    private TextButton exitButton;
    private Skin menu_skin;

    public Main_menu(final Groomio game){

        super(game);

        initEntity();
    }

    @Override
    protected void init(){

        background = assets.manager.get("menu_background.png", Texture.class);
       // initEntity();
        initPlayButton();
        initExitButton();

    }


    private void initEntity(){
        //entity = new Entity();
        //stage.addActor(entity);
    }

    private void initPlayButton(){
        //button = assets.manager.get("button2.png", Texture.class);
        menu_skin = new Skin(Gdx.files.internal("pix/pixthulhu-ui.json"));
        playButton = new TextButton("Play", menu_skin);

        playButton.setPosition(Groomio.WIDTH/2 - playButton.getWidth()/2,
                               Groomio.HEIGHT - playButton.getHeight()*2);

        stage.addActor(playButton);
        playButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Playscreen(game));
            }
        });
    }

    private void initExitButton(){
        menu_skin = new Skin(Gdx.files.internal("pix/pixthulhu-ui.json"));
        exitButton = new TextButton("Exit", menu_skin);

        exitButton.setPosition(Groomio.WIDTH/2 - playButton.getWidth()/2,
                Groomio.HEIGHT - playButton.getHeight()*3);

        stage.addActor(exitButton);
        exitButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });
    }
    @Override
    public void render(float delta){
        super.render(delta);

        update();
        batch.begin();
        batch.draw(background, 0, 0, Groomio.WIDTH, Groomio.HEIGHT);
        batch.end();
        stage.draw();

    }

    private void update(){

        stage.act();
    }
}
