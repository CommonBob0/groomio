package com.wordpress.groomio.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.wordpress.groomio.Groomio;
import com.wordpress.groomio.objects.heroes.Mage;
import com.wordpress.groomio.objects.heroes.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Playscreen extends AbstractScreen {

    private Texture background;
    Warrior warrior;
    Warrior warrior2;
    Mage mage;
    Object hero;

    List<Texture> warriorT;
    List<Texture> mageT;
    List<Class> classes;
    String name;
    public Playscreen(Groomio game){
        super(game);
    }

    protected void init() {
        //TODO
        warriorT = new ArrayList<Texture>();
        mageT = new ArrayList<Texture>();
        classes = new ArrayList<Class>();
        initFirstHero();
        initBackground();


    }

    private void initFirstHero(){
        Random random = new Random();
        classes.add(Warrior.class);
        classes.add(Mage.class);
        int randomClass = random.nextInt(2);

        switch(randomClass){
            case 0:{
                // WOJOWNIK

                warriorT.add(assets.manager.get("realWarrior.png", Texture.class));
                warriorT.add(assets.manager.get("Troll.png", Texture.class));
                int randomTexture = random.nextInt(warriorT.size());

                warrior = new Warrior(warriorT.get(randomTexture));
                warrior.setPosition(Groomio.WIDTH/2 - warrior.getTexture().getWidth()/2, Groomio.HEIGHT/2- warrior.getTexture().getHeight()/2);
                System.out.println(warrior.getName());
                stage.addActor(warrior);

                break;
            }

            case 1:{

                // MAG
                mageT.add(assets.manager.get("Mage.png", Texture.class));

                mage = new Mage(mageT.get(0));
                mage.setPosition(Groomio.WIDTH/2 - mageT.get(0).getWidth()/2, Groomio.HEIGHT/2 - mageT.get(0).getHeight()/4);
                System.out.println(mage.getName());
                System.out.println(mage.getIntel());
                stage.addActor(mage);
                break;
            }
        }
        //warrior2 = new classes.get(randomClass).class(warriorT.randomTexture);
        //warriorT = assets.manager.get("realWarrior.png", Texture.class);

    }

    private void initBackground() {
        background = assets.manager.get("button2.png", Texture.class);
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
