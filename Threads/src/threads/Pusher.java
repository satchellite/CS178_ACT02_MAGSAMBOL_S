/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author student
 */
public class Pusher extends Thread implements Runnable{
    private MyStack stack;
    private int id;

    public Pusher(int id, MyStack stack){
        this.stack = stack;
        this.id = id;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println("Pusher "+ id +". size: " +stack.stack.size());
        }
    }
}
