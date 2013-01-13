/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<Thread> threads = new ArrayList<Thread>();
         MyStack stack = new MyStack(50);

         for (int i = 0; i < 2; i++){
            Runnable task = new Pusher(i, stack);
            Thread worker = new Thread(task);
            worker.setName(String.valueOf(i));
            worker.start();
            threads.add(worker);
        }

        Runnable task = new Popper(stack);
        Thread worker = new Thread(task);
        worker.setName(String.valueOf(0));
        worker.start();
        threads.add(worker);

    }

}
