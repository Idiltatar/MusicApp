/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author idiltatar
 */
public class PlaylistManager1 implements PlaylistManagerInterface {

    private Node head;
    private int iSize;
    private Node curNode;
    private Node prevNode;

    public PlaylistManager1() {
        head = null;
        iSize = 0;
        curNode = null;
        prevNode = null;
    }

    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int size() {
        return iSize;
    }

    public void add(Object element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
            curNode = head;
        } else {
            curNode.setNext(newNode);
            setCurrent(iSize);
        }
        iSize = iSize + 1;
    }

    public int search(String song) {
        Node currentNode = head;
        int index = 0;

        // Iterate through the list until the end
        while (currentNode != null) {
            // Check the song title
            if (currentNode.toString().equals(song)) {
                // Song title found, return the index
                return index;
            }
            // Move to the next node
            currentNode = currentNode.getNext();
            // Increment the index
            index++;
        }
        // Song title not found, return -1
        return -1; 
    }

    public Object get(int iIndex) {
        setCurrent(iIndex);
        return curNode;
    }

    public void remove(int iIndex) {
        if (iIndex < 1 || iIndex > iSize) {
            // not a valid index
            return;
        }
        if (iIndex == 1) {
            // head
            head = head.getNext();
            iSize--;
            return;
        }
        setCurrent(iIndex - 1);
        // update the previous node's next reference to skip the current node
        prevNode.setNext(curNode.getNext());
        iSize--;
    }

    private void setCurrent(int index) {
        int iCount;
        prevNode = null;
        curNode = head;
        for (iCount = 1; iCount <= index; iCount++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
    }

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
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
