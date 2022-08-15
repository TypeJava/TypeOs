package src.entity;
import src.main.*;
import java.awt.*;
import java.awt.event.*;

public class NpcBackup extends Entity {
    GamePanel gp;
    keyHandler kh;
    int gotox;
    int gotoy;
    boolean cordc = false;
    
    public NpcBackup(GamePanel gp, keyHandler kh) {
        this.gp = gp;
        this.kh = kh;
        
        setDefaultValues();
    }
    
    public void setDefaultValues() {
        x = (gp.screenWidth / 2) - gp.tileSize * 2;
        y = (gp.screenHeight / 2);
        speed = 6;
        color = Color.YELLOW;
        direction = "right";
        
        
    }
    public void update() {
        if(cordc) {
            cordc = true;
            gotox = gp.player.x;
            gotoy = gp.player.y;
        }
        if(!cordc) {
            if(gotox > x && x == gotox) {
                x += speed;
            }
            if(gotox < x && x == gotox) {
                x -= speed;
            }
            if(gotox == x) {
                if(gotoy > y && y == gotoy) {
                    y += speed;
                }
                if(gotoy < y && y == gotoy) {
                    y -= speed;
                }
                if(gotoy == y) {
                    cordc = true;
                }
            }
        }
    }
    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
