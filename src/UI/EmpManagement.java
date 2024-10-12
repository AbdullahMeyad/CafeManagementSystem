package UI;

import Employee.FullTimeEmployee;
import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EmpManagement extends javax.swing.JFrame {

    Image logo = new ImageIcon(this.getClass().getResource("/Pictures/coffee.png")).getImage();

    public EmpManagement() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setIconImage(logo);
        addP.setVisible(false);
        removeP.setVisible(false);
        removeP2.setVisible(false);
        updateP.setVisible(false);
        findP.setVisible(false);
        mainP.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addEmp = new javax.swing.JLabel();
        remove = new javax.swing.JLabel();
        updatebtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        addP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        post = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sal1 = new javax.swing.JTextField();
        removeP = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        removeP2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        nm1 = new javax.swing.JTextField();
        nm3 = new javax.swing.JTextField();
        nm4 = new javax.swing.JTextField();
        nm5 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nm6 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        updateP = new javax.swing.JPanel();
        update_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        update_id = new javax.swing.JTextField();
        update_age = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        update_male = new javax.swing.JRadioButton();
        update_female = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        update_day = new javax.swing.JComboBox<>();
        update_month = new javax.swing.JComboBox<>();
        update_year = new javax.swing.JComboBox<>();
        update_salary = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        update_post = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        findP = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        find_id1 = new javax.swing.JTextField();
        find1 = new javax.swing.JButton();
        findP2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        find_name = new javax.swing.JTextField();
        find_id = new javax.swing.JTextField();
        find_gender = new javax.swing.JTextField();
        find_sal = new javax.swing.JTextField();
        find_post = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        find_date = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        mainP = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe Rain");

        jPanel1.setBackground(new Color(205,232,229));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        addEmp.setBackground(new java.awt.Color(255, 255, 255));
        addEmp.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        addEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add.png"))); // NOI18N
        addEmp.setText("Add Employee");
        addEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEmp.setFocusTraversalPolicyProvider(true);
        addEmp.setIconTextGap(20);
        addEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmpMouseClicked(evt);
            }
        });

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/fired.png"))); // NOI18N
        remove.setText("Remove Employee");
        remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove.setIconTextGap(20);
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(255, 255, 255));
        updatebtn.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update-list.png"))); // NOI18N
        updatebtn.setText("Update Employee");
        updatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebtn.setIconTextGap(20);
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/showEmp.png"))); // NOI18N
        jLabel5.setText("Show all Employee Info");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(20);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/findEmp.png"))); // NOI18N
        jLabel6.setText("Find Employee Info");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setIconTextGap(20);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        addP.setBackground(new java.awt.Color(255, 255, 255));
        addP.setPreferredSize(new java.awt.Dimension(550, 540));

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setText("Name:");

        name.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        age.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        age.setModel(new javax.swing.SpinnerNumberModel(16, 16, 40, 1));
        age.setToolTipText("");
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        age.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        age.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel4.setText("Gender:");

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        male.setText("Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male.setFocusable(false);

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        female.setText("Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        female.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel7.setText("Joining Date:");

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");
        day.setBorder(null);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.setToolTipText("");
        month.setBorder(null);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        year.setToolTipText("");
        year.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel8.setText("Salary:");

        post.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        post.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        post.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        post.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel9.setText("Post:");

        addBtn.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        addBtn.setText("Add Employee");
        addBtn.setFocusable(false);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add.png"))); // NOI18N

        sal1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        sal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sal1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sal1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout addPLayout = new javax.swing.GroupLayout(addP);
        addP.setLayout(addPLayout);
        addPLayout.setHorizontalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                        .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sal1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(male)
                                .addGap(18, 18, 18)
                                .addComponent(female))
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addGroup(addPLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(addBtn)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(234, 234, 234))))
        );
        addPLayout.setVerticalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(male)
                    .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sal1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(addBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        removeP.setBackground(new java.awt.Color(255, 255, 255));
        removeP.setMaximumSize(new java.awt.Dimension(550, 540));
        removeP.setPreferredSize(new java.awt.Dimension(550, 540));

        jLabel10.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/fired.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel11.setText("Employee ID:");

        id.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        find.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find.setText("find");
        find.setFocusable(false);
        find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findMouseClicked(evt);
            }
        });

        removeP2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel20.setText("Employee Information");

        nm.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm.setToolTipText("");
        nm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm.setFocusable(false);

        nm1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm1.setFocusable(false);

        nm3.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm3.setFocusable(false);

        nm4.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm4.setFocusable(false);

        nm5.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm5.setFocusable(false);

        jLabel25.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel25.setText("Post          :");

        jLabel24.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel24.setText("Salary        :");

        jLabel26.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel26.setText("Gender        :");

        jLabel22.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel22.setText("ID            :");

        jLabel21.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel21.setText("Name          :");

        nm6.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        nm6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nm6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nm6.setFocusable(false);

        jLabel27.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel27.setText("Join Date     :");

        jButton1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removeP2Layout = new javax.swing.GroupLayout(removeP2);
        removeP2.setLayout(removeP2Layout);
        removeP2Layout.setHorizontalGroup(
            removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeP2Layout.createSequentialGroup()
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeP2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel20))
                    .addGroup(removeP2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(removeP2Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(nm1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                                .addGroup(removeP2Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(18, 18, 18)
                                    .addComponent(nm3))
                                .addGroup(removeP2Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(nm4))
                                .addGroup(removeP2Layout.createSequentialGroup()
                                    .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel27))
                                    .addGap(18, 18, 18)
                                    .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nm6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nm5))))
                            .addGroup(removeP2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(removeP2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        removeP2Layout.setVerticalGroup(
            removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nm5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removeP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout removePLayout = new javax.swing.GroupLayout(removeP);
        removeP.setLayout(removePLayout);
        removePLayout.setHorizontalGroup(
            removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(removePLayout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(find)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(removeP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(233, 233, 233))
        );
        removePLayout.setVerticalGroup(
            removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(removePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(find)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        updateP.setBackground(new java.awt.Color(255, 255, 255));
        updateP.setPreferredSize(new java.awt.Dimension(550, 540));

        update_name.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_nameKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update-list.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel13.setText("Name:");

        jLabel14.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel14.setText("Employee ID:");

        update_id.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_idKeyTyped(evt);
            }
        });

        update_age.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_age.setModel(new javax.swing.SpinnerNumberModel(16, 16, 40, 1));
        update_age.setToolTipText("");
        update_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_age.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_age.setFocusable(false);

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel15.setText("Age:");

        jLabel16.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel16.setText("Gender:");

        update_male.setBackground(new java.awt.Color(255, 255, 255));
        update_male.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_male.setText("Male");
        update_male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_male.setFocusable(false);

        update_female.setBackground(new java.awt.Color(255, 255, 255));
        update_female.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_female.setText("Female");
        update_female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_female.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel17.setText("Joining Date:");

        update_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        update_day.setToolTipText("");
        update_day.setBorder(null);
        update_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        update_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        update_month.setToolTipText("");
        update_month.setBorder(null);
        update_month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        update_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        update_year.setToolTipText("");
        update_year.setBorder(null);
        update_year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        update_salary.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_salary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_salary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_salary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                update_salaryKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel18.setText("Salary:");

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel19.setText("Post:");

        update_post.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update_post.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_post.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update_post.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        update.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setFocusable(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updatePLayout = new javax.swing.GroupLayout(updateP);
        updateP.setLayout(updatePLayout);
        updatePLayout.setHorizontalGroup(
            updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePLayout.createSequentialGroup()
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePLayout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel12))
                            .addGroup(updatePLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(update_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(update_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(update_salary))
                                .addGroup(updatePLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update_age, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(update_male)
                                    .addGap(18, 18, 18)
                                    .addComponent(update_female))
                                .addGroup(updatePLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(update_id))
                                .addGroup(updatePLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(update_name, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(updatePLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(38, 38, 38)
                                    .addComponent(update_post, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(updatePLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(update)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        updatePLayout.setVerticalGroup(
            updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(update_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(update_age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePLayout.createSequentialGroup()
                        .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(update_male)
                            .addComponent(update_female, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(update_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(updatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_post, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(47, 47, 47)
                .addComponent(update)
                .addGap(84, 84, 84))
        );

        findP.setBackground(new java.awt.Color(255, 255, 255));
        findP.setPreferredSize(new java.awt.Dimension(550, 540));

        jLabel23.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/findEmp.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel28.setText("Employee ID:");

        find_id1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_id1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_id1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find_id1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                find_id1KeyTyped(evt);
            }
        });

        find1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find1.setText("find");
        find1.setFocusable(false);
        find1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                find1MouseClicked(evt);
            }
        });

        findP2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel29.setText("Employee Information");

        find_name.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_name.setToolTipText("");
        find_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_name.setFocusable(false);

        find_id.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_id.setFocusable(false);

        find_gender.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_gender.setFocusable(false);

        find_sal.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_sal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_sal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_sal.setFocusable(false);

        find_post.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_post.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_post.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_post.setFocusable(false);

        jLabel30.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel30.setText("Post          :");

        jLabel31.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel31.setText("Salary        :");

        jLabel32.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel32.setText("Gender        :");

        jLabel33.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel33.setText("ID            :");

        jLabel34.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel34.setText("Name          :");

        find_date.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        find_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        find_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        find_date.setFocusable(false);

        jLabel35.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel35.setText("Join Date     :");

        done.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        done.setText("Done");
        done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout findP2Layout = new javax.swing.GroupLayout(findP2);
        findP2.setLayout(findP2Layout);
        findP2Layout.setHorizontalGroup(
            findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findP2Layout.createSequentialGroup()
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findP2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel29))
                    .addGroup(findP2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(findP2Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(18, 18, 18)
                                    .addComponent(find_id, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                                .addGroup(findP2Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addGap(18, 18, 18)
                                    .addComponent(find_gender))
                                .addGroup(findP2Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(18, 18, 18)
                                    .addComponent(find_sal))
                                .addGroup(findP2Layout.createSequentialGroup()
                                    .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel35))
                                    .addGap(18, 18, 18)
                                    .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(find_date, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(find_post))))
                            .addGroup(findP2Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(find_name, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(findP2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(done)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        findP2Layout.setVerticalGroup(
            findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_post, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(done)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout findPLayout = new javax.swing.GroupLayout(findP);
        findP.setLayout(findPLayout);
        findPLayout.setHorizontalGroup(
            findPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findPLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(findPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(findPLayout.createSequentialGroup()
                        .addComponent(find_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(find1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(findP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, findPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(233, 233, 233))
        );
        findPLayout.setVerticalGroup(
            findPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findPLayout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(7, 7, 7)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(findPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(find1)
                    .addComponent(find_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        mainP.setBackground(new java.awt.Color(255, 255, 255));
        mainP.setPreferredSize(new java.awt.Dimension(550, 540));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/food-pickup (1).gif"))); // NOI18N

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel6)
                    .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove)
                    .addComponent(updatebtn)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addP, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 70, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 930, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 454, Short.MAX_VALUE)
                    .addComponent(removeP, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 419, Short.MAX_VALUE)
                    .addComponent(updateP, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 419, Short.MAX_VALUE)
                    .addComponent(findP, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(408, 408, 408)
                    .addComponent(mainP, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(addEmp)
                .addGap(18, 18, 18)
                .addComponent(remove)
                .addGap(18, 18, 18)
                .addComponent(updatebtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(81, Short.MAX_VALUE))
            .addComponent(addP, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(removeP, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateP, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(findP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainP, javax.swing.GroupLayout.PREFERRED_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmpMouseClicked
        addP.setVisible(true);
        removeP.setVisible(false);
        updateP.setVisible(false);
        findP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_addEmpMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        addP.setVisible(false);
        removeP.setVisible(true);
        updateP.setVisible(false);
        findP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_removeMouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        addP.setVisible(false);
        removeP.setVisible(false);
        updateP.setVisible(true);
        findP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_updatebtnMouseClicked

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        FullTimeEmployee obj = new FullTimeEmployee();
        String v1 = name.getText();
        int v2 = (int) (age.getValue());
        String v3 = null;
        if (male.isSelected()) {
            v3 = "Male";
        } else if (female.isSelected()) {
            v3 = "Female";
        }
        String v4 = (day.getSelectedItem()) + "." + (month.getSelectedItem()) + "." + (year.getSelectedItem());
        int v5 = Integer.parseInt(sal1.getText());
        String v6 = post.getText();
        try {
            if (obj.addEmployee(v1, v2, v3, v4, v5, v6)) {
                JOptionPane.showMessageDialog(null, "Employee added successfully");
                addP.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addBtnMouseClicked

    private void sal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sal1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_sal1KeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseClicked
        FullTimeEmployee obj = new FullTimeEmployee();
        int v1 = Integer.parseInt(id.getText());
        try {
            if (obj.getEmployeeInfo(v1) != null) {
                HashMap<String, String> info = obj.getEmployeeInfo(v1);
                String name = info.get("Name");
                String id = info.get("ID");
                String age = info.get("Age");
                String gender = info.get("Gender");
                String date = info.get("HireDate");
                String sal = info.get("Salary");
                String post = info.get("Post");
                nm.setText(name);
                nm1.setText(id);
                nm3.setText(gender);
                nm4.setText(sal);
                nm5.setText(post);
                nm6.setText(date);
                removeP2.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Employee Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Employee Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findMouseClicked

    private void update_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_nameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_update_nameKeyTyped

    private void update_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_idKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_update_idKeyTyped

    private void update_salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_salaryKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_update_salaryKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        FullTimeEmployee obj = new FullTimeEmployee();
        int v1 = Integer.parseInt(id.getText());
        try {
            if (obj.removeEmployee(v1) && !nm.getText().isBlank() && !nm1.getText().isBlank() && !nm3.getText().isBlank() && !nm4.getText().isBlank() && !nm6.getText().isBlank()) {

                JOptionPane.showMessageDialog(null, "Employee removed successfully");
                removeP.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Employee Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        FullTimeEmployee obj = new FullTimeEmployee();
        String v1 = update_name.getText();
        int v2 = (int) (update_age.getValue());
        String v3 = null;
        if (update_male.isSelected()) {
            v3 = "Male";
        } else if (update_female.isSelected()) {
            v3 = "Female";
        }
        String v4 = (update_day.getSelectedItem()) + "." + (update_month.getSelectedItem()) + "." + (update_year.getSelectedItem());
        int v5 = Integer.parseInt(update_salary.getText());
        String v6 = update_post.getText();
        int v7 = Integer.parseInt(update_id.getText());
        try {
            if (obj.updateEmployee(v1, v7, v2, v3, v4, v5, v6)) {
                JOptionPane.showMessageDialog(null, "Employee information updated successfully");
                updateP.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateMouseClicked

    private void find_id1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_find_id1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_find_id1KeyTyped

    private void find1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_find1MouseClicked
        FullTimeEmployee obj = new FullTimeEmployee();
        int v1 = Integer.parseInt(find_id1.getText());
        try {
            if (obj.getEmployeeInfo(v1) != null) {
                HashMap<String, String> info = obj.getEmployeeInfo(v1);
                String name = info.get("Name");
                String id = info.get("ID");
                String age = info.get("Age");
                String gender = info.get("Gender");
                String date = info.get("HireDate");
                String sal = info.get("Salary");
                String post = info.get("Post");
                find_name.setText(name);
                find_id.setText(id);
                find_gender.setText(gender);
                find_sal.setText(sal);
                find_post.setText(post);
                find_date.setText(date);
                findP2.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Employee Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Employee Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_find1MouseClicked

    private void doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseClicked
        findP.setVisible(false);
    }//GEN-LAST:event_doneMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        addP.setVisible(false);
        removeP.setVisible(false);
        updateP.setVisible(false);
        findP.setVisible(true);
        mainP.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ShowAllInfo obj = new ShowAllInfo();
        obj.setVisible(true);
        try {
            obj.getAllEmployeeInfo();
        } catch (SQLException ex) {
            Logger.getLogger(EmpManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        ChooseOpt obj = new ChooseOpt();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EmpManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addEmp;
    private javax.swing.JPanel addP;
    private javax.swing.JSpinner age;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JButton done;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton find;
    private javax.swing.JButton find1;
    private javax.swing.JPanel findP;
    private javax.swing.JPanel findP2;
    private javax.swing.JTextField find_date;
    private javax.swing.JTextField find_gender;
    private javax.swing.JTextField find_id;
    private javax.swing.JTextField find_id1;
    private javax.swing.JTextField find_name;
    private javax.swing.JTextField find_post;
    private javax.swing.JTextField find_sal;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainP;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField nm1;
    private javax.swing.JTextField nm3;
    private javax.swing.JTextField nm4;
    private javax.swing.JTextField nm5;
    private javax.swing.JTextField nm6;
    private javax.swing.JTextField post;
    private javax.swing.JLabel remove;
    private javax.swing.JPanel removeP;
    private javax.swing.JPanel removeP2;
    private javax.swing.JTextField sal1;
    private javax.swing.JButton update;
    private javax.swing.JPanel updateP;
    private javax.swing.JSpinner update_age;
    private javax.swing.JComboBox<String> update_day;
    private javax.swing.JRadioButton update_female;
    private javax.swing.JTextField update_id;
    private javax.swing.JRadioButton update_male;
    private javax.swing.JComboBox<String> update_month;
    private javax.swing.JTextField update_name;
    private javax.swing.JTextField update_post;
    private javax.swing.JTextField update_salary;
    private javax.swing.JComboBox<String> update_year;
    private javax.swing.JLabel updatebtn;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
