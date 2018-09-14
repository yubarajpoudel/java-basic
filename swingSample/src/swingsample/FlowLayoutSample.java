/*
    The FlowLayout class provides a very simple layout manager that is used, by default, by the JPanel objects.
    The FlowLayout class puts components in a row, sized at their preferred size. 
    If the horizontal space in the container is too small to put all the components in one row, 
    the FlowLayout class uses multiple rows.
    If the container is wider than necessary for a row of components, the row is, by default, 
    centered horizontally within the container. 
    To specify that the row is to aligned either to the left or right,
    use a FlowLayout constructor that takes an alignment argument. 
    Another constructor of the FlowLayout class specifies how much vertical or horizontal padding is put around the components.
 */
package swingsample;

/**
 *
 * @author yubaraj
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
public class FlowLayoutSample extends JFrame{
    JRadioButton RtoLbutton;
    JRadioButton LtoRbutton;
    FlowLayout experimentLayout = new FlowLayout();
    final String RtoL = "Right to left";
    final String LtoR = "Left to right";
    JButton applyButton = new JButton("Apply component orientation");
     
    public FlowLayoutSample(String name) {
        super(name);
    }
     
    public void addComponentsToPane() {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        experimentLayout.setAlignment(FlowLayout.TRAILING);
        
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
         
        LtoRbutton = new JRadioButton(LtoR);
        LtoRbutton.setActionCommand(LtoR);
        LtoRbutton.setSelected(true);
        RtoLbutton = new JRadioButton(RtoL);
        RtoLbutton.setActionCommand(RtoL);
         
        //Add buttons to the experiment layout
        compsToExperiment.add(new JButton("Button 1"));
        compsToExperiment.add(new JButton("Button 2"));
        compsToExperiment.add(new JButton("Button 3"));
        compsToExperiment.add(new JButton("Long-Named Button 4"));
        compsToExperiment.add(new JButton("5"));
        
        //Left to right component orientation is selected by default
        compsToExperiment.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
         
        //Add controls to set up the component orientation in the experiment layout
        final ButtonGroup group = new ButtonGroup();
        group.add(LtoRbutton);
        group.add(RtoLbutton);
        controls.add(LtoRbutton);
        controls.add(RtoLbutton);
        controls.add(applyButton);
         
        //Process the Apply component orientation button press
        applyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String command = group.getSelection().getActionCommand();
                //Check the selection
                if (command.equals("Left to right")) {
                    compsToExperiment.setComponentOrientation(
                            ComponentOrientation.LEFT_TO_RIGHT);
                } else {
                    compsToExperiment.setComponentOrientation(
                            ComponentOrientation.RIGHT_TO_LEFT);
                }
                //update the experiment layout
                compsToExperiment.validate();
                compsToExperiment.repaint();
            }
        });
        
        getContentPane().add(compsToExperiment);
        getContentPane().add(controls, BorderLayout.SOUTH); ;
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private void createAndShowGUI() {
        //Create and set up the window.
//        FlowLayoutSample frame = new FlowLayoutSample("FlowLayoutSample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane();
        //Display the window.
        pack();
        setVisible(true);
    }
     
    public void showUI() {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event dispatchi thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
