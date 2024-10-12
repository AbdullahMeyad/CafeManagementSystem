package UI;

import Menu.Espresso;
import Menu.FrozenDrinks;
import Menu.Meals;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuManagement extends javax.swing.JFrame {
    Image logo = new ImageIcon(this.getClass().getResource("/Pictures/coffee.png")).getImage();
    public MenuManagement() {
        initComponents();
        this.getContentPane().setBackground(new Color(204,255,255));
        this.setLocationRelativeTo(null);
        this.setIconImage(logo);
        espressoP.setVisible(false);
        frozenDrinksP.setVisible(false);
        breakfastP.setVisible(false);
        removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        bg.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        espressoP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        frozenDrinksP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        breakfastP = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        removeEspressoP = new javax.swing.JPanel();
        backbtn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();
        addEspressoP = new javax.swing.JPanel();
        backbtn2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updateEspressoP = new javax.swing.JPanel();
        backbtn3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf9 = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        addFrozenDrinksP = new javax.swing.JPanel();
        backbtn4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf10 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        addBtn1 = new javax.swing.JButton();
        removeFrozenDrinksP = new javax.swing.JPanel();
        backbtn5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf13 = new javax.swing.JTextField();
        removebtn1 = new javax.swing.JButton();
        updateFrozenDrinksP = new javax.swing.JPanel();
        backbtn6 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf15 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tf16 = new javax.swing.JTextField();
        updateBtn1 = new javax.swing.JButton();
        addBreakfastP = new javax.swing.JPanel();
        backbtn7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tf17 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tf18 = new javax.swing.JTextField();
        addBtn2 = new javax.swing.JButton();
        removeBreakfastP = new javax.swing.JPanel();
        backbtn8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf19 = new javax.swing.JTextField();
        removebtn2 = new javax.swing.JButton();
        updateBreakfastP = new javax.swing.JPanel();
        backbtn9 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        tf20 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tf21 = new javax.swing.JTextField();
        updateBtn2 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafe Rain");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        mainP.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/espresso.png"))); // NOI18N
        jLabel1.setText("Espresso");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setIconTextGap(30);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/soft-drinks.png"))); // NOI18N
        jLabel2.setText("Frozen Drinks");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setIconTextGap(30);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/breakfast.png"))); // NOI18N
        jLabel3.setText("Breakfast");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setIconTextGap(30);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        backbtn.setText("BACK");
        backbtn.setFocusable(false);
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPLayout = new javax.swing.GroupLayout(mainP);
        mainP.setLayout(mainPLayout);
        mainPLayout.setHorizontalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPLayout.createSequentialGroup()
                .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(mainPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backbtn)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        mainPLayout.setVerticalGroup(
            mainPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        getContentPane().add(mainP);
        mainP.setBounds(0, 0, 500, 600);

        espressoP.setBackground(new java.awt.Color(204, 204, 255));
        espressoP.setPreferredSize(new java.awt.Dimension(500, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/espresso.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add_menu.png"))); // NOI18N
        jButton1.setText("Add new item");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/remove.png"))); // NOI18N
        jButton5.setText("Remove item");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton5.setFocusable(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update_menu.png"))); // NOI18N
        jButton6.setText("Update item");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton6.setFocusable(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/list.png"))); // NOI18N
        jButton7.setText("Show all item");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton7.setFocusable(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout espressoPLayout = new javax.swing.GroupLayout(espressoP);
        espressoP.setLayout(espressoPLayout);
        espressoPLayout.setHorizontalGroup(
            espressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, espressoPLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(espressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, espressoPLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, espressoPLayout.createSequentialGroup()
                        .addGroup(espressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
        );
        espressoPLayout.setVerticalGroup(
            espressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(espressoPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(espressoP);
        espressoP.setBounds(500, 0, 500, 600);

        frozenDrinksP.setBackground(new java.awt.Color(204, 204, 255));
        frozenDrinksP.setPreferredSize(new java.awt.Dimension(500, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/soft-drinks.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add_menu.png"))); // NOI18N
        jButton3.setText("Add new item");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/remove.png"))); // NOI18N
        jButton8.setText("Remove item");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton8.setFocusable(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update_menu.png"))); // NOI18N
        jButton9.setText("Update item");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton9.setFocusable(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/list.png"))); // NOI18N
        jButton10.setText("Show all item");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton10.setFocusable(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frozenDrinksPLayout = new javax.swing.GroupLayout(frozenDrinksP);
        frozenDrinksP.setLayout(frozenDrinksPLayout);
        frozenDrinksPLayout.setHorizontalGroup(
            frozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frozenDrinksPLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(frozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frozenDrinksPLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frozenDrinksPLayout.createSequentialGroup()
                        .addGroup(frozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
        );
        frozenDrinksPLayout.setVerticalGroup(
            frozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frozenDrinksPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(frozenDrinksP);
        frozenDrinksP.setBounds(500, 0, 500, 600);

        breakfastP.setBackground(new java.awt.Color(204, 204, 255));
        breakfastP.setPreferredSize(new java.awt.Dimension(500, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/breakfast.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add_menu.png"))); // NOI18N
        jButton4.setText("Add new item");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton4.setFocusable(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/remove.png"))); // NOI18N
        jButton11.setText("Remove item");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton11.setFocusable(false);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update_menu.png"))); // NOI18N
        jButton12.setText("Update item");
        jButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton12.setFocusable(false);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/list.png"))); // NOI18N
        jButton13.setText("Show all item");
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton13.setFocusable(false);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout breakfastPLayout = new javax.swing.GroupLayout(breakfastP);
        breakfastP.setLayout(breakfastPLayout);
        breakfastPLayout.setHorizontalGroup(
            breakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breakfastPLayout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(breakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breakfastPLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breakfastPLayout.createSequentialGroup()
                        .addGroup(breakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
        );
        breakfastPLayout.setVerticalGroup(
            breakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfastPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(breakfastP);
        breakfastP.setBounds(500, 0, 500, 600);

        removeEspressoP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn1.setText("BACK");
        backbtn1.setFocusable(false);
        backbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn1MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/espresso.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel7.setText("Name          :");

        tf5.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf5KeyTyped(evt);
            }
        });

        removebtn.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        removebtn.setText("Remove Item");
        removebtn.setBorder(null);
        removebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removeEspressoPLayout = new javax.swing.GroupLayout(removeEspressoP);
        removeEspressoP.setLayout(removeEspressoPLayout);
        removeEspressoPLayout.setHorizontalGroup(
            removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeEspressoPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeEspressoPLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(removebtn))
                    .addGroup(removeEspressoPLayout.createSequentialGroup()
                        .addGroup(removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeEspressoPLayout.createSequentialGroup()
                                .addComponent(backbtn1)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeEspressoPLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        removeEspressoPLayout.setVerticalGroup(
            removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeEspressoPLayout.createSequentialGroup()
                .addGroup(removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeEspressoPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removeEspressoPLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel10)))
                .addGap(118, 118, 118)
                .addGroup(removeEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addComponent(removebtn)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(removeEspressoP);
        removeEspressoP.setBounds(0, 0, 500, 600);

        addEspressoP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn2.setText("BACK");
        backbtn2.setFocusable(false);
        backbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn2MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/espresso.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel13.setText("Name           :");

        tf1.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel14.setText("Small Price    :");

        tf2.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel15.setText("Large Price    :");

        tf3.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel16.setText("Regular Price  :");

        tf4.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf4KeyTyped(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        addBtn.setText("Add Item");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addEspressoPLayout = new javax.swing.GroupLayout(addEspressoP);
        addEspressoP.setLayout(addEspressoPLayout);
        addEspressoPLayout.setHorizontalGroup(
            addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEspressoPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(213, 213, 213))
            .addGroup(addEspressoPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEspressoPLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEspressoPLayout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf4)))
                    .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addEspressoPLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf3))
                        .addGroup(addEspressoPLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEspressoPLayout.createSequentialGroup()
                            .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(backbtn2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        addEspressoPLayout.setVerticalGroup(
            addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEspressoPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(55, 55, 55)
                .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(addEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(addBtn)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(addEspressoP);
        addEspressoP.setBounds(0, 0, 509, 600);

        updateEspressoP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn3.setText("BACK");
        backbtn3.setFocusable(false);
        backbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn3MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/espresso.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel18.setText("Name           :");

        tf6.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf6KeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel19.setText("Small Price    :");

        tf7.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf7KeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel20.setText("Large Price    :");

        tf8.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf8KeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel21.setText("Regular Price  :");

        tf9.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf9KeyTyped(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        updateBtn.setText("Update Item");
        updateBtn.setFocusable(false);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateEspressoPLayout = new javax.swing.GroupLayout(updateEspressoP);
        updateEspressoP.setLayout(updateEspressoPLayout);
        updateEspressoPLayout.setHorizontalGroup(
            updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEspressoPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(213, 213, 213))
            .addGroup(updateEspressoPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateEspressoPLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateEspressoPLayout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf9)))
                    .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(updateEspressoPLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf8))
                        .addGroup(updateEspressoPLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf7))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEspressoPLayout.createSequentialGroup()
                            .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(backbtn3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        updateEspressoPLayout.setVerticalGroup(
            updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEspressoPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(55, 55, 55)
                .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(updateEspressoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(updateBtn)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        getContentPane().add(updateEspressoP);
        updateEspressoP.setBounds(0, 0, 509, 600);

        addFrozenDrinksP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn4.setText("BACK");
        backbtn4.setFocusable(false);
        backbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn4MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/soft-drinks.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel23.setText("Name           :");

        tf10.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf10KeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel25.setText("Large Price    :");

        tf11.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf11KeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel26.setText("Regular Price  :");

        tf12.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf12KeyTyped(evt);
            }
        });

        addBtn1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        addBtn1.setText("Add Item");
        addBtn1.setFocusable(false);
        addBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addFrozenDrinksPLayout = new javax.swing.GroupLayout(addFrozenDrinksP);
        addFrozenDrinksP.setLayout(addFrozenDrinksPLayout);
        addFrozenDrinksPLayout.setHorizontalGroup(
            addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFrozenDrinksPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(213, 213, 213))
            .addGroup(addFrozenDrinksPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addFrozenDrinksPLayout.createSequentialGroup()
                        .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(backbtn4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addFrozenDrinksPLayout.createSequentialGroup()
                        .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf12)
                            .addGroup(addFrozenDrinksPLayout.createSequentialGroup()
                                .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBtn1)
                                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
        );
        addFrozenDrinksPLayout.setVerticalGroup(
            addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrozenDrinksPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(55, 55, 55)
                .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(54, 54, 54)
                .addComponent(addBtn1)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        getContentPane().add(addFrozenDrinksP);
        addFrozenDrinksP.setBounds(0, 0, 509, 600);

        removeFrozenDrinksP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn5.setText("BACK");
        backbtn5.setFocusable(false);
        backbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn5MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/soft-drinks.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel8.setText("Name          :");

        tf13.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf13KeyTyped(evt);
            }
        });

        removebtn1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        removebtn1.setText("Remove Item");
        removebtn1.setBorder(null);
        removebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removeFrozenDrinksPLayout = new javax.swing.GroupLayout(removeFrozenDrinksP);
        removeFrozenDrinksP.setLayout(removeFrozenDrinksPLayout);
        removeFrozenDrinksPLayout.setHorizontalGroup(
            removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(removebtn1))
                    .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                        .addGroup(removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                                .addComponent(backbtn5)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeFrozenDrinksPLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        removeFrozenDrinksPLayout.setVerticalGroup(
            removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                .addGroup(removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removeFrozenDrinksPLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)))
                .addGap(118, 118, 118)
                .addGroup(removeFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(54, 54, 54)
                .addComponent(removebtn1)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(removeFrozenDrinksP);
        removeFrozenDrinksP.setBounds(0, 0, 500, 600);

        updateFrozenDrinksP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn6.setText("BACK");
        backbtn6.setFocusable(false);
        backbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn6MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/soft-drinks.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel27.setText("Name           :");

        tf14.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf14KeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel29.setText("Large Price    :");

        tf15.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf15KeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel30.setText("Regular Price  :");

        tf16.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf16KeyTyped(evt);
            }
        });

        updateBtn1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        updateBtn1.setText("Update Item");
        updateBtn1.setFocusable(false);
        updateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateFrozenDrinksPLayout = new javax.swing.GroupLayout(updateFrozenDrinksP);
        updateFrozenDrinksP.setLayout(updateFrozenDrinksPLayout);
        updateFrozenDrinksPLayout.setHorizontalGroup(
            updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateFrozenDrinksPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(213, 213, 213))
            .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf15))
                        .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                                    .addComponent(updateBtn1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(tf16))))
                    .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                        .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(backbtn6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        updateFrozenDrinksPLayout.setVerticalGroup(
            updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateFrozenDrinksPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(55, 55, 55)
                .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(updateFrozenDrinksPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(updateBtn1)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(updateFrozenDrinksP);
        updateFrozenDrinksP.setBounds(0, 0, 509, 600);

        addBreakfastP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn7.setText("BACK");
        backbtn7.setFocusable(false);
        backbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn7MouseClicked(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/breakfast.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel31.setText("Name           :");

        tf17.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf17KeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel32.setText("Price          :");

        tf18.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf18KeyTyped(evt);
            }
        });

        addBtn2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        addBtn2.setText("Add Item");
        addBtn2.setFocusable(false);
        addBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addBreakfastPLayout = new javax.swing.GroupLayout(addBreakfastP);
        addBreakfastP.setLayout(addBreakfastPLayout);
        addBreakfastPLayout.setHorizontalGroup(
            addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBreakfastPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(213, 213, 213))
            .addGroup(addBreakfastPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBreakfastPLayout.createSequentialGroup()
                        .addGroup(addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(backbtn7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBreakfastPLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn2)
                            .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        addBreakfastPLayout.setVerticalGroup(
            addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBreakfastPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(55, 55, 55)
                .addGroup(addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tf17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(addBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(addBtn2)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        getContentPane().add(addBreakfastP);
        addBreakfastP.setBounds(0, 0, 509, 600);

        removeBreakfastP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn8.setText("BACK");
        backbtn8.setFocusable(false);
        backbtn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn8MouseClicked(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/breakfast.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel9.setText("Name          :");

        tf19.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf19KeyTyped(evt);
            }
        });

        removebtn2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        removebtn2.setText("Remove Item");
        removebtn2.setBorder(null);
        removebtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout removeBreakfastPLayout = new javax.swing.GroupLayout(removeBreakfastP);
        removeBreakfastP.setLayout(removeBreakfastPLayout);
        removeBreakfastPLayout.setHorizontalGroup(
            removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBreakfastPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeBreakfastPLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(removebtn2))
                    .addGroup(removeBreakfastPLayout.createSequentialGroup()
                        .addGroup(removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(removeBreakfastPLayout.createSequentialGroup()
                                .addComponent(backbtn8)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBreakfastPLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        removeBreakfastPLayout.setVerticalGroup(
            removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeBreakfastPLayout.createSequentialGroup()
                .addGroup(removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeBreakfastPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removeBreakfastPLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel33)))
                .addGap(118, 118, 118)
                .addGroup(removeBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(54, 54, 54)
                .addComponent(removebtn2)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(removeBreakfastP);
        removeBreakfastP.setBounds(0, 0, 500, 600);

        updateBreakfastP.setBackground(new java.awt.Color(204, 255, 255));

        backbtn9.setText("BACK");
        backbtn9.setFocusable(false);
        backbtn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtn9MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/breakfast.png"))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel35.setText("Name           :");

        tf20.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf20KeyTyped(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel36.setText("Price          :");

        tf21.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        tf21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf21KeyTyped(evt);
            }
        });

        updateBtn2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        updateBtn2.setText("Update Item");
        updateBtn2.setFocusable(false);
        updateBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateBreakfastPLayout = new javax.swing.GroupLayout(updateBreakfastP);
        updateBreakfastP.setLayout(updateBreakfastPLayout);
        updateBreakfastPLayout.setHorizontalGroup(
            updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBreakfastPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(213, 213, 213))
            .addGroup(updateBreakfastPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(updateBreakfastPLayout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf21))
                        .addGroup(updateBreakfastPLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(updateBtn2)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(updateBreakfastPLayout.createSequentialGroup()
                        .addGroup(updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(backbtn9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        updateBreakfastPLayout.setVerticalGroup(
            updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBreakfastPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(55, 55, 55)
                .addGroup(updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(tf20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(updateBreakfastPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(updateBtn2)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        getContentPane().add(updateBreakfastP);
        updateBreakfastP.setBounds(0, 0, 509, 600);

        bg.setBackground(new java.awt.Color(204, 204, 255));
        bg.setPreferredSize(new java.awt.Dimension(500, 0));
        bg.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/relax.png"))); // NOI18N
        bg.add(jLabel37);
        jLabel37.setBounds(-4, -4, 520, 620);

        getContentPane().add(bg);
        bg.setBounds(500, 0, 500, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        espressoP.setVisible(true);
        frozenDrinksP.setVisible(false);
        breakfastP.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       espressoP.setVisible(false);
        frozenDrinksP.setVisible(true);
        breakfastP.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        espressoP.setVisible(false);
        frozenDrinksP.setVisible(false);
        breakfastP.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        ChooseOpt obj=new ChooseOpt();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void backbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn1MouseClicked
        removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(true);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void backbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn2MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         removeEspressoP.setVisible(true);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        Espresso obj=new Espresso();
        String v1=tf1.getText();
        int v2=Integer.parseInt(tf2.getText());
        int v3=Integer.parseInt(tf3.getText());
        int v4=Integer.parseInt(tf4.getText());
        if(obj.addFood(v1, v2, v3, v4)){
            JOptionPane.showMessageDialog(null, "Item added successfully");
            addEspressoP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf1KeyTyped

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf2KeyTyped

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf3KeyTyped

    private void tf4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf4KeyTyped

    private void tf5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf5KeyTyped

    private void removebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtnMouseClicked
        Espresso obj=new Espresso();
        String v1=tf5.getText();
        
        if(obj.removeFood(v1)){
            JOptionPane.showMessageDialog(null, "Item removed successfully");
            removeEspressoP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Item not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removebtnMouseClicked

    private void backbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn3MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn3MouseClicked

    private void tf6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf6KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf6KeyTyped

    private void tf7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf7KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf7KeyTyped

    private void tf8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf8KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf8KeyTyped

    private void tf9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf9KeyTyped
       char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf9KeyTyped

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        Espresso obj=new Espresso();
        String v1=tf6.getText();
        int v2=Integer.parseInt(tf7.getText());
        int v3=Integer.parseInt(tf8.getText());
        int v4=Integer.parseInt(tf9.getText());
        if(obj.updatePrice(v1, v2, v3, v4)){
            JOptionPane.showMessageDialog(null, "Item price updated successfully");
            updateEspressoP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Food not available in your menu!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(true);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        ShowAllInfo obj=new ShowAllInfo();
        obj.setVisible(true);
        obj.getEspressoMenu();
    }//GEN-LAST:event_jButton7MouseClicked

    private void backbtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn4MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn4MouseClicked

    private void tf10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf10KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf10KeyTyped

    private void tf11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf11KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf11KeyTyped

    private void tf12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf12KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf12KeyTyped

    private void addBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtn1MouseClicked
        FrozenDrinks obj=new FrozenDrinks();
        String v1=tf10.getText();
        int v2=Integer.parseInt(tf11.getText());
        int v3=Integer.parseInt(tf12.getText());
        int v4=0;
        if(obj.addFood(v1, v2, v3, v4)){
            JOptionPane.showMessageDialog(null, "Item added successfully");
            addFrozenDrinksP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtn1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(true);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void backbtn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn5MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn5MouseClicked

    private void tf13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf13KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf13KeyTyped

    private void removebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtn1MouseClicked
        FrozenDrinks obj=new FrozenDrinks();
        String v1=tf13.getText();
        
        if(obj.removeFood(v1)){
            JOptionPane.showMessageDialog(null, "Item removed successfully");
            removeFrozenDrinksP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Item not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removebtn1MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(true);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    private void backbtn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn6MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn6MouseClicked

    private void tf14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf14KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf14KeyTyped

    private void tf15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf15KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf15KeyTyped

    private void tf16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf16KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf16KeyTyped

    private void updateBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn1MouseClicked
       FrozenDrinks obj=new FrozenDrinks();
        String v1=tf14.getText();
        int v2=Integer.parseInt(tf15.getText());
        int v3=Integer.parseInt(tf16.getText());
        int v4=0;
        if(obj.updatePrice(v1, v3, v2, v4)){
            JOptionPane.showMessageDialog(null, "Item price updated successfully");
            updateFrozenDrinksP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Item not available in your menu!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn1MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(true);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        ShowAllInfo obj=new ShowAllInfo();
        obj.setVisible(true);
        obj.getFrozenDrinksMenu();
    }//GEN-LAST:event_jButton10MouseClicked

    private void backbtn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn7MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn7MouseClicked

    private void tf17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf17KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf17KeyTyped

    private void tf18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf18KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf18KeyTyped

    private void addBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtn2MouseClicked
        Meals obj=new Meals();
        String v1=tf17.getText();
        int v2=Integer.parseInt(tf18.getText());
        int v3=0;
        int v4=0;
        if(obj.addFood(v1, v2, v3, v4)){
            JOptionPane.showMessageDialog(null, "Item added successfully");
            addBreakfastP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtn2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(true);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void backbtn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn8MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn8MouseClicked

    private void tf19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf19KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf19KeyTyped

    private void removebtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtn2MouseClicked
        Meals obj=new Meals();
        String v1=tf19.getText();       
        if(obj.removeFood(v1)){
            JOptionPane.showMessageDialog(null, "Item removed successfully");
            removeBreakfastP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Item not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removebtn2MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
         removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(true);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton11MouseClicked

    private void backbtn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtn9MouseClicked
       removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(false);
        mainP.setVisible(true);
    }//GEN-LAST:event_backbtn9MouseClicked

    private void tf20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf20KeyTyped
        char c =evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf20KeyTyped

    private void tf21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf21KeyTyped
        char c =evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_tf21KeyTyped

    private void updateBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn2MouseClicked
        Meals obj=new Meals();
        String v1=tf20.getText();
        int v2=Integer.parseInt(tf21.getText());
        int v3=0;
        int v4=0;
        if(obj.updatePrice(v1, v2, v3, v4)){
            JOptionPane.showMessageDialog(null, "Item price updated successfully");
            updateBreakfastP.setVisible(false);
            mainP.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Item not available in your menu!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn2MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        removeEspressoP.setVisible(false);
        addEspressoP.setVisible(false);
        updateEspressoP.setVisible(false);
        addFrozenDrinksP.setVisible(false);
        removeFrozenDrinksP.setVisible(false);
        updateFrozenDrinksP.setVisible(false);
        addBreakfastP.setVisible(false);
        removeBreakfastP.setVisible(false);
        updateBreakfastP.setVisible(true);
        mainP.setVisible(false);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        ShowAllInfo obj=new ShowAllInfo();
        obj.setVisible(true);
        obj.getBreakfastMenu();
    }//GEN-LAST:event_jButton13MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBreakfastP;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn2;
    private javax.swing.JPanel addEspressoP;
    private javax.swing.JPanel addFrozenDrinksP;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton backbtn1;
    private javax.swing.JButton backbtn2;
    private javax.swing.JButton backbtn3;
    private javax.swing.JButton backbtn4;
    private javax.swing.JButton backbtn5;
    private javax.swing.JButton backbtn6;
    private javax.swing.JButton backbtn7;
    private javax.swing.JButton backbtn8;
    private javax.swing.JButton backbtn9;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel breakfastP;
    private javax.swing.JPanel espressoP;
    private javax.swing.JPanel frozenDrinksP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainP;
    private javax.swing.JPanel removeBreakfastP;
    private javax.swing.JPanel removeEspressoP;
    private javax.swing.JPanel removeFrozenDrinksP;
    private javax.swing.JButton removebtn;
    private javax.swing.JButton removebtn1;
    private javax.swing.JButton removebtn2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JPanel updateBreakfastP;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JButton updateBtn2;
    private javax.swing.JPanel updateEspressoP;
    private javax.swing.JPanel updateFrozenDrinksP;
    // End of variables declaration//GEN-END:variables
}
