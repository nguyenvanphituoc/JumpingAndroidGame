package com.example.phituocpc.jumping.jumper.model;

import com.badlogic.androidgames.framework.gamedev2d.GameObject;

/**
 * Created by dell on 8/5/2016.
 * nguyen van phi tuoc
 */
public class Coin extends GameObject {
    public static final float COIN_WIDTH = 0.5f;
    public static final float COIN_HEIGHT = 0.8f;
    public static final int COIN_SCORE = 10;
    float stateTime;

    public Coin(float x, float y) {
        super(x, y, COIN_WIDTH, COIN_HEIGHT);
        stateTime = 0;
    }

    public void update(float deltaTime) {
        stateTime += deltaTime;
    }
}