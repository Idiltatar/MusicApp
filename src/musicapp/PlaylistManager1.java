/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

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
        } else {
            setCurrent(iSize);
            curNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }


    public Object get(int iIndex) {
        setCurrent(iIndex);
        return curNode.toString();
    }

    public void remove(int iIndex) {
    
        if (iIndex == 1) {
            head = head.getNext();
        } else {
            setCurrent(iIndex);
            prevNode.setNext(curNode.getNext());
        }

        iSize = iSize - 1;
    }

    private void setCurrent(int index) {
   
        int iCount;
        prevNode = null;
        curNode = head;
        for (iCount = 1; iCount < index; iCount++) {
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
    
}
