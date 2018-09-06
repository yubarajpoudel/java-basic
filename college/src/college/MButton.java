package college;

import callback.MButtonCLickListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yubaraj
 */
public class MButton {
    // constructor
    public MButton(){
        
    }
    
    // or methods
    public void setClickListener(MButtonCLickListener listener){
        try {
            // certain task done
            //
            Thread.sleep(2);
            listener.onClicked();
        } catch (InterruptedException ex) {
            Logger.getLogger(MButton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
