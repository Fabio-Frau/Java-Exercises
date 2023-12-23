package com.ff.simplerl.map;

import processing.core.PGraphics;

import java.util.ArrayList;
import java.util.List;

public abstract class Tile {

    public static int SIZE = 16;
    protected boolean walkable;
    protected final PGraphics gfx;
    protected Item item;


    protected Tile(PGraphics gfx) {
        this.gfx = gfx;
        item = null;
    }

    public boolean isWalkable() {
        return walkable;
    }

    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public abstract void draw(int x, int y) ;

    public void drawItem(int x, int y) {};
}
