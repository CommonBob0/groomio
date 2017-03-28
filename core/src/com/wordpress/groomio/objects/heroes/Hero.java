package com.wordpress.groomio.objects.heroes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.wordpress.groomio.assets.Assets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jam on 23.03.2017.
 */

abstract class Hero extends Image {
    //Assets assets = new Assets();
    String name = "Common Hero";
    protected Texture texture;
    //protected List<Texture> warriorT;
    int hp = 10;
    int mana = 10;
    int energy = 0;
    int damage = 1;
    int magic_damage = 0;
    int shield = 0;
    int attack = 1;
    int magic = 0;
    int intelligence = 0;
    int strength = 0;
    String[] names = new String[]{"Bob", "Hans", "Zbigniew", "Theo" };

    public Hero(Texture texture){
        super(texture);
        this.texture = texture;
        //warriorT = new ArrayList<Texture>();
    }



    protected String randomName(){
        Random ran = new Random();
        int n = ran.nextInt(names.length);
        name = names[n];
        return name;
    }


    // Gettery i settery
    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
}
