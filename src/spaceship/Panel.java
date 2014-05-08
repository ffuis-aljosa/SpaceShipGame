package spaceship;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Korisnik
 */
public class Panel extends JPanel implements ActionListener {

    private int PANEL_WIDTH = 800;
    private int PANEL_HEIGTH = 600;
    
    Timer timer;
    
    SpaceShip ship;
    ArrayList<Alien> aliens = new ArrayList<>();
    
    long counter = 0;
    
    public Panel() {        
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGTH));
        setBackground(Color.BLACK);
        
        ship = new SpaceShip(0, PANEL_HEIGTH/2);
        
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            aliens.add(new Alien(r.nextInt(PANEL_WIDTH), r.nextInt(PANEL_HEIGTH)));
        }
        
        timer = new Timer(20, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        ship.draw(g2);
        
        for (int i = 0; i < aliens.size(); i++) {
            aliens.get(i).draw(g2);
        }
        
        g2.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        checkIntersections();
        repaint();
    }

    private void checkIntersections() {
        for (int i = 0; i < aliens.size(); i++) {
            if (aliens.get(i).getBounds().intersects(ship.getBounds())) {
                
            }
        }
    }
    
}
