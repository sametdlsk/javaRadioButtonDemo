package helloCoffeeDemo;

public class helloCoffeeFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Creates new form helloCoffeeFrame 
    public helloCoffeeFrame() {
        initComponents();
    }

                     
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        milSof = new javax.swing.JRadioButton();
        milHar = new javax.swing.JRadioButton();
        milBas = new javax.swing.JRadioButton();
        milHon = new javax.swing.JRadioButton();
        milNo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cofEsp = new javax.swing.JRadioButton();
        cofAme = new javax.swing.JRadioButton();
        cofLat = new javax.swing.JRadioButton();
        cofMoc = new javax.swing.JRadioButton();
        cofMar = new javax.swing.JRadioButton();
        cofFil = new javax.swing.JRadioButton();
        cofSol = new javax.swing.JRadioButton();
        cofMac = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cofCol = new javax.swing.JRadioButton();
        cofHot = new javax.swing.JRadioButton();
        executeTotalbutton = new javax.swing.JButton();
        clearSelection = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.cyan);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Süt Seçimi"));

        buttonGroup1.add(milSof);
        milSof.setText("Yumuşak İçim İnek Sütü 1,25 ₺");
        milSof.setToolTipText("");

        buttonGroup1.add(milHar);
        milHar.setText("Yoğun İçim İnek Sütü 1,50 ₺");

        buttonGroup1.add(milBas);
        milBas.setText("Basic Süt 0,50 ₺");

        buttonGroup1.add(milHon);
        milHon.setText("Ballı Süt 2,25 ₺");

        buttonGroup1.add(milNo);
        milNo.setText("Sütsüz -- ₺");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milHon)
                            .addComponent(milBas)
                            .addComponent(milHar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(milSof)
                            .addComponent(milNo))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(milSof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milHar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milBas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milHon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milNo)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kahve Seçimi"));

        buttonGroup2.add(cofEsp);
        cofEsp.setText("Espresso 4,00 ₺");

        buttonGroup2.add(cofAme);
        cofAme.setText("Americano 3,25 ₺");

        buttonGroup2.add(cofLat);
        cofLat.setText("Latte 3,00 ₺");

        buttonGroup2.add(cofMoc);
        cofMoc.setText("Mocha 2,75 ₺");

        buttonGroup2.add(cofMar);
        cofMar.setText("Marocchino 5,25 ₺");

        buttonGroup2.add(cofFil);
        cofFil.setText("Filtre Kahve 1,75 ₺");

        buttonGroup2.add(cofSol);
        cofSol.setText("Soluble Coffee 1,50 ₺");

        buttonGroup2.add(cofMac);
        cofMac.setText("Macchiato 2,50 ₺");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cofFil)
                    .addComponent(cofMar)
                    .addComponent(cofMoc)
                    .addComponent(cofLat)
                    .addComponent(cofEsp)
                    .addComponent(cofAme)
                    .addComponent(cofSol)
                    .addComponent(cofMac))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cofEsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofAme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofLat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofMoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofMar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofFil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cofSol)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("İçim Tercihi"));

        buttonGroup3.add(cofCol);
        cofCol.setText("Soğuk 0,50 ₺");

        buttonGroup3.add(cofHot);
        cofHot.setText("Sıcak 1,50 ₺");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cofHot)
                    .addComponent(cofCol))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cofCol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cofHot)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        executeTotalbutton.setText("Total");
        executeTotalbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeTotalbuttonActionPerformed(evt);
            }
        });

        clearSelection.setText("Seçimleri Temizle");
        clearSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSelectionActionPerformed(evt);
            }
        });

        exitButton.setText("Çık");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        totalLabel.setText("Total");

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel18.setText("HelloCoffeeDemo - Radio Button Demo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(executeTotalbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearSelection)
                            .addComponent(executeTotalbutton)
                            .addComponent(exitButton)
                            .addComponent(totalLabel)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void executeTotalbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // total button func (total butonu fonksiyonu):

        double total = 0;           // we will use a decimal number, so we use the "dobule" data type
                                    // ondalıklı sayılar kullanacağımız için "double veri tipini kullandık
        if (milSof.isSelected()) {
            total = total + 1.25;
        }

        if (milHar.isSelected()) {
            total = total + 1.50;
        }

        if (milBas.isSelected()) {
            total = total + 0.50;
        }

        if (milHon.isSelected()) {
            total = total + 2.25;
        }

        if (milNo.isSelected()) {
            total = total + 0;
        }

        if (cofEsp.isSelected()) {
            total = total + 4.00;
        }

        if (cofAme.isSelected()) {
            total = total + 3.25;
        }

        if (cofLat.isSelected()) {
            total = total + 3.00;
        }

        if (cofMac.isSelected()) {
            total = total + 2.50;
        }

        if (cofMoc.isSelected()) {
            total = total + 2.75;
        }

        if (cofMar.isSelected()) {
            total = total + 5.25;
        }

        if (cofFil.isSelected()) {
            total = total + 1.75;
        }

        if (cofSol.isSelected()) {
            total = total + 1.50;
        }

        if (cofCol.isSelected()) {
            total = total + .5;
        }

        if (cofHot.isSelected()) {
            total = total + 1.50;
        }

        txtTotal.setText(Double.toString(total));    //Total textpane //Total sonuç kısmına yazdırdığımız kısım


    }                                                  

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // exit button here(çıkış butonu):
        System.exit(0);
    }                                          

    private void clearSelectionActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // clear button func(temizle butonu):
        buttonGroup1.clearSelection();							//radio buttons selection cleaner func
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        
        if(clearSelection.getModel().isArmed())                 //seçimleri temizleme butonu için total kısmını temizler
        	txtTotal.setText(null);								//total line cleaner func

    }                                              

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new helloCoffeeFrame().setVisible(true);
        });
    }

    // değişken tanımları // variables decs                   
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton clearSelection;
    private javax.swing.JRadioButton cofAme;
    private javax.swing.JRadioButton cofCol;
    private javax.swing.JRadioButton cofEsp;
    private javax.swing.JRadioButton cofFil;
    private javax.swing.JRadioButton cofHot;
    private javax.swing.JRadioButton cofLat;
    private javax.swing.JRadioButton cofMac;
    private javax.swing.JRadioButton cofMar;
    private javax.swing.JRadioButton cofMoc;
    private javax.swing.JRadioButton cofSol;
    private javax.swing.JButton executeTotalbutton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton milBas;
    private javax.swing.JRadioButton milHar;
    private javax.swing.JRadioButton milHon;
    private javax.swing.JRadioButton milNo;
    private javax.swing.JRadioButton milSof;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField txtTotal;
                       
}
