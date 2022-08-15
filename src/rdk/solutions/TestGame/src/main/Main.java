package src.main;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import java.io.File;
import java.lang.Object;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        JFrame window = new JFrame("Test Game");
        // TODO Create sprites.

        // JLabel l1;
        // window.setContentPane(new JLabel(new
        // ImageIcon("C:/Users/Levi/Documents/TypeOs/TypeOs/src/rdk/solutions/TestGame/src/main/wal0.png")));
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/icon.png");
        window.setIconImage(icon);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        // window.setTitle(" ");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}