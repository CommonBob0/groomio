package com.wordpress.groomio.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.wordpress.groomio.Groomio;
import com.wordpress.groomio.objects.GameObject;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Main_menu extends AbstractScreen {

    //private Texture button; // TODO button as a actor it means it should be clickable and set correctly screen
    private Texture background; // TODO Village in the background
    private GameObject button;

    public Main_menu(final Groomio game){
        super(game);
    }

    @Override
    protected void init(){
        button = new GameObject(assets.manager.get("button2.png", Texture.class));
        background = assets.manager.get("menu_background.png", Texture.class);
    }

    @Override
    public void render(float delta){
        super.render(delta);

        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(button.getTexture(),
                    Groomio.WIDTH/2 - button.getTexture().getWidth()/2,
                    Groomio.HEIGHT - button.getTexture().getHeight()*3);

        // TODO
        batch.end();
    }
}
