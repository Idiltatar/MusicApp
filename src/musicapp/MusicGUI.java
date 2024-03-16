/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author idiltatar
 */
public class MusicGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Song1Interface mySong;
    private PlaylistManagerInterface pM1;
    private PlaylistManagerInterface pM2;

   
  
    public MusicGUI() {
        initComponents();
        mySong=new Song1Queue();
        pM1=new PlaylistManager1();
        pM2= new PlaylistManager2();
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Search1 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Playlist1 = new javax.swing.JButton();
        Playlist2 = new javax.swing.JButton();
        size1 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        size2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        addplaylist = new javax.swing.JButton();
        Allsong = new javax.swing.JButton();
        size3 = new javax.swing.JButton();
        search3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search1.setText("Search 1");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        Delete1.setText("Delete 1");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });

        Playlist1.setText("Playlist1");
        Playlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Playlist1ActionPerformed(evt);
            }
        });

        Playlist2.setText("Playlist2");
        Playlist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Playlist2ActionPerformed(evt);
            }
        });

        size1.setText("Size 1");
        size1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size1ActionPerformed(evt);
            }
        });

        Delete2.setText("Delete 2");
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });

        search2.setText("Search 2");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        size2.setText("Size 2");
        size2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size2ActionPerformed(evt);
            }
        });

        Display.setColumns(20);
        Display.setRows(5);
        Display.setEnabled(false);
        Display.setFocusable(false);
        jScrollPane1.setViewportView(Display);

        addplaylist.setText("Add to playlist");
        addplaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addplaylistActionPerformed(evt);
            }
        });

        Allsong.setText("All Songs");
        Allsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllsongActionPerformed(evt);
            }
        });

        size3.setText("Size 3");
        size3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size3ActionPerformed(evt);
            }
        });

        search3.setText("Search 3");
        search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search3ActionPerformed(evt);
            }
        });

        jButton1.setText("Enter the song ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(size1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(size2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Playlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(size3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Allsong, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(search3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addplaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Playlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Allsong, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(size3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Delete2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search2)
                            .addComponent(search3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(size1)
                            .addComponent(size2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(addplaylist)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed

       if (pM1.isEmpty()) {
            Display.append("Jazz playlist is empty\n");
            return;
        }
        String song = "";
        // get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the title of the song: ");
        }
        if (song == null) {
            return; // canceled by user
        }// search the song in jazz playlist
        int index = pM1.search(song);
        if (index == -1) {
            Display.append("Song " + song + " not found in jazz playlist\n");
        } else {
            String found = pM1.get(index).toString();
            Display.append("Found song " + found + " in jazz playlist" + "\n");
        }
    }//GEN-LAST:event_Search1ActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        if (pM1.isEmpty()) {
            Display.append("Jazz playlist is empty\n");
            return;
        }
        String song = "";
         // get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the title of the song to be deleted: ");
        }
        if (song == null) {
            return; // canceled by user
        }// search the song in jazz playlist
        int index = pM1.search(song);
        if (index == -1) {
            Display.append("Song " + song + " not found in Jazz playlist\n");
        } else {
            pM1.remove(index + 1);
            Display.append("Song " + song + " removed from Jazz playlist" + "\n");
        }
    }//GEN-LAST:event_Delete1ActionPerformed

    private void size1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size1ActionPerformed
        Display.append("The size of the jazz playlist is " + pM1.size() + "\n");

    }//GEN-LAST:event_size1ActionPerformed

    private void Playlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playlist1ActionPerformed
       ArrayList<Node> list = pM1.getAsList();
         int listSize=list.size();
        if (listSize == 0) {
        Display.append("Jazz playlist empty\n");
        return;
    }
        for (int i = 0; i < listSize; i++) {
        Node node = list.get(i);      
        Display.append("Song : " + node.toString() + "\n");
}
 
    }//GEN-LAST:event_Playlist1ActionPerformed

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
        if (pM2.isEmpty()) {
            Display.append("Classics playlist is empty\n");
            return;
        }
        String song = "";
         // get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the title of the song to be deleted: ");
        }
        if (song == null) {
            return; // canceled by user
        }// search the song in jazz playlist
        int index = pM2.search(song);
        if (index == -1) {
            Display.append("Song " + song + " not found in classics playlist\n");
        } else {
            pM2.remove(index + 1);
            Display.append("Song " + song + " removed from classics playlist" + "\n");
        }
        
    }//GEN-LAST:event_Delete2ActionPerformed

    private void size2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size2ActionPerformed
     Display.append("The size of the classics playlist is "+ pM2.size() + "\n");
    }//GEN-LAST:event_size2ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
         if (pM2.isEmpty()) {
            Display.append("classic playlist is \n");
            return;
        }
        String song = "";
        // get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the title of the song: ");
        }
        if (song == null) {
            return; // canceled by user
        }// search the song in jazz playlist
        int index = pM2.search(song);
        if (index == -1) {
            Display.append("Song " + song + " not found in classic playlist\n");
        } else {
            String found = pM2.get(index).toString();
            Display.append("Found song " + found + " in classic playlist" + "\n");
        }
    }//GEN-LAST:event_search2ActionPerformed

    private void Playlist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playlist2ActionPerformed
        ArrayList<Node> list = pM2.getAsList();
        int listSize=list.size();
        if (listSize == 0) {
        Display.append("Classics  empty\n");
        return;
    }
        for (int i = 0; i < listSize; i++) {
        Node node = list.get(i);      
        Display.append("Song : " + node.toString() + "\n");
}       
    }//GEN-LAST:event_Playlist2ActionPerformed

    private void addplaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addplaylistActionPerformed
    if (mySong.isEmpty()) {
        Display.append(" your song add !\n");
        return;
    }
    Song1 song = (Song1) mySong.backElement();
    if (song != null) {
        String title = song.getSong();
        String genre = song.getGenre();
        PlaylistManagerInterface playlistManager;

        if (genre.equals("jazz")) {
            playlistManager = pM1;
        } else {
            playlistManager = pM2;
        }
        playlistManager.add(title);
        Display.append("Song " + title + " added to " + genre + " playlist\n");
      
    }
    }//GEN-LAST:event_addplaylistActionPerformed

    private void size3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size3ActionPerformed
      Display.append("The size of the all songs playlist is "+ mySong.size() + "\n");
    }//GEN-LAST:event_size3ActionPerformed

    private void AllsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllsongActionPerformed
        if (mySong.isEmpty()) {
            Display.append("Please add some songs first!\n");
        }
        ArrayList<Object> allSongs = mySong.getAsList();
        for (int i = 0; i < allSongs.size(); i++) {
            Song1 myS = (Song1) allSongs.get(i);
            Display.append("Song: " + myS.getSong() + " Genre: " + myS.getGenre() + "\n");
        }

    }//GEN-LAST:event_AllsongActionPerformed

    private void search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search3ActionPerformed
        if (mySong.isEmpty()) {
            Display.append("You have no songs in your playlist\n");
            return;
        }
        String song = "";
// get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the title of the song: ");
        }
        if (song == null) {
            return; // canceled by user
        }// search the song in all songs playlist
        ArrayList<Object> allSongs = mySong.getAsList();
        Song1 found = null;
        for (int i = 0; i < allSongs.size(); i++) {
            Song1 current = (Song1) allSongs.get(i);
            if (current.getSong().equals(song)) {
                found = current;
                break;
            }
        }
        if (found == null) {
            Display.append("Song " + song + " not found in your playlist\n");
        } else {
            Display.append("Found song " + found.getSong() + " (genre: " + found.getGenre() + ")" + "\n");
        }

    }//GEN-LAST:event_search3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String song = "";
        String genre = "";
        // get song title
        while (song != null && song.trim().length() == 0) {
            song = JOptionPane.showInputDialog(null, "Enter the Song ");
        }
        if (song == null) {
            return; // canceled by user
        }// get genre
        while (genre != null && !genre.equals("1") && !genre.equals("2")) {
            genre = JOptionPane.showInputDialog(null, "Enter the Genre (1- jazz 2-classic )");
        }
        if (genre == null) {
            return; // canceled by user
        }// set genre
        if (genre.equals("1")) {
            genre = "jazz";
        } else {
            genre = "classic";
        }
        // add the song to songs playlist
        Song1 myS = new Song1();
        myS.setSong(song);
        myS.setGenre(genre);
        mySong.enqueue(myS);
        Display.append("Song: " + song + " Genre: " + genre + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Allsong;
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JTextArea Display;
    private javax.swing.JButton Playlist1;
    private javax.swing.JButton Playlist2;
    private javax.swing.JButton Search1;
    private javax.swing.JButton addplaylist;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton search2;
    private javax.swing.JButton search3;
    private javax.swing.JButton size1;
    private javax.swing.JButton size2;
    private javax.swing.JButton size3;
    // End of variables declaration//GEN-END:variables
}
