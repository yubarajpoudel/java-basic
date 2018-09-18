/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqldatabaseandswing;

/**
 *
 * @author yubaraj
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 

import java.awt.event.*;

import java.sql.ResultSet;



@SuppressWarnings("serial")

public class DynamicRegForm extends RegisterFormGUI{
    String gender = "";
    ResultSet rst,rstLast;
    Object[][] data;
    int serialNo; 
    String SHOW = "Show";
    RegisterFormGUI formGUIObject;
    
    // Defining Constructor
    DynamicRegForm(){
    nameField.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
          if(nameField.getText().length()>=15)
             e.consume();
           }
    });

    male.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            gender = "Male";
            }
        });

    female.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            gender = "Female";
            }
        });

    addressField.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            if(addressField.getText().length()>50)
                e.consume();
            }
        });

    contactField.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                      (c == KeyEvent.VK_BACK_SPACE) ||
                      (c == KeyEvent.VK_DELETE))) {
                        e.consume();
                }
                if(contactField.getText().length()>9) 
                     e.consume();
            }
        });
        
    exitButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
                try{
                    con.close();
                    System.exit(0);
                 }
                catch(Exception ex){
                  System.out.println(ex.getMessage());
                }
             }
            });

    registerButton.addActionListener(new AbstractAction(SHOW){
        public void actionPerformed(ActionEvent ae){
            try{
               if (ae.getSource() == registerButton) {
                    String check = checkValidOrShowMessage();
                    System.out.println("register check = " + check);
                    if (check != ""){
                            JOptionPane.showConfirmDialog(DynamicRegForm.this, check + " is empty");
                    }
                    else {
                           //Fetching column values from Database
                                preStatement.setString(1,nameField.getText());
                                preStatement.setString(2,gender);
                                preStatement.setString(3,addressField.getText());
                                preStatement.setString(4,contactField.getText());
                                //Executing MySQL Update Query
                                int i = preStatement.executeUpdate();
                                if(i==1){
                                      JOptionPane.showMessageDialog(panel, "Successfully Registered");
                                }

                             // showing last row 
                                rstLast = stmt.executeQuery("select *from regForm");
                                rstLast.last();
                                String string = serialNo++ +","+String.valueOf(rst.getLong(1))+","+rst.getString(2)+","+rst.getString(3)+","+rst.getString(4)+","+rst.getString(5);
                                Object[] row = null;
                                row = string.split(",");
                                model.addRow(row);
                                panel.revalidate();
                                blankFields();
                            }

                    }

                }
                catch(Exception ex){
                    System.out.println(ex.getMessage()); 

                }

            }

        });

        updateButton.addActionListener(new AbstractAction(SHOW){
            public void actionPerformed(ActionEvent e){
                String check = checkValidOrShowMessage();
                if (check != ""){
                    JOptionPane.showConfirmDialog(DynamicRegForm.this, check + " is empty");
                 }            
                else {

                              int r = table.getSelectedRow();

                              try{

                              if(r>=0){

                                 if(male.isSelected())

                                    gender = male.getText();
                                 else
                                    gender = female.getText();

                                    String id = (String)table.getModel().

                                                              getValueAt(r,1);

                                  updatePreStmt = con.prepareStatement("update regForm set name=?,gender=?,address=?,contact=?where id="+id);
                                  updatePreStmt.setString(1,nameField.getText());
                                  updatePreStmt.setString(2,gender);
                                  updatePreStmt.setString(3,addressField.getText());
                                  updatePreStmt.setString(4,contactField.getText());
                                  int i = updatePreStmt.executeUpdate();
                                  
                                  if(i==1){
                                     table.setValueAt(nameField.getText(),r,2);
                                     table.setValueAt(gender, r, 3);
                                     table.setValueAt(addressField.getText(),r,4);
                                     table.setValueAt(contactField.getText(), r, 5);
                                  }
                                  else
                                      JOptionPane.showMessageDialog(panel, "ID does't Exists in Database");

                              }
                              }catch(Exception ex){
                                      System.out.println("Update section: "+ ex.getMessage()); 

                              }
                        }

              }

          });

 

            //Registering Anonymous Listener Class

            deleteButton.addActionListener(new AbstractAction(SHOW){ 

              public void actionPerformed(ActionEvent e){

                  try{ 

                  //Getting Selected Row No

                  int r = table.getSelectedRow(); 

                  if(r>=0){ 

                        if (JOptionPane.showConfirmDialog(panel,

                            "Are you sure want to Delete this 'RECORD' ?","WARNING",

                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

                              String id = (String)table.getModel().getValueAt(r,1);

 

                              // Executing MySQL Update Command

                              int i = stmt.executeUpdate("delete from regForm where id="+id);

                              if(i==1){

                                    model.removeRow(r);

 

                                    // fields are blank

                                    blankFields();

                                    registerButton.setEnabled(true);

                                    deleteButton.setEnabled(false);

                                    updateButton.setEnabled(false);

                              }

                        }

                  }

                  }catch(Exception ex){

                         System.out.println(ex.getMessage());

                  }

              }

          });

 

           //Registering Anonymous Listener Class

            resetButton.addActionListener(new ActionListener(){

                  public void actionPerformed(ActionEvent arg0) {

                        // calling method resetFields()

                        resetFields();

                        registerButton.setEnabled(true);

                        updateButton.setEnabled(false);

                        deleteButton.setEnabled(false);

                        resetButton.setEnabled(false);

                  }

            });



            // Registering Anonymous Listener Class

            refresh.addActionListener(new ActionListener() {

                  public void actionPerformed(ActionEvent arg0) {

                        //calling  refresh() method

                        refreshTable();

                  }

            });



            //Registering Anonymous Listener Class

            table.addMouseListener(new MouseListener(){

                  public void mouseClicked(MouseEvent arg0){ 

                        //Getting Selected Row No

                  int r = table.getSelectedRow();

                  if(r>=0){ 

                        deleteButton.setEnabled(true);

                        updateButton.setEnabled(true);

                        resetButton.setEnabled(true);

                        registerButton.setEnabled(false); 


                        //Fetching records from Table on Fields

                        idField.setText(""+table.getModel().getValueAt(r,1));

                        nameField.setText(""+table.getModel().getValueAt(r,2));

                        if(table.getModel().getValueAt(r,3).equals("Male"))

                              male.setSelected(true);

                        else

                              female.setSelected(true);

                        addressField.setText(""+table.getModel().getValueAt(r,4));

                        contactField.setText(""+table.getModel().getValueAt(r,5));

                  }

                  }


               //@Override

                  public void mouseReleased(MouseEvent arg0) {}

               //@Override

                   public void mousePressed(MouseEvent arg0) {}

                // @Override 

                  public void mouseExited(MouseEvent arg0) {}

               //@Override 

                  public void mouseEntered(MouseEvent arg0) {}

            });



            // Displaying rows into the Frame table

            addRows();

      }



      // addRows method

      private void addRows(){
        try{
            Object[] row = null;
            //Generating Serial No
            serialNo=1;
            rst = stmt.executeQuery("select *from regForm");
            while(rst.next()){ 
                String string = serialNo++ +","+String.valueOf(rst.getLong(1))+","+rst.getString(2)+","+rst.getString(3)+","+rst.getString(4)+","+rst.getString(5);
                  row = string.split(",");
                  // Adding records in table model 
                  model.addRow(row);
            }
            panel.revalidate();
            }catch(Exception ex){ System.out.println(ex.getMessage()); }

      }



      private void resetFields(){ 
         //calling method blankfields() 
          blankFields();

      }

 

      // refresh method

      private void refreshTable(){
            // removing all the rows of the table
            DefaultTableModel dm = (DefaultTableModel)table.getModel();
            dm.getDataVector().removeAllElements();
            System.out.println("Refresh Table");
            //calling method addRows
            addRows();

      }



      private void blankFields(){

            // fields will be blank

            idField.setText("");

            nameField.setText("");

            gender = "";

            bg.clearSelection();

            addressField.setText("");

            contactField.setText("");

      }

      private String checkValidOrShowMessage(){
        String nullFields = ""; 
        if (nameField.getText().equals(""))
            nullFields = "name, ";
        if(addressField.getText().equals(""))
            nullFields += "address, ";
       if(contactField.getText().equals(""))
            nullFields += " Contact, ";
       if(gender.equals(""))
            nullFields += "gender";
         
       return nullFields;
      }
}
