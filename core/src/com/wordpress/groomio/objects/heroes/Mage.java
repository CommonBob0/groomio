package com.wordpress.groomio.objects.heroes;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Jam on 28.03.2017.
 */

public class Mage extends Hero {
        private final static int WIDTH = 64;
        private final static int HEIGHT = 64;
        Texture texture;
        public Mage(Texture texture){
            super(texture);
            this.texture = texture;
            name = randomName();

            setSize(WIDTH,HEIGHT);

            setStats();

        }

        private void setStats(){
            hp = 100;
            intelligence = 5;
            mana = 10;
        }

        public int getIntel(){
            return intelligence;
        }

}
