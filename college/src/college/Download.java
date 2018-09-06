/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.logging.Handler;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

/**
 *
 * @author yubaraj
 */
public class Download {
    
    DownloadListener listener;
    
    public Download(DownloadListener listener){
        this.listener = listener;
    }
    
    public void downloadFile(){
        listener.onStarted();
        try{
           Thread.sleep(2000);
           listener.downloadCompleted();
           }
        catch(Exception e){
            e.printStackTrace();
            listener.downloadFailed();
        }
    }
}
