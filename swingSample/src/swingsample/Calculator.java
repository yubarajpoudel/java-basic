/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author yubaraj
 */
public class Calculator extends JFrame implements ActionListener {
    TextField inputFieldA, inputFieldB;
    JButton buttonAdd,  buttonSubract;
     JLabel label ;
    public Calculator(){
        super("Calculator");
        initComponents();
        buttonAdd.addActionListener(this);
        buttonSubract.addActionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);       
    }

    private void initComponents() {
       buttonAdd = new JButton("+");
       buttonSubract = new JButton("-");
       inputFieldA = new TextField();
       inputFieldB = new TextField();
       label = new JLabel();
       
       inputFieldA.setBounds(50, 100, 100, 20);
       inputFieldB.setBounds(50, 150, 100, 20);
       
       buttonAdd.setBounds(50, 200, 25, 20);
       buttonSubract.setBounds(100, 200, 25, 20);
      
       label.setBounds(50, 250, 100, 20);
       label.setHorizontalAlignment(JLabel.CENTER);  
       
       add(inputFieldA);
       add(inputFieldB);
       add(buttonAdd);
       add(buttonSubract);
       add(label); 
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       int numA = Integer.parseInt(inputFieldA.getText());
       int numB = Integer.parseInt(inputFieldB.getText()); 
       
       if(e.getSource() == buttonAdd){
          label.setText("Sum is " + (numA + numB));
       }else if(e.getSource() == buttonSubract){
            label.setText("Difference is " + (numA - numB));
       }
    }
    
}
