/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author yubaraj
 */
public class ButtonSample {
  public ButtonSample(){
      // first container
      JFrame jframe = new JFrame("Button Sample");
      JButton button = new JButton("Click me");
      button.setBounds(50, 100, 100, 20);
      jframe.add(button);
      jframe.setSize(300, 300);
      jframe.setLayout(null);
      jframe.setVisible(true);
      
      button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("I am clicked");
          }
      });
  }   
}
