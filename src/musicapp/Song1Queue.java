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

    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object newItem) {
        theQueue.add((Song1) newItem);
    }

    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove((theQueue.size())-1).toString();
        } else {
            return null;
        }
    }

    public String toString() {
        return theQueue.toString();
    }
    

}