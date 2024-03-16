/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicapp;

import java.util.ArrayList;

/**
 *
 * @author idiltatar
 */
public class MusicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MusicGUI myGUI = new MusicGUI();
        myGUI.setVisible(true);

        // Linked list tests
        PlaylistManager1 pmTest1 = new PlaylistManager1();
        pmTest1.add("a");
        pmTest1.add("b");
        int index = pmTest1.search("a");
        System.out.println(index); // 0
        Object obj = pmTest1.get(index);
        System.out.println(obj.toString()); // a
        index = pmTest1.search("b");
        System.out.println(index); // 1
        obj = pmTest1.get(index);
        System.out.println(obj.toString()); // b
        index = pmTest1.search("c");
        System.out.println(index); // -1
        obj = pmTest1.get(index);
        System.out.println(obj == null); // true
        pmTest1.remove(2); // removes "b" because pmTest1.search("b") = 1
        System.out.println(pmTest1.size()); // 1
        index = pmTest1.search("b");
        System.out.println(index); // -1 , removed
        index = pmTest1.search("a");
        System.out.println(index); // 0
        System.out.println(pmTest1.get(index)); // a
        System.out.println("-------------");
            // Queue tests
        Song1Queue queue = new Song1Queue();
        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.size()); // 0
        Song1 song1 = new Song1();
        song1.setSong("song1");
        song1.setGenre("jazz");
        queue.enqueue(song1);
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 1
        Song1 front = (Song1) queue.frontElement();
        System.out.println(front.getSong().equals("song1")); // true
        Song1 rear = (Song1) queue.backElement();
        System.out.println(rear.getSong().equals("song1")); // true
        Song1 song2 = new Song1();
        song2.setSong("song2");
        song2.setGenre("classic");
        queue.enqueue(song2);
        front = (Song1) queue.frontElement();
        System.out.println(front.getSong().equals("song1")); // true
        rear = (Song1) queue.backElement();
        System.out.println(rear.getSong().equals("song2")); // true
        System.out.println(queue.size()); // 2
        Song1 song = (Song1) queue.dequeue();
        System.out.println(song);
        System.out.println(queue.size()); // 1
        System.out.println(song.getSong().equals("song1")); // true
        front = (Song1) queue.frontElement();
        System.out.println(front.getSong().equals("song2")); // true
        rear = (Song1) queue.backElement();
        System.out.println(rear.getSong().equals("song2")); // true
        ArrayList<Object> allSongs = queue.getAsList();
        System.out.println(allSongs.size() == 1); // true
        queue.dequeue();
        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.size()); // 0
        allSongs = queue.getAsList();
        System.out.println(allSongs.size() == 0); // true
    }

}
