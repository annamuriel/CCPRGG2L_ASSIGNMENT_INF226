import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu() {
        
        JLabel imageLabel = new JLabel();
        ImageIcon shinchanImage = new ImageIcon("shinchan.gif");
        imageLabel.setIcon(shinchanImage);
        // add image to frame
        this.add(imageLabel);

        // JButton
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        button.addActionListener(new EventHandler());
        // add button to frame
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set bg color of frame
        this.getContentPane().setBackground(Color.MAGENTA);
        // lock frame
        this.setResizable(false);
    }

    // event handler
    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            // open game frame
            new GameFrame();
            // close main menu frame
            dispose();
        }
    }
}