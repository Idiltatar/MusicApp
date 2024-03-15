/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

/**
 *
 * @author idiltatar
 */
public class Song1 {
    
   private String song;
    private String genre;

    public Song1(){
        song= new String();
        genre = new String();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setGenre(String genre) {
        this.genre= genre;
    }

    public String getSong() {
        return song;
    }

    public String getGenre() {
        return genre;
    }
    @Override
    public String toString(){
        return "Song= "+song+" ,Genre="+genre;
    }
    
}
