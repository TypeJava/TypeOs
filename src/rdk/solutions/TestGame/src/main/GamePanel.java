package src.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import src.entity.*;
import java.util.Map;

public class GamePanel extends JPanel implements Runnable {
    public final int originalTileSize = 16;
    public final int scale = 3;
    public final int tileSize = originalTileSize * scale;
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;
    
    keyHandler kh = new keyHandler();
    public Thread gameThread;
    public Player player = new Player(this, kh);
    public NPC npc = new NPC(this, kh);
    
    int FPS = 60;
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(kh);
        this.setFocusable(true);
        
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            
            lastTime = currentTime;
            
            if(delta >= 1) {
                update();
                repaint();
                player.update();
                npc.update();
                delta--;
            }
        }
    }
    
    public void update() {
        player.update();
        npc.update();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;
        Graphics2D g2 = (Graphics2D) g;
        player.draw(g1);
        npc.draw(g2);
        g2.dispose();
    }
}

