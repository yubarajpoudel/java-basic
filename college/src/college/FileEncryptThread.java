/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import callback.FileEncryptListner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yubaraj
 */
public class FileEncryptThread extends Thread{
    FileEncryptListner listener = null;
    
    public void setOnJobDoneListener(FileEncryptListner listener){
        this.listener = listener;
    }
    @Override
    public void run() {
        try {
            sleep(5000);
            if(listener != null){
                listener.encrypted();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(FileEncryptThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
