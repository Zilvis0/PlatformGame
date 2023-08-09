package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(200, 200, 100, 50);
    }
}
