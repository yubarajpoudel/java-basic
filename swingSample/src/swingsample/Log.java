/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsample;

/**
 *
 * @author yubaraj
 */
public class Log {
    static final boolean DEBUG = false;
    public static void debug(String message){
        if(DEBUG){
            System.out.println(message);
        }
    }
    
}
