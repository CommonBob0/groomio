package com.wordpress.groomio.assets;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Commonbob on 05.03.2017.
 */

public class Assets implements Disposable {

    public final AssetManager manager = new AssetManager();
    public void load(){
        manager.load("button2.png", Texture.class);
        manager.load("menu_background.png", Texture.class);
        manager.load("realWarrior.png", Texture.class);
        manager.load("Troll.png", Texture.class);
        manager.load("Mage.png", Texture.class);
    }

    @Override
    public void dispose(){

        manager.dispose();
    }
}
