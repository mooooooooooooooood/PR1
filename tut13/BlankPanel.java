package PR1.tut13;
import javax.swing.*;

public class BlankPanel {
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("JFrame");
        BlankWindow p = new BlankWindow();
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null); // center the frame
                                        // make the program terminate when window closes
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); // make the window visible
    }

}
