/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author yubaraj
 */
public class Quiz extends JFrame {
 
    public Quiz(){
        add(new SplashScreen().getSplash());
        setSize(400, 400);
        setVisible(true);
    }   
}
