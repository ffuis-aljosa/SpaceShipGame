package spaceship;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Korisnik
 */
public class SpaceShip {
    private int x;
    private int y;
    private int dx;
    private int dy;
    
    private int width;
    private int height;
    
    private Image image_one, image_two;
    
    private int imageState;

    public SpaceShip(int x, int y) {
        this.x = x;
        this.y = y;
        
        width = 100;
        height = 50;
        
        image_one = new ImageIcon(getClass().getResource("spaceship1.png")).getImage();
        image_two = new ImageIcon(getClass().getResource("spaceship2.png")).getImage();
        
        imageState = 0;
    }
    
    public void draw(Graphics2D g2) {
        if(imageState == 0)
            g2.drawImage(image_one, x, y, width, height, null);
        else if (imageState == 1)
            g2.drawImage(image_two, x, y, width, height, null);
        
        imageState = (imageState + 1) % 2;
    }
    
    public Rectangle2D.Double getBounds() {
        return new Rectangle2D.Double(x, y, width, height);
    }
        
}
