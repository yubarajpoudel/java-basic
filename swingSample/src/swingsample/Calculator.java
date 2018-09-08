/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author yubaraj
 */
public class Calculator extends JFrame implements ActionListener, WindowListener{
    TextField inputFieldA, inputFieldB;
    JButton buttonAdd,  buttonSubract;
    JLabel label ;
    public Calculator(){
        super("Calculator");
        initComponents();
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
       buttonAdd.addActionListener(this);
       buttonSubract.addActionListener(this);
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       setSize(400, 400);
       setLayout(null);    
       setVisible(true);  
       addWindowListener(this);
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

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("DialogBOx");
        String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Calculator",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deActivated");
    }

    
    
}
