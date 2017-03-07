package com.wordpress.groomio.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Commonbob on 05.03.2017.
 */

public class GameObject extends Rectangle {

    protected Texture texture;

    public GameObject(Texture texture){

        this.texture = texture;
    }

    public Texture getTexture(){
        return texture;
    }

    public void setTexture(Texture texture){
        this.texture = texture;
    }
}
