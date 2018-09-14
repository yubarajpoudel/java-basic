/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author yubaraj
 */
public class SwingSample {
JDesktopPane desk;
	JInternalFrame frame1, frame2, frame3, frame4;
	JFrame frame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Calculator calculator = new Calculator();
//        ButtonSample sample = new ButtonSample();
//        SwingSample d = new SwingSample();
//          Quiz quiz = new Quiz();
//        JAVASwingFormExample example = new JAVASwingFormExample();
//        CardlayoutSample cardLayout = new CardlayoutSample();
//        cardLayout.showUi();
          
          FlowLayoutSample sample = new FlowLayoutSample("sample");
          sample.showUI();
    }
    
     public SwingSample() {
		frame = new JFrame("Multiple Frames");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desk = new JDesktopPane();
		frame1 = new JInternalFrame("Frame1", true, true, true, true);
		frame1.setBounds(20, 200, 150, 100);
		frame1.setVisible(true);
		frame2 = new JInternalFrame("Frame2", true, true, true, true);
		frame2.setBounds(20, 140, 150, 100);
		frame2.setVisible(true);
		frame3 = new JInternalFrame("Frame3", true, true, true, true);
		frame3.setBounds(20, 80, 150, 100);
		frame3.setVisible(true);
		frame4 = new JInternalFrame("Frame4", true, true, true, true);
		frame4.setBounds(20, 20, 150, 100);
		frame4.setVisible(true);
		desk.add(frame1);
		desk.add(frame2);
		desk.add(frame3);
		desk.add(frame4);
		frame.add(desk);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
