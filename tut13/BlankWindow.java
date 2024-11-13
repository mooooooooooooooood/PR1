package PR1.tut13;
import javax.swing.JPanel;
import java.awt.*;

public class BlankWindow extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
                setPreferredSize(new Dimension());
        }
}

