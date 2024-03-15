/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;
import java.util.*;
/**
 *
 * @author idiltatar
 */
public class Song1Queue implements Song1Interface{
    private ArrayList<Song1> theQueue;

    public Song1Queue() {
        theQueue = new ArrayList<Song1>();
    }

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public int size() {
        return theQueue.size();
    }
    
  // Removes and returns the rear element of the queue.
    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }
   // add a new item to rear of queue
    public void enqueue(Object newItem) {
        theQueue.add((Song1) newItem);
    }

     // return the rear element of the queue as a string, or null if the queue is empty.
    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove((theQueue.size())-1);
        } else {
            return null;
        }
    }
   
   //   Returns a string representation of the queue. and return  a string representation of the queue.
    public String toString() {
        return theQueue.toString();
    }
    
    //  Returns the last element of the queue, or null if the queue is empty
    public Object backElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(theQueue.size()-1);
        } else {
            return null;
        }
    }

}