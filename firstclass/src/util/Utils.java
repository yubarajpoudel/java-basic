/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author yubaraj
 */
public class Utils {
    // we are learning about function overloading
   // static function
   // static keyword is added to make the function static
   // for the static function we dont need to intantiate the class
    // static method can be directly called using the . operator
    // A single class can have multiple static methods
   public static int IS_ONLINE = 1;
   final static int DATA = 2;
   
   
   public static void log(String tag, String message){
        System.out.println(tag  + ": " + message);
    }
    
   public static void setData(){
       
   }
   
   public void setData(String firstParam){
       
   }
   
   public void setData(String firstParam, String secondParam){
       
   }
    public void setData(String firstParam, int secondParam){
       
   }
    
    
}
