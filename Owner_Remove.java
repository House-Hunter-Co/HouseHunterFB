/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package househunter;

/**
 *
 * @author Dell
 */

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.xml.sax.Attributes;

public class Owner_Remove extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Owner_Remove() {
        initComponents();
        int tempOwnerId = LoginPanel.LOGIN_USER;
        System.out.println("**"+tempOwnerId);
        var q = new Postgresql();
        
        int len = q.getHouseByOwner(tempOwnerId).size();

        Object[][] houses = q.getHouseByOwner(tempOwnerId).toArray(new String[len][]);
        Object columns[] = { "ID","City", "Owner","Rent or Sale","Address","Details","Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        homepage = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_homepage = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_account = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_properties = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_add = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_add1 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_add2 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        homepage.setBackground(new java.awt.Color(255, 255, 255));
        homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("House Hunter");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btn_homepage.setBackground(new java.awt.Color(180, 0, 0));
        btn_homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homepageMouseClicked(evt);
            }
        });
        btn_homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Home page");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_homepage.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_home_20px.png"))); // NOI18N
        btn_homepage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        btn_account.setBackground(new java.awt.Color(180, 0, 0));
        btn_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_accountMouseClicked(evt);
            }
        });
        btn_account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Account");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_account.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_account_20px.png"))); // NOI18N
        btn_account.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_properties.setBackground(new java.awt.Color(180, 0, 0));
        btn_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_propertiesMouseClicked(evt);
            }
        });
        btn_properties.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(180, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(180, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(180, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_properties.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_document_20px.png"))); // NOI18N
        btn_properties.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel18.setBackground(new java.awt.Color(180, 0, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(180, 0, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(180, 0, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(180, 0, 0));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_document_20px.png"))); // NOI18N
        jPanel18.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel22.setBackground(new java.awt.Color(180, 0, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(180, 0, 0));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(180, 0, 0));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(180, 0, 0));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("My Properties");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel22.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_document_20px.png"))); // NOI18N
        jPanel22.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel18.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_properties.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/househunterlogowhite.png"))); // NOI18N

        btn_add.setBackground(new java.awt.Color(180, 0, 0));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        btn_add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(180, 0, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(180, 0, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(180, 0, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_add.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Add Property");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_add.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_add_new_20px.png"))); // NOI18N
        btn_add.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_add1.setBackground(new java.awt.Color(197, 52, 57));
        btn_add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(180, 0, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(180, 0, 0));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(180, 0, 0));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_add1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Remove Property");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_add1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_delete_column_20px.png"))); // NOI18N
        btn_add1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_add2.setBackground(new java.awt.Color(180, 0, 0));
        btn_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add2MouseClicked(evt);
            }
        });
        btn_add2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(180, 0, 0));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(180, 0, 0));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(180, 0, 0));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_add2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Manage Appointments");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_add2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_document_20px.png"))); // NOI18N
        btn_add2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_homepage, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btn_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_properties, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_account, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_properties, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        homepage.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 550));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_remove_20px.png"))); // NOI18N
        jButton2.setText("Remove House");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        homepage.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        homepage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 690, 250));

        jPanel1.setBackground(new java.awt.Color(217, 204, 204));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Remove Property");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(544, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        homepage.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 690, 30));

        jPanel2.setBackground(new java.awt.Color(210, 24, 7));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homepage.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 690, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        var q = new Postgresql();
        
        int len = q.getHouseByOwner(LoginPanel.LOGIN_USER).size();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to remove your house?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            len = q.getHouseByOwner(LoginPanel.LOGIN_USER).size();
            Object[][] houses = q.getHouseByOwner(LoginPanel.LOGIN_USER).toArray(new String[len][]);
            int a = jTable1.getSelectedRow();
            int id = Integer.parseInt(houses[a][0].toString());
            q.removeHouse(id);

            Object[][] housesN = q.getHouseByOwner(LoginPanel.LOGIN_USER).toArray(new String[len][]);
            String columns[] = { "ID","City", "Owner","Rent or Sale","Address","Details","Number Of Bedrooms", "", "Price"};
            var model = new DefaultTableModel(housesN, columns);
            jTable1.setModel(model);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void btn_homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homepageMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Homepage_Owner().setVisible(true);
    }//GEN-LAST:event_btn_homepageMouseClicked

    private void btn_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new OwnerAccount().setVisible(true);
    }//GEN-LAST:event_btn_accountMouseClicked

    private void btn_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_propertiesMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Owner_properties().setVisible(true);
    }//GEN-LAST:event_btn_propertiesMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Owner_Add().setVisible(true);
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add2MouseClicked
        this.setVisible(false);
        new Owner_Appointments().setVisible(true);
    }//GEN-LAST:event_btn_add2MouseClicked

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
            java.util.logging.Logger.getLogger(Owner_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_account;
    private javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_add1;
    private javax.swing.JPanel btn_add2;
    private javax.swing.JPanel btn_homepage;
    private javax.swing.JPanel btn_properties;
    private javax.swing.JPanel homepage;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
