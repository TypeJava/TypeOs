package src.main;
import java.awt.event.*;

public class keyHandler implements KeyListener {
    public boolean upPressed, downPressed, leftPressed, rightPressed, raPressed, uaPressed, daPressed, laPressed, shiftPressed, controlPressed;
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if(code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if(code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if(code == KeyEvent.VK_D) {
            rightPressed = true;
        }
        if(code == KeyEvent.VK_UP) {
            uaPressed = true;
        }
        if(code == KeyEvent.VK_RIGHT) {
            raPressed = true;
        }
        if(code == KeyEvent.VK_LEFT) {
            laPressed = true;
        }
        if(code == KeyEvent.VK_DOWN) {
            daPressed = true;
        }
        if(code == KeyEvent.VK_SHIFT){
            shiftPressed = true;
        }
        if(code == KeyEvent.VK_CONTROL){
            controlPressed = true;
        }
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if(code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if(code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if(code == KeyEvent.VK_D) {
            rightPressed = false;
        }
        if(code == KeyEvent.VK_UP) {
            uaPressed = false;
        }
        if(code == KeyEvent.VK_RIGHT) {
            raPressed = false;
        }
        if(code == KeyEvent.VK_LEFT) {
            laPressed = false;
        }
        if(code == KeyEvent.VK_DOWN) {
            daPressed = false;
        }
        if(code == KeyEvent.VK_SHIFT){
            shiftPressed = false;
        }
        if(code == KeyEvent.VK_CONTROL){
            controlPressed = false;
        }
        
    }
}