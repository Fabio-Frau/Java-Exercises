package com.ff.simplerl;

import processing.core.PGraphics;

public class Player {

    public static int SIZE = 16;

    private final PGraphics gfx;
    private int x;
    private int y;
    private int health;

    public Player(PGraphics gfx) {
        this.gfx = gfx;
        this.x = 0;
        this.y = 0;
        this.health = 200;
    }

    public void moveX(int dx) {
        this.x += dx;
    }

    public void moveY(int dy) {
        this.y += dy;
    }

    public void move(int dx, int dy) {
        moveX(dx);
        moveY(dy);
    }

    public void draw() {
        gfx.fill(255,0,0);
        gfx.rect(x * Player.SIZE,y * Player.SIZE,Player.SIZE,Player.SIZE);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void modifyHealthBy(int dHealth) {
        this.health += dHealth;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
