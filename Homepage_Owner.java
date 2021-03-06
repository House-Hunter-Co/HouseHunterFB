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

public class Homepage_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage_Owner() {
        initComponents();
        var q = new Postgresql();
        int len = q.getAllHouses().size();

        Object[][] houses = q.getAllHouses().toArray(new String[len][]);
        Object columns[] = {"ID", "City", "Owner", "Rent or Sale", "Address", "Details", "Number Of Bedrooms", "", "Price"};
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_properties = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_add = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_add1 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ALLjButton3 = new javax.swing.JButton();

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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/househunterlogowhite.png"))); // NOI18N

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

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("My Properties");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_properties.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 20));

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

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_add_new_20px.png"))); // NOI18N
        btn_add.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_add1.setBackground(new java.awt.Color(180, 0, 0));
        btn_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add1MouseClicked(evt);
            }
        });
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

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_delete_column_20px.png"))); // NOI18N
        btn_add1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        jLabel21.setText("Manage Appointments");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
            .addComponent(btn_properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(btn_add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        homepage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 690, 130));

        DetailsArea.setColumns(20);
        DetailsArea.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        DetailsArea.setRows(5);
        DetailsArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jScrollPane2.setViewportView(DetailsArea);

        homepage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 530, 120));

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

        jPanel1.setBackground(new java.awt.Color(210, 24, 7));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homepage.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 690, 20));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Price Range:");
        homepage.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 70, 20));

        ALLjButton3.setBackground(new java.awt.Color(153, 0, 0));
        ALLjButton3.setForeground(new java.awt.Color(255, 255, 255));
        ALLjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/househunter/Images/icons8_search_20px_2.png"))); // NOI18N
        ALLjButton3.setText("   All       ");
        ALLjButton3.setBorderPainted(false);
        ALLjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLjButton3ActionPerformed(evt);
            }
        });
        homepage.add(ALLjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 100, 30));

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

  

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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

    private void btn_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Owner_Remove().setVisible(true);
    }//GEN-LAST:event_btn_add1MouseClicked

    private void btn_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Owner_Appointments().setVisible(true);
    }//GEN-LAST:event_btn_add2MouseClicked

    

                                            

                                        

   

                                     

                                         

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         var q = new Postgresql();
        int len = q.getAllHouses().size();

        Object[][] houses = q.getAllHouses().toArray(new String[len][]);
        Object columns[] = {"ID", "City", "Owner", "Rent or Sale", "Address", "Details", "Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));
    }                                        

                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        int len = q.getHousesForCriteria("Rent,Sale", city, min, max).size();

        Object[][] houses = q.getHousesForCriteria("All", city, min, max).toArray(new String[len][]);
        Object columns[] = {"ID", "City", "Owner", "Rent or Sale", "Address", "Details", "Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));

        System.out.println(len);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ALLjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLjButton3ActionPerformed
             var q = new Postgresql();
        int len = q.getAllHouses().size();

        Object[][] houses = q.getAllHouses().toArray(new String[len][]);
        Object columns[] = {"ID", "City", "Owner", "Rent or Sale", "Address", "Details", "Number Of Bedrooms", "", "Price"};
        jTable1.setModel(new DefaultTableModel(houses, columns));
    }//GEN-LAST:event_ALLjButton3ActionPerformed

                                            

                                        

                                        

                                        

                                           

                                           

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
            java.util.logging.Logger.getLogger(Homepage_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Homepage_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALLjButton3;
    private javax.swing.JTextArea DetailsArea;
    private javax.swing.JPanel btn_account;
    private javax.swing.JPanel btn_add;
    private javax.swing.JPanel btn_add1;
    private javax.swing.JPanel btn_add2;
    private javax.swing.JPanel btn_homepage;
    private javax.swing.JPanel btn_properties;
    private javax.swing.JPanel homepage;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
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
