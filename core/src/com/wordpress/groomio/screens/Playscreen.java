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
import com.wordpress.groomio.objects.heroes.Warrior;

/**
 * Created by Commonbob on 04.03.2017.
 */

public class Playscreen extends AbstractScreen {

    private Texture background;
    Warrior warrior;
    Texture warriorT;
    String name;
    public Playscreen(Groomio game){
        super(game);
    }

    protected void init() {
        //TODO
        initFirstHero();
        initBackground();
    }

    private void initFirstHero(){
        warriorT = assets.manager.get("realWarrior.png", Texture.class);
        warrior = new Warrior(warriorT);
        warrior.setPosition(Groomio.WIDTH/2, Groomio.HEIGHT/2);
        System.out.println(warrior.getName());
        stage.addActor(warrior);
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
