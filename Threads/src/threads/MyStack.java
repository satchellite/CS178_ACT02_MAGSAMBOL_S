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
public class MyStack {
    public List<Integer> stack;
    private static int top;

    public int getTop(){
        return top;
    }

    public MyStack (int size){
        stack = new ArrayList<Integer>(size);
        top = -1;
    }

    public synchronized void pop(){
        if(!stack.isEmpty()){
            stack.remove(top--);
        }
    }

    public synchronized void push(int value){
        if(top < stack.size()){
            stack.add(value);
            top++;
        }
    }

}
