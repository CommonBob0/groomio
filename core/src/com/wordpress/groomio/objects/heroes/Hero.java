package com.wordpress.groomio.objects.heroes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.wordpress.groomio.assets.Assets;

/**
 * Created by Jam on 23.03.2017.
 */

abstract class Hero extends Image {
    //Assets assets = new Assets();
    String name = "Common Hero";
    private Texture texture;
    int hp = 10;
    int mana = 10;
    int energy = 0;
    int damage = 1;
    int magic_damage = 0;
    int shield = 0;
    int attack = 1;
    int magic = 0;

    public Hero(Texture texture){
        super(texture);
        this.texture = texture;
    }
}
