/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author student
 */
public class Popper extends Thread implements Runnable{
    private MyStack stack;

    public Popper(MyStack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        while(stack.getTop() > -1){
            stack.pop();
            System.out.println("Popper. size:" +stack.stack.size());
        }
    }
}
