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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
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
//        encrypt.setOnJobDoneListener(new FileEncryptListner() {
//            @Override
//            public boolean encrypted() {
//                System.out.println("File Encryption complete");
//                return true;
//            }
//        });
//        encrypt.start();
//        
//        System.out.println("Running in main");
//        System.out.println("Hello waiting for thread to complete");
//        System.out.println("working...");  
//        
        String[] a = new String[5]; // 20bytes  
        a[4] = "hello";
        a[4] = "I am here";
        
        // List
        List<String> list = new ArrayList<>(); // this is the list of type string
        
        list.add("hello"); //=>0
        list.add("I am here"); // =>1
      
        
        System.out.println("size of list is " + list.size());
        System.out.println("size of array a is " + a.length);
        System.out.println(a[4]);
        
        // access the data from the list
        
        for(int i = 0; i < list.size(); i++){
            System.out.println("data at " + i + " = " + list.get(i));
        }
      
        
        
         Collection<String> collection = new ArrayList<>();
         collection.add("hi");
         collection.add("i");
         collection.add("am");
         collection.add("java");
         collection.add("Student");
         
         
         // Iterator
         Iterator<String> iter = collection.iterator();
         while(iter.hasNext()){
             System.out.println(iter.next());
         }
         
         // MAP
         Set<String> set = new HashSet<String>();
         set.add("");
         set.add("");
         
         set.remove(0);
         
         for(String s : set){
             System.out.println(s);
         }
         
//         Map
        // initialize
        String keys[] = {"Java", "package"};
        List<Integer> feesList = new ArrayList<>();
        feesList.add(15000);
        feesList.add(20000);
        
        Map<String, Integer> map = new HashMap<>();
        
        // adding the value in the map
//        map.put("java", 20000);
//        map.put("package", 15000);
//        map.put("anivarsary", 15000);

        for(int i = 0; i < keys.length; i ++){
            map.put(keys[i], feesList.get(i));
        }
        
        
        // access the value
        
        System.out.println("fee of java is " + map.get(keys[1]));
        
    }
        
    
}
  

