package com.ff.simplerl.map;

import com.ff.simplerl.Player;
import processing.core.PGraphics;

public abstract class Item {
    protected final PGraphics gfx;

    public Item(PGraphics gfx) {
        this.gfx = gfx;
    }

    public abstract void draw(int x, int y);


    public  void use(Player player) {
    }
}
