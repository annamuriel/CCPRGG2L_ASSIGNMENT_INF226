import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class TryAgain extends JFrame {

    TryAgain() {

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        
        JButton exitButton = new JButton();
        tryAgainButton.setText("Exit");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));

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
    
}
