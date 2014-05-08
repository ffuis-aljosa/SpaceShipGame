/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceship;

import javax.swing.JFrame;

/**
 *
 * @author Korisnik
 */
public class Frame extends JFrame {

    public Frame() {
        add(new Panel());
        pack();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
