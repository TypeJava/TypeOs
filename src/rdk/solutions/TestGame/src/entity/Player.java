package src.entity;

import src.main.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends Entity {
    GamePanel gp;
    keyHandler kh;

    public Player(GamePanel gp, keyHandler kh) {
        this.gp = gp;
        this.kh = kh;

        setDefaultValues();
    }

    public void setDefaultValues() {
        x = (gp.screenWidth / 2);
        y = (gp.screenHeight / 2);
        speed = 4;
        color = Color.WHITE;
        direction = "right";

    }

    public void update() {

        if (kh.upPressed == true) {
            if (y != 0) {

                direction = "up";
                y -= speed;

            }
        }
        if (kh.downPressed == true) {

            if (y != gp.screenHeight - gp.tileSize) {
                direction = "down";
                y += speed;
            }
        }
        if (kh.leftPressed == true) {
            if (x != 0) {
                direction = "left";
                x -= speed;
            }
        }
        if (kh.rightPressed == true) {

            if (x != gp.screenWidth - gp.tileSize) {
                direction = "right";
                x += speed;
            }
        }
        
       

    }

    public void draw(Graphics2D g1) {

        g1.setColor(color);
        g1.fillRect(x, y, gp.tileSize, gp.tileSize);

    }
}