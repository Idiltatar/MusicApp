/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
     */
package musicapp;

/**
 *
 * @author idiltatar
 */
public interface Song1Interface {
    
    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object newItem);

    public Object dequeue();
    
     public Object peek();
     
     public Object backElement();
}
