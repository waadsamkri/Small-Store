import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StoreWindow extends javax.swing.JFrame {
    int BnanaMilkNum,OreoNum,SweetNum,KindarGirleNum,KindarBoyNum,ChipsNum;
    double BnanaMilkPrice,ChipsPrice,KindarBoyPrice,KindarGirlePrice,OreoPrice,SweetPrice;
    final double BnanaMilk_coust=1.50,Oreo_cost=1.0,Sweet_coust=18.50,KindarGirle_coust=3.50,KindarBoy_cost=3.50,Chips_coust=2.25;
    double subtotl,vat,discount,total;
    int coustemarCounter;
    PrintWriter output;
   
    public StoreWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        StoreName = new javax.swing.JLabel();
        Prodacts = new javax.swing.JPanel();
        Oreo = new javax.swing.JLabel();
        KindarGirle = new javax.swing.JLabel();
        KindarBoy = new javax.swing.JLabel();
        BnanaMilk = new javax.swing.JLabel();
        Chips = new javax.swing.JLabel();
        Sweet = new javax.swing.JLabel();
        OreoCount = new javax.swing.JSpinner();
        KindarGirleCont = new javax.swing.JSpinner();
        KindarGirleLable = new javax.swing.JLabel();
        KindarBoyCount = new javax.swing.JSpinner();
        KindarBoyLable = new javax.swing.JLabel();
        BnanaMilkLable = new javax.swing.JLabel();
        ChipsLable = new javax.swing.JLabel();
        SweetCount = new javax.swing.JSpinner();
        SweetLable = new javax.swing.JLabel();
        BnanaMilkCount = new javax.swing.JSpinner();
        ChipsCount = new javax.swing.JSpinner();
        OreoLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SubTotal = new javax.swing.JLabel();
        Discount = new javax.swing.JLabel();
        Vat = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        coustemaeCounterLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CalculateButton = new javax.swing.JButton();
        NewBellButton = new javax.swing.JButton();
        SaveBellButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        StoreName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        StoreName.setText("** تموينات خالد الصغير **");

Prodacts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المنتجات ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        Oreo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Oreo.setText("اوريو الاورجينال  ");

        KindarGirle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        KindarGirle.setText("كندر بيضة بنات");

        KindarBoy.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        KindarBoy.setText("كندر بيضة اولاد ");

        BnanaMilk.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BnanaMilk.setText("الصافي حليب بالموز ");

        Chips.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Chips.setText("تسالي بالكاتشاب ");

        Sweet.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Sweet.setText("كيس حلويات منوعة ");

        OreoCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        OreoCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                OreoCountStateChanged(evt);
            }
        });

        KindarGirleCont.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        KindarGirleCont.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                KindarGirleContStateChanged(evt);
            }
        });

        KindarGirleLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        KindarGirleLable.setText("3.50 ريال");

        KindarBoyCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        KindarBoyCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                KindarBoyCountStateChanged(evt);
            }
        });
        KindarBoyLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        KindarBoyLable.setText("3.50 ريال");

        BnanaMilkLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BnanaMilkLable.setText("1.5 ريال");

        ChipsLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ChipsLable.setText("2.25 ريال");

        SweetCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        SweetCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SweetCountStateChanged(evt);
            }
        });

        SweetLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SweetLable.setText("18.50 ريال");

        BnanaMilkCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        BnanaMilkCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BnanaMilkCountStateChanged(evt);
            }
        });

        ChipsCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        ChipsCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ChipsCountStateChanged(evt);
            }
        });

        OreoLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OreoLable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OreoLable.setText("1.0 ريال");

        javax.swing.GroupLayout ProdactsLayout = new javax.swing.GroupLayout(Prodacts);
        Prodacts.setLayout(ProdactsLayout);
        ProdactsLayout.setHorizontalGroup(
            ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdactsLayout.createSequentialGroup()
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ProdactsLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(ChipsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ChipsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdactsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(SweetLable, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SweetCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ProdactsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BnanaMilkLable, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(BnanaMilkCount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BnanaMilk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Chips, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sweet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdactsLayout.createSequentialGroup()
                        .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KindarGirleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KindarBoyLable))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdactsLayout.createSequentialGroup()
                        .addComponent(OreoLable, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(KindarGirleCont, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(KindarBoyCount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OreoCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KindarBoy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Oreo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(KindarGirle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        ProdactsLayout.setVerticalGroup(
            ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdactsLayout.createSequentialGroup()
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdactsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BnanaMilkLable, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BnanaMilkCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Oreo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ProdactsLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(OreoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdactsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OreoLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BnanaMilk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Chips)
                        .addComponent(ChipsCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ChipsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KindarGirle, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KindarGirleCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(KindarGirleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ProdactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KindarBoy)
                    .addComponent(SweetCount)
                    .addComponent(KindarBoyCount)
                    .addComponent(Sweet)
                    .addComponent(KindarBoyLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SweetLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jLabel2.setText("Created by Waad ⚠ 0.1");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        SubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SubTotal.setText("المجموع: 0.0 ريال");

        Discount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Discount.setForeground(new java.awt.Color(255, 0, 0));
        Discount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Discount.setText("خصم 10% : 0.0 ريال");
        Discount.setDoubleBuffered(true);

        Vat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Vat.setText("ضريبة القيمة المضافة: 0.0 ريال");
        Vat.setDoubleBuffered(true);

        Total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Total.setText("المجموع الكلي: 0.0 ريال");

        coustemaeCounterLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coustemaeCounterLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        coustemaeCounterLabel.setText("رقم الفاتورة : 0 ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coustemaeCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vat, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coustemaeCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vat, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Discount)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الحساب", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        CalculateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CalculateButton.setText("حساب");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        NewBellButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NewBellButton.setText("فاتورة جديدة");
        NewBellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBellButtonActionPerformed(evt);
            }
        });

        SaveBellButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveBellButton.setText("حفظ الفاتورة");
        SaveBellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBellButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewBellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveBellButton, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveBellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewBellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitButton.setText("خروج ");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Prodacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(StoreName)
                                .addGap(148, 148, 148))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prodacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      subtotl= BnanaMilkPrice+ChipsPrice+KindarBoyPrice+KindarGirlePrice+OreoPrice+SweetPrice;
      SubTotal.setText("المجموع"+ subtotl+"   ريال");
      vat= subtotl*0.15;
      vat=vat*100;
      vat=(double)((int) vat);
      vat=vat/100;
      Vat.setText("ضريبة القيمة المضافة "+ vat+"   ريال");
      total=(vat+subtotl);
      total=total*100;
      total=(double)((int) total);
      total=total/100;
      Total.setText("المجموع الكلي"+ total+"   ريال");
      discount=(total -0.10);
      discount=discount*100;
      discount=(double)((int) discount);
      discount=discount/100;
      Discount.setText("خصم 10%"+ discount+"   ريال");
    }                                               

    private void NewBellButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
if (total!=0){
    OreoCount.setValue(0);
    KindarGirleCont.setValue(0);
    KindarBoyCount.setValue(0);
    BnanaMilkCount.setValue(0);
    ChipsCount.setValue(0);
    SweetCount.setValue(0);
    SubTotal.setText("المجموع: 0.0 ريال");
    Vat.setText("ضريبة القيمة المضافة: 0.0 ريال");
    Total.setText("المجموع الكلي: 0.0 ريال");
    Discount.setText("خصم 10% : 0.0 ريال");
    
    subtotl=0;
    vat=0;
    total=0;
    discount=0;
coustemarCounter++;
coustemaeCounterLabel.setText("رقم الفاتورة: "+ coustemarCounter);
} 
    }                                             

    private void SaveBellButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            if(total!=0){
            output=new PrintWriter("billNo."+ coustemarCounter+ ".txt");
            output.println("رقم الفاتورة:   "+coustemarCounter );
            output.println("****************" );
if (BnanaMilkNum!=0){
    output.println(BnanaMilkNum + "الصافي حليب بالموز ");
        }
if (OreoNum!=0){
    output.println(OreoNum + "اوريو الاورجينال ");
        }
if (SweetNum!=0){
    output.println(SweetNum + "كيس حلويات منوعة  ");
        }
if (KindarGirleNum!=0){
    output.println(KindarGirleNum + "كندر بيضة بنات ");
        }
if (KindarBoyNum!=0){
    output.println(KindarBoyNum + "كندر بيضة اولاد   ");
        }
if (ChipsNum!=0){
    output.println(ChipsNum + "تسالي بالكاتشاب    ");
        }
    output.println("****************" );
    output.println("المجموع: "+subtotl+"ريال" );
    output.println("ضريبة القيمة المضافة "+ vat+"   ريال");
    output.println("المجموع الكلي"+ total+"   ريال");
    output.println("خصم 10%"+ discount+"   ريال");
    
    output.println("****************" );
    output.println("شكرا لشراءكم" );
        }

        output.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(StoreWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                              

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       System.exit(0);
    }                                          

    private void OreoCountStateChanged(javax.swing.event.ChangeEvent evt) {                                       
    OreoNum= (Integer) OreoCount.getValue();
    OreoPrice= Oreo_cost*OreoNum;
    }                                      

    private void KindarGirleContStateChanged(javax.swing.event.ChangeEvent evt) {                                             
 KindarGirleNum= (Integer) KindarGirleCont.getValue();
 KindarGirlePrice= KindarGirle_coust*KindarGirleNum;    
    }                                            
    private void KindarBoyCountStateChanged(javax.swing.event.ChangeEvent evt) {                                            
  KindarBoyNum= (Integer) KindarBoyCount.getValue();
    KindarBoyPrice= KindarBoy_cost*KindarBoyNum;
    }                                           
    private void BnanaMilkCountStateChanged(javax.swing.event.ChangeEvent evt) {                                            
    BnanaMilkNum= (Integer) BnanaMilkCount.getValue();
    BnanaMilkPrice= BnanaMilk_coust*BnanaMilkNum;
    }                                           
    private void ChipsCountStateChanged(javax.swing.event.ChangeEvent evt) {                                        
    ChipsNum= (Integer) ChipsCount.getValue();
    ChipsPrice= Chips_coust*ChipsNum;
    }                                       

    private void SweetCountStateChanged(javax.swing.event.ChangeEvent evt) {                                        
    SweetNum= (Integer) SweetCount.getValue();
    SweetPrice= Sweet_coust*SweetNum;
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel BnanaMilk;
    private javax.swing.JSpinner BnanaMilkCount;
    private javax.swing.JLabel BnanaMilkLable;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JLabel Chips;
    private javax.swing.JSpinner ChipsCount;
    private javax.swing.JLabel ChipsLable;
    private javax.swing.JLabel Discount;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel KindarBoy;
    private javax.swing.JSpinner KindarBoyCount;
    private javax.swing.JLabel KindarBoyLable;
    private javax.swing.JLabel KindarGirle;
    private javax.swing.JSpinner KindarGirleCont;
    private javax.swing.JLabel KindarGirleLable;
    private javax.swing.JButton NewBellButton;
    private javax.swing.JLabel Oreo;
    private javax.swing.JSpinner OreoCount;
    private javax.swing.JLabel OreoLable;
    private javax.swing.JPanel Prodacts;
    private javax.swing.JButton SaveBellButton;
    private javax.swing.JLabel StoreName;
    private javax.swing.JLabel SubTotal;
    private javax.swing.JLabel Sweet;
    private javax.swing.JSpinner SweetCount;
    private javax.swing.JLabel SweetLable;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Vat;
    private javax.swing.JLabel coustemaeCounterLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
}

