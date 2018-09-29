package jp.techacademy.shohei.yamamoto.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

public class Ufo extends GameObject{
    //横幅、高さ
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT = 1.3f;

    public Ufo(Texture texture,int srcX, int srcY , int srcWidth, int srcHeigth){
        super(texture,srcX,srcY,srcWidth,srcHeigth);
        setSize(UFO_WIDTH,UFO_HEIGHT);
    }
}