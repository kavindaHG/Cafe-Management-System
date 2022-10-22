package cafemanagementsystem;

import javax.swing.JOptionPane;

public class SplashScreen extends javax.swing.JFrame {
    
    public SplashScreen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelImage2 = new rojerusan.RSPanelImage();
        loadingValue = new javax.swing.JLabel();
        LoadingText = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/cafemanagementsystem/Images/Splash.png"))); // NOI18N
        rSPanelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingValue.setFont(new java.awt.Font("Garamond", 3, 14)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(255, 255, 255));
        loadingValue.setText("0 %");
        rSPanelImage2.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 30, -1));

        LoadingText.setFont(new java.awt.Font("Garamond", 3, 14)); // NOI18N
        LoadingText.setForeground(new java.awt.Color(255, 255, 255));
        LoadingText.setText("Loading......");
        rSPanelImage2.add(LoadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, -1));

        ProgressBar.setBackground(new java.awt.Color(51, 51, 51));
        ProgressBar.setForeground(new java.awt.Color(0, 0, 204));
        rSPanelImage2.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 870, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(60);
                sp.loadingValue.setText(i + "%");
                
                if (i == 03) {
                    sp.LoadingText.setText("Please Wait");
                }
                
                if (i == 10) {
                    sp.LoadingText.setText("Starting Modules");
                }
  
                if (i == 30) {
                    sp.LoadingText.setText("Accessing Databases");
                }
                
                if (i == 50) {
                    sp.LoadingText.setText("Load Successfull");
                }
                
                if (i == 80) {
                    sp.LoadingText.setText("Launching Application");
                }
                
                sp.ProgressBar.setValue(i);
                
                if (i == 60) {
                    Login login = new Login();
                    sp.dispose();
                    login.setVisible(true);
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingText;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel loadingValue;
    private rojerusan.RSPanelImage rSPanelImage2;
    // End of variables declaration//GEN-END:variables
}
