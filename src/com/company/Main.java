package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Game Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();

   /* Main main = new Main();
    main.x();*/

    }


    public void x(){
        try {
            BufferedImage bufferedImage = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_1.png"));
            System.out.println(bufferedImage.getHeight());
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
