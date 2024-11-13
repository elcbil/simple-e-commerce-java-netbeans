
package ecommerce;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class menuPage extends javax.swing.JFrame implements MouseListener {

    public menuPage() {
        initComponents();
        setLocationRelativeTo(null);
        
        snbBuy1.addMouseListener(this);
        snbBuy2.addMouseListener(this);
        snbBuy3.addMouseListener(this);
        snbBuy4.addMouseListener(this);
        snbBuy5.addMouseListener(this);
        snbBuy6.addMouseListener(this);
        
        fashionBuy1.addMouseListener(this);
        fashionBuy2.addMouseListener(this);
        fashionBuy3.addMouseListener(this);
        fashionBuy4.addMouseListener(this);
        fashionBuy5.addMouseListener(this);
        fashionBuy6.addMouseListener(this);
        
        furnitureBuy1.addMouseListener(this);
        furnitureBuy2.addMouseListener(this);
        furnitureBuy3.addMouseListener(this);
        furnitureBuy4.addMouseListener(this);
        furnitureBuy5.addMouseListener(this);
        furnitureBuy6.addMouseListener(this);
        
    }

    
    DefaultTableModel model = new DefaultTableModel();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        homeClick = new javax.swing.JLabel();
        productClick = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        product = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelKanan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        snb = new javax.swing.JLabel();
        fashion = new javax.swing.JLabel();
        furniture = new javax.swing.JLabel();
        snbproduct = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        snbProduct1 = new javax.swing.JPanel();
        snbBuy1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        snbProduct2 = new javax.swing.JPanel();
        snbBuy2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        snbProduct3 = new javax.swing.JPanel();
        snbBuy3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        snbProduct4 = new javax.swing.JPanel();
        snbBuy4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        snbProduct5 = new javax.swing.JPanel();
        snbBuy5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        snbProduct6 = new javax.swing.JPanel();
        snbBuy6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        fashionproduct = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fashionProduct1 = new javax.swing.JPanel();
        fashionBuy1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fashionProduct2 = new javax.swing.JPanel();
        fashionBuy2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        fashionProduct3 = new javax.swing.JPanel();
        fashionBuy3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fashionProduct4 = new javax.swing.JPanel();
        fashionBuy4 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        fashionProduct5 = new javax.swing.JPanel();
        fashionBuy5 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        fashionProduct6 = new javax.swing.JPanel();
        fashionBuy6 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        furnitureproduct = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        furnitureProduct1 = new javax.swing.JPanel();
        furnitureBuy1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        furnitureProduct2 = new javax.swing.JPanel();
        furnitureBuy2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        furnitureProduct3 = new javax.swing.JPanel();
        furnitureBuy3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        furnitureProduct4 = new javax.swing.JPanel();
        furnitureBuy4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        furnitureProduct5 = new javax.swing.JPanel();
        furnitureBuy5 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        furnitureProduct6 = new javax.swing.JPanel();
        furnitureBuy6 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1506, 810));
        setResizable(false);

        alas.setBackground(new java.awt.Color(255, 255, 255));
        alas.setPreferredSize(new java.awt.Dimension(1506, 810));

        jPanel3.setBackground(new java.awt.Color(188, 163, 138));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 820));

        homeClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        homeClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeClickMouseClicked(evt);
            }
        });

        productClick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product.png"))); // NOI18N
        productClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClickMouseClicked(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-30.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(productClick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(homeClick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(homeClick)
                .addGap(44, 44, 44)
                .addComponent(productClick, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(80, 80, 80))
        );

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(1400, 820));

        jPanel2.setBackground(new java.awt.Color(171, 143, 115));
        jPanel2.setPreferredSize(new java.awt.Dimension(1400, 100));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel2.setText("Contact");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel6.setText("Nabila Huwaida");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N
        jLabel7.setText("nabilahdaa@gmail.com");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 5)); // NOI18N
        jLabel8.setText("________________________________________________________________________");

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/call.png"))); // NOI18N
        jLabel9.setText(" 0821-6045-5334");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/location.png"))); // NOI18N
        jLabel10.setText("Medan, Indonesia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel9)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)
                        .addContainerGap(594, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)))
                .addGap(35, 35, 35))
        );

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_1.jpg"))); // NOI18N
        jLabel48.setText("jLabel48");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1406, Short.MAX_VALUE)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 1384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        product.setBackground(new java.awt.Color(255, 255, 255));
        product.setPreferredSize(new java.awt.Dimension(1402, 800));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel4.setText("B E Y - B U Y");

        panelKanan.setBackground(new java.awt.Color(236, 216, 196));
        panelKanan.setPreferredSize(new java.awt.Dimension(650, 600));

        jTable1.setBackground(new java.awt.Color(129, 101, 73));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(188, 163, 138));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setText("Total :");

        txtsub.setEditable(false);
        txtsub.setBackground(new java.awt.Color(129, 101, 73));
        txtsub.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKananLayout = new javax.swing.GroupLayout(panelKanan);
        panelKanan.setLayout(panelKananLayout);
        panelKananLayout.setHorizontalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKananLayout.createSequentialGroup()
                .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                    .addGroup(panelKananLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelKananLayout.setVerticalGroup(
            panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKananLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtsub, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(188, 163, 138));
        jPanel4.setPreferredSize(new java.awt.Dimension(1400, 40));

        snb.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        snb.setText("SKINCARE & BODYCARE");
        snb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snbMouseClicked(evt);
            }
        });

        fashion.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        fashion.setText("FASHION");
        fashion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fashionMouseClicked(evt);
            }
        });

        furniture.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        furniture.setText("FURNITURE");
        furniture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                furnitureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(snb)
                .addGap(32, 32, 32)
                .addComponent(fashion)
                .addGap(34, 34, 34)
                .addComponent(furniture)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fashion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furniture, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        snbproduct.setBackground(new java.awt.Color(255, 255, 255));
        snbproduct.setPreferredSize(new java.awt.Dimension(700, 730));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/snb.png"))); // NOI18N

        snbProduct1.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct1.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/body scrub.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel13.setText("Body Scrub  | $ 15 |");

        javax.swing.GroupLayout snbProduct1Layout = new javax.swing.GroupLayout(snbProduct1);
        snbProduct1.setLayout(snbProduct1Layout);
        snbProduct1Layout.setHorizontalGroup(
            snbProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(snbProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(snbBuy1))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        snbProduct1Layout.setVerticalGroup(
            snbProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        snbProduct2.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct2.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/body wash.jpg"))); // NOI18N
        jLabel15.setText("jLabel12");

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel16.setText("Body Wash  | $ 10 |");

        javax.swing.GroupLayout snbProduct2Layout = new javax.swing.GroupLayout(snbProduct2);
        snbProduct2.setLayout(snbProduct2Layout);
        snbProduct2Layout.setHorizontalGroup(
            snbProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(snbProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snbBuy2))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        snbProduct2Layout.setVerticalGroup(
            snbProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        snbProduct3.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct3.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/centella toner.jpg"))); // NOI18N
        jLabel17.setText("jLabel12");

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel18.setText("Centella Toner | $ 10 |");

        javax.swing.GroupLayout snbProduct3Layout = new javax.swing.GroupLayout(snbProduct3);
        snbProduct3.setLayout(snbProduct3Layout);
        snbProduct3Layout.setHorizontalGroup(
            snbProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snbBuy3))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        snbProduct3Layout.setVerticalGroup(
            snbProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        snbProduct4.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct4.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/vit c.jpg"))); // NOI18N
        jLabel19.setText("jLabel12");

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel20.setText("Vit C Serum | $ 20 |");

        javax.swing.GroupLayout snbProduct4Layout = new javax.swing.GroupLayout(snbProduct4);
        snbProduct4.setLayout(snbProduct4Layout);
        snbProduct4Layout.setHorizontalGroup(
            snbProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(snbProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snbBuy4))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        snbProduct4Layout.setVerticalGroup(
            snbProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        snbProduct5.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct5.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/charcoal mask.jpg"))); // NOI18N
        jLabel21.setText("jLabel12");

        jLabel22.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel22.setText("Charcoal Mask | $ 18 |");

        javax.swing.GroupLayout snbProduct5Layout = new javax.swing.GroupLayout(snbProduct5);
        snbProduct5.setLayout(snbProduct5Layout);
        snbProduct5Layout.setHorizontalGroup(
            snbProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(snbProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snbBuy5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        snbProduct5Layout.setVerticalGroup(
            snbProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        snbProduct6.setBackground(new java.awt.Color(196, 178, 159));
        snbProduct6.setPreferredSize(new java.awt.Dimension(200, 140));

        snbBuy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/body lotion.jpg"))); // NOI18N
        jLabel23.setText("jLabel12");

        jLabel24.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel24.setText("Body Lotion  | $ 12 |");

        javax.swing.GroupLayout snbProduct6Layout = new javax.swing.GroupLayout(snbProduct6);
        snbProduct6.setLayout(snbProduct6Layout);
        snbProduct6Layout.setHorizontalGroup(
            snbProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct6Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(snbProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snbProduct6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(snbBuy6))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        snbProduct6Layout.setVerticalGroup(
            snbProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbProduct6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(snbProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbBuy6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout snbproductLayout = new javax.swing.GroupLayout(snbproduct);
        snbproduct.setLayout(snbproductLayout);
        snbproductLayout.setHorizontalGroup(
            snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbproductLayout.createSequentialGroup()
                .addGroup(snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(snbproductLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(snbProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(snbProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(snbProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(snbproductLayout.createSequentialGroup()
                            .addComponent(snbProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(snbProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(snbProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        snbproductLayout.setVerticalGroup(
            snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snbproductLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(snbProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snbProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snbProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(snbproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snbProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snbProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snbProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        fashionproduct.setBackground(new java.awt.Color(255, 255, 255));
        fashionproduct.setPreferredSize(new java.awt.Dimension(700, 710));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fashion.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        fashionProduct1.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct1.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/long cardigan.jpg"))); // NOI18N
        jLabel14.setText("jLabel12");

        jLabel25.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel25.setText("Cardigan    | $ 20  |");

        javax.swing.GroupLayout fashionProduct1Layout = new javax.swing.GroupLayout(fashionProduct1);
        fashionProduct1.setLayout(fashionProduct1Layout);
        fashionProduct1Layout.setHorizontalGroup(
            fashionProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fashionBuy1))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct1Layout.setVerticalGroup(
            fashionProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        fashionProduct2.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct2.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/t-shirt.jpg"))); // NOI18N
        jLabel38.setText("jLabel12");

        jLabel39.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel39.setText("T-Shirt      | $ 25 |");

        javax.swing.GroupLayout fashionProduct2Layout = new javax.swing.GroupLayout(fashionProduct2);
        fashionProduct2.setLayout(fashionProduct2Layout);
        fashionProduct2Layout.setHorizontalGroup(
            fashionProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct2Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(fashionBuy2))
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct2Layout.setVerticalGroup(
            fashionProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        fashionProduct3.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct3.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/scarf.jpg"))); // NOI18N
        jLabel40.setText("jLabel12");

        jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel41.setText("Scarf         | $ 15 |");

        javax.swing.GroupLayout fashionProduct3Layout = new javax.swing.GroupLayout(fashionProduct3);
        fashionProduct3.setLayout(fashionProduct3Layout);
        fashionProduct3Layout.setHorizontalGroup(
            fashionProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fashionBuy3))
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct3Layout.setVerticalGroup(
            fashionProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        fashionProduct4.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct4.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/long pants.jpg"))); // NOI18N
        jLabel42.setText("jLabel12");

        jLabel43.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel43.setText("Long Pants  | $ 23 |");

        javax.swing.GroupLayout fashionProduct4Layout = new javax.swing.GroupLayout(fashionProduct4);
        fashionProduct4.setLayout(fashionProduct4Layout);
        fashionProduct4Layout.setHorizontalGroup(
            fashionProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct4Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(fashionBuy4))
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct4Layout.setVerticalGroup(
            fashionProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        fashionProduct5.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct5.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/hoodie.jpg"))); // NOI18N
        jLabel44.setText("jLabel12");

        jLabel45.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel45.setText("Hoodie      | $ 30 |");

        javax.swing.GroupLayout fashionProduct5Layout = new javax.swing.GroupLayout(fashionProduct5);
        fashionProduct5.setLayout(fashionProduct5Layout);
        fashionProduct5Layout.setHorizontalGroup(
            fashionProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct5Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct5Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(18, 18, 18)
                        .addComponent(fashionBuy5))
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct5Layout.setVerticalGroup(
            fashionProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        fashionProduct6.setBackground(new java.awt.Color(196, 178, 159));
        fashionProduct6.setPreferredSize(new java.awt.Dimension(200, 140));

        fashionBuy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/long skirt.jpg"))); // NOI18N
        jLabel46.setText("jLabel12");

        jLabel47.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel47.setText("Long Skirt   | $ 30 |");

        javax.swing.GroupLayout fashionProduct6Layout = new javax.swing.GroupLayout(fashionProduct6);
        fashionProduct6.setLayout(fashionProduct6Layout);
        fashionProduct6Layout.setHorizontalGroup(
            fashionProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct6Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(fashionProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionProduct6Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(fashionBuy6))
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fashionProduct6Layout.setVerticalGroup(
            fashionProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionProduct6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionBuy6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout fashionproductLayout = new javax.swing.GroupLayout(fashionproduct);
        fashionproduct.setLayout(fashionproductLayout);
        fashionproductLayout.setHorizontalGroup(
            fashionproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionproductLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fashionproductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fashionproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fashionproductLayout.createSequentialGroup()
                        .addComponent(fashionProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fashionProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fashionProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fashionproductLayout.createSequentialGroup()
                        .addComponent(fashionProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fashionProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fashionProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        fashionproductLayout.setVerticalGroup(
            fashionproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fashionproductLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fashionproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fashionProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fashionProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fashionProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fashionproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fashionProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fashionProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fashionProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        furnitureproduct.setBackground(new java.awt.Color(255, 255, 255));
        furnitureproduct.setPreferredSize(new java.awt.Dimension(700, 710));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/furniturepic.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        furnitureProduct1.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct1.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/bed frame.jpg"))); // NOI18N
        jLabel26.setText("jLabel12");

        jLabel27.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel27.setText("Bed Frame  | $ 210 |");

        javax.swing.GroupLayout furnitureProduct1Layout = new javax.swing.GroupLayout(furnitureProduct1);
        furnitureProduct1.setLayout(furnitureProduct1Layout);
        furnitureProduct1Layout.setHorizontalGroup(
            furnitureProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(furnitureBuy1))
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct1Layout.setVerticalGroup(
            furnitureProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureBuy1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        furnitureProduct2.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct2.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/wardrobe.jpg"))); // NOI18N
        jLabel28.setText("jLabel12");

        jLabel29.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel29.setText("Wardrobe  | $ 156 |");

        javax.swing.GroupLayout furnitureProduct2Layout = new javax.swing.GroupLayout(furnitureProduct2);
        furnitureProduct2.setLayout(furnitureProduct2Layout);
        furnitureProduct2Layout.setHorizontalGroup(
            furnitureProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureBuy2))
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct2Layout.setVerticalGroup(
            furnitureProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureBuy2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        furnitureProduct3.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct3.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/tv bench.jpg"))); // NOI18N
        jLabel30.setText("jLabel12");

        jLabel31.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel31.setText("TV Bench  | $ 95 |");

        javax.swing.GroupLayout furnitureProduct3Layout = new javax.swing.GroupLayout(furnitureProduct3);
        furnitureProduct3.setLayout(furnitureProduct3Layout);
        furnitureProduct3Layout.setHorizontalGroup(
            furnitureProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureBuy3))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct3Layout.setVerticalGroup(
            furnitureProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureBuy3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        furnitureProduct4.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct4.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/desk.jpg"))); // NOI18N
        jLabel36.setText("jLabel12");

        jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel37.setText("Desk          | $ 85 |");

        javax.swing.GroupLayout furnitureProduct4Layout = new javax.swing.GroupLayout(furnitureProduct4);
        furnitureProduct4.setLayout(furnitureProduct4Layout);
        furnitureProduct4Layout.setHorizontalGroup(
            furnitureProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(furnitureBuy4))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct4Layout.setVerticalGroup(
            furnitureProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureBuy4)
                    .addComponent(jLabel37))
                .addGap(16, 16, 16))
        );

        furnitureProduct5.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct5.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/6-drawer chest.jpg"))); // NOI18N
        jLabel34.setText("jLabel12");

        jLabel35.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel35.setText("Cabinet     | $ 90 |");

        javax.swing.GroupLayout furnitureProduct5Layout = new javax.swing.GroupLayout(furnitureProduct5);
        furnitureProduct5.setLayout(furnitureProduct5Layout);
        furnitureProduct5Layout.setHorizontalGroup(
            furnitureProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct5Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(furnitureBuy5))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct5Layout.setVerticalGroup(
            furnitureProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(furnitureBuy5)
                    .addComponent(jLabel35))
                .addGap(16, 16, 16))
        );

        furnitureProduct6.setBackground(new java.awt.Color(196, 178, 159));
        furnitureProduct6.setPreferredSize(new java.awt.Dimension(200, 140));

        furnitureBuy6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchase.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productpict/couch.jpg"))); // NOI18N
        jLabel32.setText("jLabel12");

        jLabel33.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel33.setText("Couch     | $ 120 |");

        javax.swing.GroupLayout furnitureProduct6Layout = new javax.swing.GroupLayout(furnitureProduct6);
        furnitureProduct6.setLayout(furnitureProduct6Layout);
        furnitureProduct6Layout.setHorizontalGroup(
            furnitureProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct6Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(furnitureProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureProduct6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureBuy6))
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        furnitureProduct6Layout.setVerticalGroup(
            furnitureProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureProduct6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureProduct6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureBuy6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout furnitureproductLayout = new javax.swing.GroupLayout(furnitureproduct);
        furnitureproduct.setLayout(furnitureproductLayout);
        furnitureproductLayout.setHorizontalGroup(
            furnitureproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureproductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, furnitureproductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(furnitureproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(furnitureproductLayout.createSequentialGroup()
                        .addComponent(furnitureProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(furnitureproductLayout.createSequentialGroup()
                        .addComponent(furnitureProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(furnitureProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        furnitureproductLayout.setVerticalGroup(
            furnitureproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(furnitureproductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(furnitureproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(furnitureProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnitureProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnitureProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(furnitureproductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(furnitureProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnitureProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(furnitureProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1402, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                        .addComponent(panelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35))))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(snbproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(696, Short.MAX_VALUE)))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(fashionproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(702, Short.MAX_VALUE)))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(furnitureproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(701, Short.MAX_VALUE)))
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(snbproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(productLayout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(fashionproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
            .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(furnitureproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout alasLayout = new javax.swing.GroupLayout(alas);
        alas.setLayout(alasLayout);
        alasLayout.setHorizontalGroup(
            alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alasLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1406, Short.MAX_VALUE))
            .addGroup(alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alasLayout.createSequentialGroup()
                    .addGap(0, 100, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 1406, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alasLayout.createSequentialGroup()
                    .addGap(0, 104, Short.MAX_VALUE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        alasLayout.setVerticalGroup(
            alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alasLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE))
            .addGroup(alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(alasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alas, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeClickMouseClicked
        // TODO add your handling code here:
        home.setVisible(true);
        product.setVisible(false);
        
        
    }//GEN-LAST:event_homeClickMouseClicked

    private void productClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClickMouseClicked
        // TODO add your handling code here:
        home.setVisible(false);
        product.setVisible(true);
        
    }//GEN-LAST:event_productClickMouseClicked

    private void furnitureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_furnitureMouseClicked
        // TODO add your handling code here:
        snbproduct.setVisible(false);
        fashionproduct.setVisible(false);
        furnitureproduct.setVisible(true);
        panelKanan.setVisible(true);
    }//GEN-LAST:event_furnitureMouseClicked

    private void fashionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fashionMouseClicked
        // TODO add your handling code here:
        snbproduct.setVisible(false);
        fashionproduct.setVisible(true);
        furnitureproduct.setVisible(false);
        panelKanan.setVisible(true);
    }//GEN-LAST:event_fashionMouseClicked

    private void snbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snbMouseClicked
        // TODO add your handling code here:
        snbproduct.setVisible(true);
        fashionproduct.setVisible(false);
        furnitureproduct.setVisible(false);
        panelKanan.setVisible(true);
    }//GEN-LAST:event_snbMouseClicked

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alas;
    private javax.swing.JLabel fashion;
    private javax.swing.JLabel fashionBuy1;
    private javax.swing.JLabel fashionBuy2;
    private javax.swing.JLabel fashionBuy3;
    private javax.swing.JLabel fashionBuy4;
    private javax.swing.JLabel fashionBuy5;
    private javax.swing.JLabel fashionBuy6;
    private javax.swing.JPanel fashionProduct1;
    private javax.swing.JPanel fashionProduct2;
    private javax.swing.JPanel fashionProduct3;
    private javax.swing.JPanel fashionProduct4;
    private javax.swing.JPanel fashionProduct5;
    private javax.swing.JPanel fashionProduct6;
    private javax.swing.JPanel fashionproduct;
    private javax.swing.JLabel furniture;
    private javax.swing.JLabel furnitureBuy1;
    private javax.swing.JLabel furnitureBuy2;
    private javax.swing.JLabel furnitureBuy3;
    private javax.swing.JLabel furnitureBuy4;
    private javax.swing.JLabel furnitureBuy5;
    private javax.swing.JLabel furnitureBuy6;
    private javax.swing.JPanel furnitureProduct1;
    private javax.swing.JPanel furnitureProduct2;
    private javax.swing.JPanel furnitureProduct3;
    private javax.swing.JPanel furnitureProduct4;
    private javax.swing.JPanel furnitureProduct5;
    private javax.swing.JPanel furnitureProduct6;
    private javax.swing.JPanel furnitureproduct;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeClick;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel product;
    private javax.swing.JLabel productClick;
    private javax.swing.JLabel snb;
    private javax.swing.JLabel snbBuy1;
    private javax.swing.JLabel snbBuy2;
    private javax.swing.JLabel snbBuy3;
    private javax.swing.JLabel snbBuy4;
    private javax.swing.JLabel snbBuy5;
    private javax.swing.JLabel snbBuy6;
    private javax.swing.JPanel snbProduct1;
    private javax.swing.JPanel snbProduct2;
    private javax.swing.JPanel snbProduct3;
    private javax.swing.JPanel snbProduct4;
    private javax.swing.JPanel snbProduct5;
    private javax.swing.JPanel snbProduct6;
    private javax.swing.JPanel snbproduct;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == snbBuy1 )
        {
            String name = "Body Scrub";
            int price = 15;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == snbBuy2 )
        {
            String name = "Body Wash";
            int price = 10;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        
        else if (e.getSource() == snbBuy3 )
        {
            String name = "Centella Toner";
            int price = 10;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == snbBuy4 )
        {
            String name = "Vit C Serum";
            int price = 20;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == snbBuy5 )
        {
            String name = "Charcoal Mask";
            int price = 18;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == snbBuy6 )
        {
            String name = "Body Lotion";
            int price = 12;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy1 )
        {
            String name = "Cardigan";
            int price = 20;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy2 )
        {
            String name = "T-Shirt";
            int price = 25;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy3 )
        {
            String name = "Scarf";
            int price = 15;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy4 )
        {
            String name = "Long Pants";
            int price = 23;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy5 )
        {
            String name = "Hoodie";
            int price = 30;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == fashionBuy6 )
        {
            String name = "Long Skirt";
            int price = 30;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == furnitureBuy1 )
        {
            String name = "Bed Frame";
            int price = 210;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == furnitureBuy2 )
        {
            String name = "Wardrobe";
            int price = 156;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
                else if (e.getSource() == furnitureBuy3 )
        {
            String name = "TV Bench";
            int price = 95;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
                else if (e.getSource() == furnitureBuy4 )
        {
            String name = "Desk";
            int price = 85;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
                else if (e.getSource() == furnitureBuy5 )
        {
            String name = "Cabinet";
            int price = 90;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
        else if (e.getSource() == furnitureBuy6 )
        {
            String name = "Couch";
            int price = 120;
            
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter how many pieces you’d like to purchase for this product."));
            int total = price * qty;
            
            model = (DefaultTableModel)jTable1.getModel();
            
            model.addRow(new Object[]
            {
                name,
                price,
                qty,
                total,
            });
            
            int sum = 0;
            
            for (int i = 0; i < jTable1.getRowCount(); i++)
            {
                sum = sum +Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            }
            
            txtsub.setText("$ " + Integer.toString(sum));
        }
                
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
