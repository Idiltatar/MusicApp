/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

import java.util.ArrayList;

/**
 *
 * @author idiltatar
 */
public class PlaylistManager2 implements PlaylistManagerInterface{
     private Node head;
    private int iSize;
    private Node curNode;
    private Node prevNode;

    public PlaylistManager2() {
        head = null;
        iSize = 0;
        curNode = null;
        prevNode = null;
    }
       //Checks to see if the playlist is empty.
    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }

    }
   //Returns the size of the playlist. and retrun list 
    public int size() {
        return iSize;
    }


//Adds a new item and links it to the end of the list.
    public void add(Object element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            curNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

   //Returns the item at a specific location.

    public Object get(int iIndex) {
        setCurrent(iIndex);
        return curNode.toString();
    }
    //Removes an item from a specific location from the list.
    public void remove(int iIndex) {
    
        if (iIndex == 1) {
            head = head.getNext();
        } else {
            setCurrent(iIndex);
            prevNode.setNext(curNode.getNext());
        }

        iSize = iSize - 1;
    }
   //A special helper that adjusts the current and previous nodes
    private void setCurrent(int index) {
   
        int iCount;
        prevNode = null;
        curNode = head;
        for (iCount = 1; iCount < index; iCount++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
    }
          //Prints all the items of the list on the screen.                   
    public void printList() {
        Node aNode = head;
        while (aNode != null) {
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
        
    }
    public ArrayList<Node> getAsList() {
         ArrayList<Node> nodes = new ArrayList<>();
         Node aNode = head;
         while (aNode != null) {
            nodes.add(aNode);
            aNode = aNode.getNext();
        }
         return nodes;
    }

    @Override
    public void append(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
