/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author yubaraj
 */
public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Another thread running");
    }
    
}
