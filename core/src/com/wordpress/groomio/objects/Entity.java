package com.wordpress.groomio.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.wordpress.groomio.assets.Assets;
/**
 * Created by Commonbob on 07.03.2017.
 */

public class Entity extends Image {
    private final static int WIDTH = 100;
    private final static int HEIGHT = 200;

    private final static int POS_X = 500;
    private final static int POS_Y = 300;

    public Entity(){
        super(new Texture("logo2.png"));

        this.setOrigin(WIDTH/2, HEIGHT/2);
        this.setSize(WIDTH, HEIGHT);

        // starting position
        this.setPosition(POS_X, POS_Y);
    }
}
