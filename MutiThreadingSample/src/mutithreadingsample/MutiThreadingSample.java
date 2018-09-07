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
public class MutiThreadingSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting threads");
//        SampleClass sc = new SampleClass();
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sc.print1To10Numbers();
////                  sc.print1To5Numbers();
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sc.print1To10Numbers();
////                  sc.print1To5Numbers();
//            }
//        });
//        thread1.start();
//        thread2.start();
        
       new TestThreadInteractionSample().testInteraction();
    }
    
}
