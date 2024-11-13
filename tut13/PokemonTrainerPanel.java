package PR1.tut13;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class PokemonTrainerPanel extends JPanel {
    BufferedImage img;
    public PokemonTrainerPanel() throws Exception{
        img = ImageIO.read(new File("pokemon_trainer.png"));
        setPreferredSize(new Dimension(450, 450));
    }
    @Override
    public void paintComponent(Graphics g) {
        int x = (getWidth() - img.getWidth())/2;
        int y = (getHeight() - img.getHeight())/2;
        g.drawImage(img, x, y, null);
    }
}
