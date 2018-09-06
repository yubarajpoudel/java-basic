/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import callback.FileCreatedCallback;
import callback.FileEncryptListner;
import datahandler.FileReadWrite;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import threading.MyThread;
import threading.MyThread1;

/**
 *
 * @author yubaraj
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileEncryptThread encrypt = new FileEncryptThread();
        encrypt.setOnJobDoneListener(new FileEncryptListner() {
            @Override
            public boolean encrypted() {
                System.out.println("File Encryption complete");
                return true;
            }
        });
        encrypt.start();
        
        System.out.println("Running in main");
        System.out.println("Hello waiting for thread to complete");
        System.out.println("working...");
        
    }
        
    
}
  

