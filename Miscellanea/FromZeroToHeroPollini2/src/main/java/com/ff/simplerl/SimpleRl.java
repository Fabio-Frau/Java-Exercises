package com.ff.simplerl;

import com.ff.simplerl.map.TileMap;
import processing.core.PApplet;
import processing.event.KeyEvent;

public class SimpleRl extends PApplet {

    private Player player;
    private TileMap map;

    @Override
    public void settings() {
        setSize(800,600);
    }

    @Override
    public void setup() {
        player = new Player(getGraphics());
        map = new TileMap(40,40, getGraphics());
    }

    @Override
    public void keyPressed() {
        int currentX = player.getX();
        int currentY = player.getY();
        int desiredX = currentX;
        int desiredY = currentY;
        if (key == CODED) {
            switch (keyCode) {
                case UP -> desiredY += -1;
                case DOWN -> desiredY += 1;
                case LEFT -> desiredX += -1;
                case RIGHT -> desiredX += 1;
            }
        }

        if(desiredY < 0) desiredY = 0;
        if(desiredX < 0) desiredX = 0;
        if(desiredX >= map.getCols()) desiredX = map.getCols() - 1;
        if(desiredY >= map.getRows()) desiredY = map.getRows() - 1;

        if (map.isWalkable(desiredX, desiredY)) {
            player.setX(desiredX);
            player.setY(desiredY);
            var item = map.getItem(desiredX, desiredY);
            if (item != null) {
                item.use(player);
                System.out.printf("healt = %d \n", player.getHealth());
                map.getTile(desiredX, desiredY).setItem(null);
            }
        }
    }

    @Override
    public void draw() {

        update();
        map.draw();
        player.draw();

    }

    private void update() {

    }

    public static void main(String[] args) {
        System.out.println("Java Simple Rouge Like");
        PApplet.main("com.ff.simplerl.SimpleRl");
    }

}
