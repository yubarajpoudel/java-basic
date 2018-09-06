/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutithreadingsample;

/**
 *
 * @author yubaraj
 */
public class SampleClass {
   
    public void print1To10Numbers(){
       try{ 
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(2000);
        }
       }catch(Exception e){e.printStackTrace();}
    }
    
    // methods using synchronized
    synchronized void print1To5Numbers(){
         try{ 
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(2000);
        }
       }catch(Exception e){e.printStackTrace();}
    }
}
