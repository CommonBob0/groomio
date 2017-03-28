package com.wordpress.groomio.objects.heroes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.wordpress.groomio.Groomio;
import com.wordpress.groomio.objects.GameObject;

import java.util.Random;

/**
 * Created by Jam on 23.03.2017.
 */

public class Warrior extends Hero {
    private final static int WIDTH = 160;
    private final static int HEIGHT = 100;

    private int pos_x = 300;
    private int pos_y = 300;

    int hp = 100;
    String name;
    String[] names = new String[]{"Bob", "Hans", "Zbigniew", "Theo" };
    Texture texture;
    public Warrior(Texture texture){
        super(texture);
        this.texture = texture;
        //this.texture = t;
        randomName();
        set();

    }

    private void set() {

        this.setOrigin(texture.getWidth()/2, texture.getHeight()/2);
        //this.setPosition(Groomio.WIDTH/2, Groomio.HEIGHT/2);
        this.setSize(WIDTH, HEIGHT);

        // starting position
        //this.setPosition(pos_x, pos_y);
    }

    private void randomName(){
        Random ran = new Random();
        int n = ran.nextInt(names.length);
        name = names[n];
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String getName() {
        return name;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
