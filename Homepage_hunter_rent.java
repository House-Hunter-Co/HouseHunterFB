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

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
public class Homepage_hunter_rent extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    Postgresql q = new Postgresql();
    int len = q.getHousesForRent().size();

    Object[][] houses = q.getHousesForRent().toArray(new String[len][]);
    public Homepage_hunter_rent() {
        initComponents();
        
        Object columns[] = { "ID","City", "Owner","Rent or Sale","Address","Details","Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));
        
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = jTable1.getSelectedRow();
                DetailsArea.setText("ID:"+houses[row][0]+"\n"+
                                    "City:"+houses[row][1]+"\n"+
                                    "Rent Or Sale:"+houses[row][3]+"\n"+
                                    "Address:"+houses[row][4]+"\n"+
                                    "Details:"+houses[row][5]+"\n"+
                                    "Number of Bedrooms:"+houses[row][6]+"\n"+
                                    "Price:"+houses[row][8]+"\n");
            }
        });
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
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_add2 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailsArea = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        btn_homepage.setBackground(new java.awt.Color(197, 52, 57));
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

        jPanel10.setBackground(new java.awt.Color(180, 0, 0));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(180, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(180, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(180, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Book Appointment");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_calendar_plus_20px.png"))); // NOI18N
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/househunterlogowhite.png"))); // NOI18N

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

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("My Appointments");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setPreferredSize(new java.awt.Dimension(190, 30));
        btn_add2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_document_20px.png"))); // NOI18N
        btn_add2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_homepage, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btn_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        homepage.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 550));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
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
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable1.setSelectionBackground(new java.awt.Color(194, 24, 7));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        homepage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 690, 130));

        DetailsArea.setColumns(20);
        DetailsArea.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        DetailsArea.setRows(5);
        DetailsArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jScrollPane2.setViewportView(DetailsArea);

        homepage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 530, 120));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        homepage.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 60, 30));

        jLabel6.setText("Max:");
        homepage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 40, 30));
        homepage.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 60, 30));

        jLabel11.setText("City");
        homepage.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 40, 30));

        jLabel12.setText("Min:");
        homepage.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 40, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Adana\"", "\"Adıyaman\"", "\"Afyon\"", "\"Ağrı\"", "\"Amasya\"", "\"Ankara\"", "\"Antalya\"", "\"Artvin\"", "\"Aydın\"", "\"Balıkesir\"", "\"Bilecik\"", "\"Bingöl\"", "\"Bitlis\"", "\"Bolu\"", "\"Burdur\"", "\"Bursa\"", "\"Çanakkale\"", "\"Çankırı\"", "\"Çorum\"", "\"Denizli\"", "\"Diyarbakır\"", "\"Edirne\"", "\"Elazığ\"", "\"Erzincan\"", "\"Erzurum \"", "\"Eskişehir\"", "\"Gaziantep\"", "\"Giresun\"", "\"Gümüşhane\"", "\"Hakkari\"", "\"Hatay\"", "\"Isparta\"", "\"Mersin\"", "\"İstanbul\"", "\"İzmir\"", "\"Kars\"", "\"Kastamonu\"", "\"Kayseri\"", "\"Kırklareli\"", "\"Kırşehir\"", "\"Kocaeli\"", "\"Konya\"", "\"Kütahya \"", "\"Malatya\"", "\"Manisa\"", "\"Kahramanmaraş\"", "\"Mardin\"", "\"Muğla\"", "\"Muş\"", "\"Nevşehir\"", "\"Niğde\"", "\"Ordu\"", "\"Rize\"", "\"Sakarya\"", "\"Samsun\"", "\"Siirt\"", "\"Sinop\"", "\"Sivas\"", "\"Tekirdağ\"", "\"Tokat\"", "\"Trabzon  \"", "\"Tunceli\"", "\"Şanlıurfa\"", "\"Uşak\"", "\"Van\"", "\"Yozgat\"", "\"Zonguldak\"", "\"Aksaray\"", "\"Bayburt \"", "\"Karaman\"", "\"Kırıkkale\"", "\"Batman\"", "\"Şırnak\"", "\"Bartın\"", "\"Ardahan\"", "\"Iğdır\"", "\"Yalova\"", "\"Karabük \"", "\"Kilis\"", "\"Osmaniye \"", "\"Düzce\"" }));
        homepage.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 170, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_search_20px_2.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        homepage.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 100, 30));

        jPanel2.setBackground(new java.awt.Color(210, 24, 7));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homepage.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 690, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_house_80px.png"))); // NOI18N
        homepage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 100, 110));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Price Range:");
        homepage.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 70, 20));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        var q = new Postgresql();
                String city = jComboBox1.getSelectedItem().toString();
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
        try{
            max = Integer.parseInt(jTextField1.getText());
            min = Integer.parseInt(jTextField3.getText());
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        len = q.getHousesForCriteria("Rent", city,min , max).size();
        System.out.println("****"+len);
        houses = q.getHousesForCriteria("Rent",city ,min ,max  ).toArray(new String[len][]);
        Object columns[] = { "ID","City", "Owner","Rent or Sale","Address","Details","Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));

        System.out.println(len);
    } 

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btn_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accountMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HunterAccount().setVisible(true);
        
    }//GEN-LAST:event_btn_accountMouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Bookappointment().setVisible(true);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void btn_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add2MouseClicked
        this.setVisible(false);
        new Hunter_Appointment().setVisible(true);
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
            java.util.logging.Logger.getLogger(Homepage_hunter_rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage_hunter_rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage_hunter_rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage_hunter_rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage_hunter_rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DetailsArea;
    private javax.swing.JPanel btn_account;
    private javax.swing.JPanel btn_add2;
    private javax.swing.JPanel btn_homepage;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
