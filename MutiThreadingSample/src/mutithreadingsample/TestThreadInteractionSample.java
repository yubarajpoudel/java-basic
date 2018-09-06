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
public class TestThreadInteractionSample {
    
    public void testInteraction() {
        final ThreadInteractionSample c = new ThreadInteractionSample();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }
}
