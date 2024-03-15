/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicapp;

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
    private Object jTextAreaDisplay;
    public MusicGUI() {
        initComponents();
        mySong=new Song1Queue();
        pM1=new PlaylistManager1();
        pM2= new PlaylistManager2();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
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
        likebuton = new javax.swing.JButton();
        classicbuton = new javax.swing.JButton();
        jazzbuton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

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

        Playlist2.setText("Playlist 2");
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
        jScrollPane1.setViewportView(Display);

        likebuton.setText("song you like ");
        likebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likebutonActionPerformed(evt);
            }
        });

        classicbuton.setText("Playlist for classics");
        classicbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classicbutonActionPerformed(evt);
            }
        });

        jazzbuton.setText("Playlist for jazz");
        jazzbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jazzbutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(size1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(size2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Playlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Playlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(Add))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(classicbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(likebuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jazzbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(likebuton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(classicbuton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jazzbuton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Playlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playlist2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(size1)
                            .addComponent(size2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add)
                        .addGap(187, 187, 187)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
       int search=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the position of the song"));
       Display.append(pM1.get(search).toString()+"\n");
    }//GEN-LAST:event_Search1ActionPerformed
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        Song1 myS = new Song1();
        String song=JOptionPane.showInputDialog(null,"Enter the Song");
        String genre=JOptionPane.showInputDialog(null,"Enter the Genre");
        myS.setSong(song);
        myS.setGenre(genre);
        mySong.enqueue(myS);
        
        Display.append("Song: "+song+" Genre: "+genre+"\n");
        
    }//GEN-LAST:event_AddActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        int delete=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the song u want to delete: \n"));
        Display.append(pM1.get(delete).toString()+"\n");
        pM1.remove(delete);
        
    }//GEN-LAST:event_Delete1ActionPerformed

    private void size1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size1ActionPerformed
       Display.append("the size of the playlist1 is "+pM1.size()+"\n");
       
    }//GEN-LAST:event_size1ActionPerformed

    private void Playlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playlist1ActionPerformed
        Object song1=mySong.dequeue();
        if(song1!=null){
            Display.append("Song :"+song1.toString()+"added \n");
            pM1.add(song1);
        }
    }//GEN-LAST:event_Playlist1ActionPerformed

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
       int delete=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the song u want to delete: "));
        Display.append(pM2.get(delete).toString()+"\n");
        pM2.remove(delete);
    }//GEN-LAST:event_Delete2ActionPerformed

    private void size2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size2ActionPerformed
      Display.append("the size of the playlist1 is "+pM2.size()+"\n");
    }//GEN-LAST:event_size2ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
       int search=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the position of the song"));
       Display.append(pM2.get(search).toString()+"\n");
    }//GEN-LAST:event_search2ActionPerformed

    private void Playlist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Playlist2ActionPerformed
        Object song1=mySong.dequeue();
        if(song1!=null){
            Display.append("Song :"+song1.toString()+"added \n");
            pM2.add(song1);
        }
    }//GEN-LAST:event_Playlist2ActionPerformed

    private void likebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likebutonActionPerformed
        // TODO add your handling code here:
         jTextAreaDisplay.append("There are " + song1.size() + " customers in the queue\n");
    }//GEN-LAST:event_likebutonActionPerformed

    private void classicbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classicbutonActionPerformed
        // TODO add your handling code here:
         jTextAreaDisplay.append("There are " + myQueue.size() + " customers in the queue\n");
    }//GEN-LAST:event_classicbutonActionPerformed

    private void jazzbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jazzbutonActionPerformed
        // TODO add your handling code here:
         jTextAreaDisplay.append("There are " + myQueue.size() + " customers in the queue\n");
    }//GEN-LAST:event_jazzbutonActionPerformed

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
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JTextArea Display;
    private javax.swing.JButton Playlist1;
    private javax.swing.JButton Playlist2;
    private javax.swing.JButton Search1;
    private javax.swing.JButton classicbuton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jazzbuton;
    private javax.swing.JButton likebuton;
    private javax.swing.JButton search2;
    private javax.swing.JButton size1;
    private javax.swing.JButton size2;
    // End of variables declaration//GEN-END:variables
}
