package Interface;

import Interface.Admin;
import Interface.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP820
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form TestLagi
     */
    public Login() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inpUsername = new javax.swing.JTextField();
        passwordField = new javax.swing.JPanel();
        inpPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        signin_btn = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        root.setBackground(new java.awt.Color(51, 51, 51));

        header.setFont(new java.awt.Font("Raleway Black", 1, 36)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Login");
        header.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        mainPanel.setOpaque(false);

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Raleway Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        inpUsername.setBackground(new java.awt.Color(51, 51, 51));
        inpUsername.setForeground(new java.awt.Color(255, 255, 255));
        inpUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        inpUsername.setOpaque(true);
        inpUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usernameFieldLayout = new javax.swing.GroupLayout(usernameField);
        usernameField.setLayout(usernameFieldLayout);
        usernameFieldLayout.setHorizontalGroup(
            usernameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernameFieldLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        usernameFieldLayout.setVerticalGroup(
            usernameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernameFieldLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addGroup(usernameFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setOpaque(false);

        inpPassword.setBackground(new java.awt.Color(51, 51, 51));
        inpPassword.setForeground(new java.awt.Color(255, 255, 255));
        inpPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Raleway Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        javax.swing.GroupLayout passwordFieldLayout = new javax.swing.GroupLayout(passwordField);
        passwordField.setLayout(passwordFieldLayout);
        passwordFieldLayout.setHorizontalGroup(
            passwordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordFieldLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordFieldLayout.setVerticalGroup(
            passwordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordFieldLayout.createSequentialGroup()
                .addGroup(passwordFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        signin_btn.setLabel("Sign in");
        signin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(signin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootLayout = new javax.swing.GroupLayout(root);
        root.setLayout(rootLayout);
        rootLayout.setHorizontalGroup(
            rootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rootLayout.setVerticalGroup(
            rootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpUsernameActionPerformed

    private void signin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_btnActionPerformed
        // TODO add your handling code here:     
        String user = inpUsername.getText();
        String pass = inpPassword.getText();
        
        switch (isValid(user, pass)) {
            case "admin":
                System.out.println("Admin Cuy");
                
                dispose();
                Admin admin = new Admin();
                break;
            case "user":
                System.out.println("User Brayy");
                
                dispose();
                User userUI = new User();
                break;
            default:
                System.out.println("Nope");
                break;
        }
        
    }//GEN-LAST:event_signin_btnActionPerformed

    private String isValid(String user, String pass){
        String Expected_Admin = "admin";
        String Expected_AdminPass = "321";
        
        String Expected_User = "user";
        String Expected_UserPass = "123";
        
        if(user.equals(Expected_Admin) && pass.equals(Expected_AdminPass)){
            return "admin";
        }else if(user.equals(Expected_User) && pass.equals(Expected_UserPass)){
            return "user";
        }else{
            return "null";
        }
        
//        return user.equals(Expected_User) && pass.equals(Expected_UserPass);
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header;
    private javax.swing.JPasswordField inpPassword;
    private javax.swing.JTextField inpUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel passwordField;
    private javax.swing.JPanel root;
    private java.awt.Button signin_btn;
    private javax.swing.JPanel usernameField;
    // End of variables declaration//GEN-END:variables
}
