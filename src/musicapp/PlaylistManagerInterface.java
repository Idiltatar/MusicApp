/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicapp;

/**
 *
 * @author idiltatar
 */
public interface PlaylistManagerInterface {
    public boolean isEmpty();

    public int size();

    public Object get(int index);

    public void remove(int index);

    public void add(Object theElement);

    public void printList();

    public void append(String string);
    
    
    
    
}
