/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Korisnik
 */
public class Alien {
    private int x;
    private int y;
    private int dx;
    private int dy;
    
    private int width;
    private int height;
    
    private Image image;

    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
        
        width = 100;
        height = 100;
        
        image = new ImageIcon(getClass().getResource("alien.png")).getImage();
    }
    
    public void draw(Graphics2D g2) {
        g2.drawImage(image, x, y, width, height, null);
    }
    
    public Rectangle2D.Double getBounds() {
        return new Rectangle2D.Double(x, y, width, height);
    }
}
