/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.java.tetris;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Anupat
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        init();

    }

    private void init() {
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 30, 30));
                                                                                                  
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");

        this.getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                int dialogResult = JOptionPane.showConfirmDialog(null, "ต้องการออกจากเกมใช่หรือไม่", null,
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // exitBTN mouse hover
        exitBTN.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBTN.setBackground(new java.awt.Color(255, 0, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBTN.setBackground(new java.awt.Color(0, 0, 0));
            }
        });

        // PLAY_BTN mouse hover
        PLAY_BTN.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PLAY_BTN.setBackground(new java.awt.Color(255, 0, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PLAY_BTN.setBackground(new java.awt.Color(255, 153, 51));
            }
        });

        // HELP_BTN mouse hover
        HELP_BTN.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HELP_BTN.setBackground(new java.awt.Color(255, 0, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                HELP_BTN.setBackground(new java.awt.Color(255, 153, 51));
            }
        });

        // ABOUT_BTN mouse hover
        ABOUT_BTN.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ABOUT_BTN.setBackground(new java.awt.Color(255, 0, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ABOUT_BTN.setBackground(new java.awt.Color(255, 153, 51));
            }
        });

        // help_back_btn mouse hover
        help_back_btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help_back_btn.setBackground(new java.awt.Color(255, 0, 0));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                help_back_btn.setBackground(new java.awt.Color(255, 153, 51));
            }
        });

        // BTN no border
        exitBTN.setBorderPainted(false);
        PLAY_BTN.setBorderPainted(false);
        HELP_BTN.setBorderPainted(false);
        ABOUT_BTN.setBorderPainted(false);
        help_back_btn.setBorderPainted(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        MAIN_PAGE = new javax.swing.JPanel();
        T2 = new javax.swing.JLabel();
        PLAY_BTN = new javax.swing.JButton();
        HELP_BTN = new javax.swing.JButton();
        ABOUT_BTN = new javax.swing.JButton();
        T1 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        T3 = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        HELP_PAGE = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        help_back_btn = new javax.swing.JButton();
        ABOUT_PAGE = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        about_back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Noto Sans Thai", 0, 10)); // NOI18N
        setMaximizedBounds(new java.awt.Rectangle(1280, 720, 720, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MAIN_PAGE.setBackground(new java.awt.Color(0, 0, 0));
        MAIN_PAGE.setMaximumSize(new java.awt.Dimension(1280, 720));
        MAIN_PAGE.setMinimumSize(new java.awt.Dimension(1280, 720));
        MAIN_PAGE.setPreferredSize(new java.awt.Dimension(1280, 720));

        T2.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        T2.setForeground(new java.awt.Color(0, 51, 255));
        T2.setText("T");

        PLAY_BTN.setBackground(new java.awt.Color(255, 153, 51));
        PLAY_BTN.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        PLAY_BTN.setForeground(new java.awt.Color(255, 255, 255));
        PLAY_BTN.setText("เข้าสู่เกม");
        PLAY_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAY_BTNActionPerformed(evt);
            }
        });

        HELP_BTN.setBackground(new java.awt.Color(255, 153, 51));
        HELP_BTN.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        HELP_BTN.setForeground(new java.awt.Color(255, 255, 255));
        HELP_BTN.setText("ช่วยเหลือ");
        HELP_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELP_BTNActionPerformed(evt);
            }
        });

        ABOUT_BTN.setBackground(new java.awt.Color(255, 153, 51));
        ABOUT_BTN.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        ABOUT_BTN.setForeground(new java.awt.Color(255, 255, 255));
        ABOUT_BTN.setText("เกี่ยวกับ");
        ABOUT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUT_BTNActionPerformed(evt);
            }
        });

        T1.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        T1.setForeground(new java.awt.Color(255, 0, 51));
        T1.setText("T");

        E1.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        E1.setForeground(new java.awt.Color(51, 255, 0));
        E1.setText("E");

        S.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        S.setForeground(new java.awt.Color(153, 0, 153));
        S.setText("S");

        E2.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        E2.setForeground(new java.awt.Color(255, 255, 0));
        E2.setText("E");

        T3.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        T3.setForeground(new java.awt.Color(255, 0, 204));
        T3.setText("T");

        R.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        R.setForeground(new java.awt.Color(255, 153, 0));
        R.setText("R");

        I.setFont(new java.awt.Font("Noto Sans Thai", 1, 80)); // NOI18N
        I.setForeground(new java.awt.Color(0, 255, 204));
        I.setText("I");

        exitBTN.setBackground(new java.awt.Color(0, 0, 0));
        exitBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("X");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/java/tetris/bg-tetris-2.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout MAIN_PAGELayout = new javax.swing.GroupLayout(MAIN_PAGE);
        MAIN_PAGE.setLayout(MAIN_PAGELayout);
        MAIN_PAGELayout.setHorizontalGroup(
            MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_PAGELayout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addGroup(MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addComponent(T1)
                        .addGap(18, 18, 18)
                        .addComponent(E1)
                        .addGap(18, 18, 18)
                        .addComponent(T2)
                        .addGap(18, 18, 18)
                        .addComponent(E2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T3))
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addComponent(PLAY_BTN)
                        .addGap(79, 79, 79)
                        .addComponent(HELP_BTN)))
                .addGroup(MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R)
                        .addGap(18, 18, 18)
                        .addComponent(I)
                        .addGap(18, 18, 18)
                        .addComponent(S))
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(ABOUT_BTN)))
                .addGap(387, 387, 387))
            .addGroup(MAIN_PAGELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        MAIN_PAGELayout.setVerticalGroup(
            MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_PAGELayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2)
                    .addComponent(T1)
                    .addComponent(T3)
                    .addComponent(I)
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(E2))
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(R)
                            .addComponent(E1)))
                    .addGroup(MAIN_PAGELayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(S)))
                .addGap(110, 110, 110)
                .addGroup(MAIN_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HELP_BTN)
                    .addComponent(ABOUT_BTN)
                    .addComponent(PLAY_BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 302, Short.MAX_VALUE))
        );

        Tab.addTab("tab1", MAIN_PAGE);

        HELP_PAGE.setBackground(new java.awt.Color(0, 0, 0));
        HELP_PAGE.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel2.setFont(new java.awt.Font("Noto Sans Thai", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("วิธีการเล่นเกม Trtris");

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Noto Sans Thai", 1, 36)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("\tผู้เล่นจะต้องเรียงบล็อคในแต่ละแถวให้เต็มแถว แถวนั้นทั้งแถวก็จะหายไป หากสามารถทำให้หายได้พร้อมกันหลาย ๆ แถว จะได้คะแนนมากขึ้นอีกด้วย");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/java/tetris/bg-tetris.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/java/tetris/bg-tetris.png"))); // NOI18N

        help_back_btn.setBackground(new java.awt.Color(255, 153, 51));
        help_back_btn.setFont(new java.awt.Font("Noto Sans Thai", 0, 14)); // NOI18N
        help_back_btn.setForeground(new java.awt.Color(255, 255, 255));
        help_back_btn.setText("กลับหน้าแรก");
        help_back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HELP_PAGELayout = new javax.swing.GroupLayout(HELP_PAGE);
        HELP_PAGE.setLayout(HELP_PAGELayout);
        HELP_PAGELayout.setHorizontalGroup(
            HELP_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HELP_PAGELayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HELP_PAGELayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(HELP_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HELP_PAGELayout.createSequentialGroup()
                        .addGroup(HELP_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HELP_PAGELayout.createSequentialGroup()
                        .addComponent(help_back_btn)
                        .addGap(60, 60, 60))))
        );
        HELP_PAGELayout.setVerticalGroup(
            HELP_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HELP_PAGELayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(help_back_btn)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(HELP_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HELP_PAGELayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(HELP_PAGELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Tab.addTab("tab2", HELP_PAGE);

        ABOUT_PAGE.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Noto Sans Thai", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("เกี่ยวกับ");

        jLabel5.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 153));
        jLabel5.setText("ข้อมูลผู้พัฒนา");

        jLabel6.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("นางสาว ยอดกมล พิทักษ์ธีรพงศ์ เลขที่ 2");

        jLabel7.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("นางสาว สุดารัตน์ นวลใย เลขที่ 1");

        jLabel8.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("สาขาคอมพิวเตอร์ธุรกิจ");

        jLabel9.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("นางสาว สุภาดา แสงจันทร์ เลขที่ 11");

        jLabel10.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 153));
        jLabel10.setText("อาจารย์ผู้สอน");

        jLabel12.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("อาจารย์ผู้สอน มนัสวี ศรีบุบผา");

        jLabel13.setFont(new java.awt.Font("Noto Sans Thai", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 153));
        jLabel13.setText("เครื่องมือการพัฒนา");

        jLabel14.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("วิชาการเขียนโปรแกรมเชิงวัตถุเบื้องต้น");

        jLabel15.setFont(new java.awt.Font("Noto Sans Thai", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Java Nebeans");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/java/tetris/bg-tetris-2.png"))); // NOI18N
        jLabel16.setText("jLabel16");

        about_back_btn.setBackground(new java.awt.Color(255, 153, 51));
        about_back_btn.setFont(new java.awt.Font("Noto Sans Thai", 0, 14)); // NOI18N
        about_back_btn.setForeground(new java.awt.Color(255, 255, 255));
        about_back_btn.setText("กลับหน้าแรก");
        about_back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ABOUT_PAGELayout = new javax.swing.GroupLayout(ABOUT_PAGE);
        ABOUT_PAGE.setLayout(ABOUT_PAGELayout);
        ABOUT_PAGELayout.setHorizontalGroup(
            ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(ABOUT_PAGELayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(ABOUT_PAGELayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(401, 401, 401)
                        .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)))
                    .addGroup(ABOUT_PAGELayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ABOUT_PAGELayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ABOUT_PAGELayout.createSequentialGroup()
                                    .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(110, 110, 110)
                                    .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABOUT_PAGELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(about_back_btn)
                .addGap(60, 60, 60))
        );
        ABOUT_PAGELayout.setVerticalGroup(
            ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABOUT_PAGELayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(about_back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ABOUT_PAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tab.addTab("tab3", ABOUT_PAGE);

        getContentPane().add(Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HELP_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELP_BTNActionPerformed
        // TODO add your handling code here:
        Tab.setSelectedIndex(1);
    }//GEN-LAST:event_HELP_BTNActionPerformed

    private void ABOUT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUT_BTNActionPerformed
        // TODO add your handling code here:
        Tab.setSelectedIndex(2);
    }//GEN-LAST:event_ABOUT_BTNActionPerformed

    private void help_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_back_btnActionPerformed
        // TODO add your handling code here:
        Tab.setSelectedIndex(0);
    }//GEN-LAST:event_help_back_btnActionPerformed

    private void about_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_back_btnActionPerformed
        // TODO add your handling code here:
         Tab.setSelectedIndex(0);
    }//GEN-LAST:event_about_back_btnActionPerformed

    private void PLAY_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAY_BTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new WindowGame();
    }//GEN-LAST:event_PLAY_BTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "ต้องการออกจากเกมใช่หรือไม่ ?", null,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == JOptionPane.YES_OPTION)System.exit(0);
    }// GEN-LAST:event_exitBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            // for (javax.swing.UIManager.LookAndFeelInfo info :
            // javax.swing.UIManager.getInstalledLookAndFeels()) {
            // if ("Nimbus".equals(info.getName())) {
            // javax.swing.UIManager.setLookAndFeel(info.getClassName());
            // break;
            // }
            // }
            FlatLightLaf.setup();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABOUT_BTN;
    private javax.swing.JPanel ABOUT_PAGE;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JButton HELP_BTN;
    private javax.swing.JPanel HELP_PAGE;
    private javax.swing.JLabel I;
    private javax.swing.JPanel MAIN_PAGE;
    private javax.swing.JButton PLAY_BTN;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton about_back_btn;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton help_back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
