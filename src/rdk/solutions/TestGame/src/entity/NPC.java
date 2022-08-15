 package src.entity;
import src.main.*;
import java.awt.*;
import java.awt.event.*;

public class NPC extends Entity {
    GamePanel gp;
    keyHandler kh;
    int gotox;
    int gotoy;
    boolean cordc = false;
    
    public NPC(GamePanel gp, keyHandler kh) {
        this.gp = gp;
        this.kh = kh;
        
        setDefaultValues();
    }
    
    public void setDefaultValues() {
        x = (gp.screenWidth / 2) - gp.tileSize * 2;
        y = (gp.screenHeight / 2);
        speed = 4;
        color = Color.YELLOW;
        direction = "right";
        
        
    }
    public void update() {
        if(kh.uaPressed == true) {
            if(y != 0) {

                direction = "up";
                y -= speed;
                
            }
        }
        if(kh.daPressed == true) {

            if(y != gp.screenHeight - gp.tileSize) {
                direction = "down";
                y += speed;
            }
        }
        if(kh.laPressed == true) {
            if(x != 0) {
                direction = "left";
                x -= speed;
            }
        }
        if(kh.raPressed == true) {
            if(x != gp.screenWidth - gp.tileSize) {
                direction = "right";
                x += speed;
            }
        }
        if(kh.controlPressed == true){
           if(x != 0) {
                if(direction == "right"){
                    x += speed + 3;
                }else if(direction == "left"){
                    
                }
            }
        }
    }
    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}