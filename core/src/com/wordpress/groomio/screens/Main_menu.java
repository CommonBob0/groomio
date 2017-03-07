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

    private Texture button; // TODO button as a actor it means it should be clickable and set correctly screen
    private Texture background; // TODO Village in the background
    private Entity entity;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;
    private ImageButton playButton;

    public Main_menu(final Groomio game){

        super(game);
        initEntity();
    }

    @Override
    protected void init(){

        background = assets.manager.get("menu_background.png", Texture.class);
        initEntity();
        initPlayButton();
    }


    private void initEntity(){
        entity = new Entity();
        stage.addActor(entity);
    }

    private void initPlayButton(){
        //playButton = new GameButton(playButton);
        button = assets.manager.get("button2.png", Texture.class);
        myTextureRegion = new TextureRegion(button);
        myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);
        playButton = new ImageButton(myTexRegionDrawable);
        playButton.setX(Groomio.WIDTH/2 - playButton.getWidth()/2);
        playButton.setY(Groomio.HEIGHT/2 - playButton.getHeight()/2);
        stage.addActor(playButton);
        playButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ((Game)Gdx.app.getApplicationListener()).setScreen(new Playscreen(game));
            }
        });
    }
    @Override
    public void render(float delta){
        super.render(delta);

        update();
        batch.begin();
        //batch.draw(background, 0, 0);
        //batch.draw(button.getTexture(),
          //          Groomio.WIDTH/2 - button.getTexture().getWidth()/2,
            //        Groomio.HEIGHT - button.getTexture().getHeight()*3);
        stage.draw();

        // TODO
        batch.end();
    }

    private void update(){

        stage.act();
    }
}
