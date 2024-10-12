package UI;

import User.Admin;
import javax.swing.*;
import java.awt.*;

public class AdminLogin extends javax.swing.JFrame {
    
    Image logo = new ImageIcon(this.getClass().getResource("/Pictures/coffee.png")).getImage();
    public AdminLogin() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setIconImage(logo);
        wrong.hide();
        password.setEchoChar('•');
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        hide = new javax.swing.JButton();
        show = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        wrong = new javax.swing.JLabel();
        forgotPass = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/view.png"))); // NOI18N
        view.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe Rain");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 2, 24)); // NOI18N
        jLabel1.setText("Welcome Back!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 90, 250, 32);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please enter account information to login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(152, 123, 250, 13);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(57, 183, 160, 41);

        mail.setForeground(new java.awt.Color(153, 153, 153));
        mail.setText("Enter your mail address");
        mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mail.setOpaque(true);
        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFocusLost(evt);
            }
        });
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailMouseExited(evt);
            }
        });
        jPanel1.add(mail);
        mail.setBounds(57, 230, 390, 50);
        mail.getAccessibleContext().setAccessibleName("mail");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(57, 286, 117, 29);

        password.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        password.setText("Enter correct password");
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password.setOpaque(true);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordMouseExited(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(57, 321, 340, 51);

        hide.setForeground(new java.awt.Color(255, 255, 255));
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/hide.png"))); // NOI18N
        hide.setBorder(null);
        hide.setBorderPainted(false);
        hide.setContentAreaFilled(false);
        hide.setFocusable(false);
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hideMouseEntered(evt);
            }
        });
        jPanel1.add(hide);
        hide.setBounds(400, 320, 50, 50);

        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/view.png"))); // NOI18N
        show.setBorder(null);
        show.setBorderPainted(false);
        show.setContentAreaFilled(false);
        show.setFocusable(false);
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showMouseEntered(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(400, 320, 50, 50);

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/login.png"))); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(200, 430, 80, 80);

        wrong.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        wrong.setForeground(new java.awt.Color(204, 0, 51));
        wrong.setText("Incorrect mail or password! Try again.");
        jPanel1.add(wrong);
        wrong.setBounds(130, 400, 220, 16);

        forgotPass.setForeground(new java.awt.Color(102, 102, 102));
        forgotPass.setText("Forgot Password?Try to reset it!");
        forgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPassMouseEntered(evt);
            }
        });
        jPanel1.add(forgotPass);
        forgotPass.setBounds(150, 380, 190, 16);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/loginPic.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseEntered
       
        mail.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mailMouseEntered

    private void mailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusGained
        
        if(mail.getText().equals("Enter your mail address")){
            mail.setText("");
            mail.setForeground(Color.BLACK);
            mail.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
            mail.setFont(new Font("Consolas",Font.PLAIN,22));
        }
    }//GEN-LAST:event_mailFocusGained

    private void mailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusLost
       
        if(mail.getText().equals("")){
            mail.setText("Enter your mail address");
            mail.setForeground(Color.DARK_GRAY);
            mail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_mailFocusLost

    private void mailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseExited
        
        if(evt.getSource()==mail){
            mail.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_mailMouseExited

    private void passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseEntered
        
        if(evt.getSource()==password){
            password.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_passwordMouseEntered

    private void passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseExited
        
        if(evt.getSource()==password){
            password.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_passwordMouseExited

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
       
        if(password.getText().equals("Enter correct password")){
            password.setText("");
            password.setForeground(Color.BLACK);
            password.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
            password.setFont(new Font("Consolas",Font.PLAIN,22));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().equals("")){
            password.setText("Enter correct password");
            password.setForeground(Color.DARK_GRAY);
            password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void hideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseEntered

        if(evt.getSource()==hide){
            hide.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_hideMouseEntered

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked

        if(evt.getSource()==hide){
            hide.hide();
            show.show();
            password.setEchoChar((char)0);
        }
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
   
        if(evt.getSource()==show){
            show.hide();
            hide.show();
            password.setEchoChar('•');
        }
    }//GEN-LAST:event_showMouseClicked

    private void showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseEntered
       
        show.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_showMouseEntered

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     
        if(evt.getSource()==login && (!mail.getText().isEmpty() || !password.getText().isEmpty())){
            String id=mail.getText();
            String pass=password.getText();
            Admin obj =new Admin();
            if(obj.login(id,pass)){
                this.setVisible(false);
                ChooseOpt obj1=new ChooseOpt();
                obj1.setVisible(true);
            }
            else if(!(obj.login(id,pass))){ 
                wrong.setText("Incorrect mail or password! Try again.");
                wrong.show();
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
 
        if(evt.getSource()==login){
            login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_loginMouseEntered

    private void forgotPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassMouseEntered

        if(evt.getSource()==forgotPass){
            forgotPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_forgotPassMouseEntered

    private void forgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassMouseClicked

        if(evt.getSource()==forgotPass){
            this.setVisible(false);
            ForgotAdminPass obj = new ForgotAdminPass();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_forgotPassMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    @Override
    public void pack() {
        super.pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPass;
    private javax.swing.JButton hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton show;
    private javax.swing.JButton view;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}