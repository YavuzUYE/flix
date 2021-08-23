
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class TvSeriesWindow extends javax.swing.JFrame {
     private final ArrayList<String> movieList= new ArrayList();
    /**
     * Creates new form TvSeriesWindow
     */
    public TvSeriesWindow() throws FileNotFoundException {
         readFile(movieList,"İnformation.txt");
        initComponents();
        
        jRadioButton1.setText(movieList.get(101));
        jRadioButton2.setText(movieList.get(112));
        jRadioButton3.setText(movieList.get(123));
        jRadioButton4.setText(movieList.get(134));
        jRadioButton5.setText(movieList.get(145));
        jRadioButton6.setText(movieList.get(156));
        jRadioButton7.setText(movieList.get(167));
        jRadioButton8.setText(movieList.get(178));
        jRadioButton9.setText(movieList.get(189));
        jRadioButton10.setText(movieList.get(200));
        
        jRadioButton1.setActionCommand("1");
        jRadioButton2.setActionCommand("2");
        jRadioButton3.setActionCommand("3");
        jRadioButton4.setActionCommand("4");
        jRadioButton5.setActionCommand("5");
        jRadioButton6.setActionCommand("6");
        jRadioButton7.setActionCommand("7");
        jRadioButton8.setActionCommand("8");
        jRadioButton9.setActionCommand("9");
        jRadioButton10.setActionCommand("10");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("JRadioButton9");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("JRadioButton10");

        jButton11.setText("Watch");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("JRadioButton1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("JRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("JRadioButton3");

        jButton1.setText("İnformation");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("JRadioButton4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("JRadioButton5");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("JRadioButton6");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("JRadioButton7");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("JRadioButton8");

        jButton2.setText("Detail İnformation");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel1.setText("TvSeries");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(81, 81, 81)
                                        .addComponent(jRadioButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2)
                                            .addComponent(jRadioButton3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton7)
                                            .addComponent(jRadioButton8))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton11)
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton2)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton10)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(3, 3, 3)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        setVisible(false);
        dispose();
         try {
             new MovieWindow().setVisible(true);        // TODO add your handling code here:
         } catch (FileNotFoundException ex) {
             Logger.getLogger(TvSeriesWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        setVisible(false);
        dispose(); 
        WatchWindow wat1 = new WatchWindow();
        wat1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        wat1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        dispose();
        if(buttonGroup1.getSelection().getActionCommand().equals("1"))
        {
            
            TvSeriesİnformationWindow tvserinfo = null;
            try {
                tvserinfo = new TvSeriesİnformationWindow("1");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("2"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("2");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("3"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("3");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("4"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("4");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("5"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("5");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("6"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("6");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("7"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("7");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }        
        else if(buttonGroup1.getSelection().getActionCommand().equals("8"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("8");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("9"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("9");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("10"))
        {
            TvSeriesİnformationWindow tvserinfo = null;
                try {
                    tvserinfo = new TvSeriesİnformationWindow("10");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            tvserinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tvserinfo.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(buttonGroup1.getSelection().getActionCommand().equals("1"))
        {  
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("11");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("2"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("12");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("3"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("13");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("4"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("14");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("5"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("15");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("6"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("16");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("7"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("17");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }else if(buttonGroup1.getSelection().getActionCommand().equals("8"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("18");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("9"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("19");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
        else if(buttonGroup1.getSelection().getActionCommand().equals("10"))
        {
            DetailİnformationWindow detinfo = null;
            try {
                detinfo = new DetailİnformationWindow("20");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MovieWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            detinfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            detinfo.setVisible(true);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */

       private static void readFile(List<String> originalList, String fileName) throws FileNotFoundException {
        List<String> candidateList = new ArrayList<>(1000);
        Scanner fileInput = new Scanner(new File(fileName));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextLine());
        }
        originalList.addAll(candidateList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
