package com.ff.simplerl.map;

import com.ff.simplerl.Player;
import processing.core.PGraphics;

public class Potion extends Item{

    private int healingPower;

    public Potion(PGraphics gfx) {
        super(gfx);
        this.healingPower = 10;
    }

    @Override
    public void draw(int x, int y) {
        gfx.fill(155,10,255);
        gfx.circle(x + Tile.SIZE/2,y + Tile.SIZE/2,16);
    }

    @Override
    public void use(Player player) {
        player.modifyHealthBy(this.healingPower);
    }
}
