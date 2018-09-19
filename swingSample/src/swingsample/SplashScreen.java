
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yubaraj
 */
public class SplashScreen {
    
   JPanel pane;
   
   public SplashScreen(){
       pane = new JPanel();
       JLabel text = new JLabel("Quiz Application");
       pane.add(text, BorderLayout.CENTER);
   }
  
  public JPanel getSplash(){
      return this.pane;
  } 
    
}
