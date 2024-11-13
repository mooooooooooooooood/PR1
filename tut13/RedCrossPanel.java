package PR1.tut13;
import javax.swing.*;
import java.awt.*;

public class RedCrossPanel extends JPanel{
    public RedCrossPanel() {
        setPreferredSize(new Dimension(450, 450));
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(0, 0 , 450, 450);
        g.setColor(Color.WHITE);
        g.fillRect( 170, 75, 110, 300);
        g.setColor(Color.WHITE);
        g.fillRect( 75, 170, 300, 110);
    }
}
