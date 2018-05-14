/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class CustomSettingsDialog extends javax.swing.JDialog {
    
    Board board;

    /**
     * Creates new form CustomSettingsDialog
     */
    public CustomSettingsDialog(java.awt.Frame parent, boolean modal, Board board) {
        super(parent, modal);
        setLocationRelativeTo(null);
        this.board = board;
        initComponents();
    }
    
    public void getValues() {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        cs.setDeltaTime(Integer.parseInt(deltaTimeTextField.getText()));
        cs.setNumRows(Integer.parseInt(rowsTextField.getText()));
        cs.setNumCols(Integer.parseInt(colsTextField.getText()));
        cs.setSpecialVisibleTime(Integer.parseInt(visibleTimeTextField.getText()));
        cs.setFoods(Integer.parseInt(foodsTextField.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanelBackGround1 = new ImagePanelBackGround();
        numRowsLabel = new javax.swing.JLabel();
        numColsLabel = new javax.swing.JLabel();
        deltaTimeLabel = new javax.swing.JLabel();
        rowsTextField = new javax.swing.JTextField();
        colsTextField = new javax.swing.JTextField();
        deltaTimeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        visibleTimeLabel = new javax.swing.JLabel();
        visibleTimeTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        foodCounterjLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        foodsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        numRowsLabel.setFont(new java.awt.Font("Noto Mono", 1, 12)); // NOI18N
        numRowsLabel.setText("Number of Rows :");

        numColsLabel.setFont(new java.awt.Font("Noto Mono", 1, 12)); // NOI18N
        numColsLabel.setText("Number of Columns :");

        deltaTimeLabel.setFont(new java.awt.Font("Noto Mono", 1, 12)); // NOI18N
        deltaTimeLabel.setText("Speed :");

        rowsTextField.setText("30");

        colsTextField.setText("30");

        deltaTimeTextField.setText("200");

        jLabel1.setFont(new java.awt.Font("Noto Mono", 1, 10)); // NOI18N
        jLabel1.setText("(Default: 30)");

        jLabel2.setFont(new java.awt.Font("Noto Mono", 1, 10)); // NOI18N
        jLabel2.setText("(Default: 30)");

        jLabel3.setFont(new java.awt.Font("Noto Mono", 1, 10)); // NOI18N
        jLabel3.setText("(Less is more speed)");

        confirmButton.setBackground(new java.awt.Color(255, 204, 0));
        confirmButton.setFont(new java.awt.Font("Noto Mono", 1, 14)); // NOI18N
        confirmButton.setText("CONFIRM AND START");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        visibleTimeLabel.setFont(new java.awt.Font("Noto Mono", 1, 12)); // NOI18N
        visibleTimeLabel.setText("Special Food Visible Time:");

        visibleTimeTextField.setText("10");

        jLabel4.setFont(new java.awt.Font("Noto Mono", 1, 10)); // NOI18N
        jLabel4.setText("(Default: 10 seconds)");

        foodCounterjLabel.setFont(new java.awt.Font("Noto Mono", 1, 12)); // NOI18N
        foodCounterjLabel.setText("Food Counter:");

        jLabel6.setFont(new java.awt.Font("Noto Mono", 1, 10)); // NOI18N
        jLabel6.setText("(Default: 5)");

        foodsTextField.setText("5");

        javax.swing.GroupLayout imagePanelBackGround1Layout = new javax.swing.GroupLayout(imagePanelBackGround1);
        imagePanelBackGround1.setLayout(imagePanelBackGround1Layout);
        imagePanelBackGround1Layout.setHorizontalGroup(
            imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelBackGround1Layout.createSequentialGroup()
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanelBackGround1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(confirmButton)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelBackGround1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(visibleTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(imagePanelBackGround1Layout.createSequentialGroup()
                                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelBackGround1Layout.createSequentialGroup()
                                        .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(deltaTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(numColsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(numRowsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelBackGround1Layout.createSequentialGroup()
                                        .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(visibleTimeLabel)
                                            .addComponent(foodCounterjLabel))
                                        .addGap(33, 33, 33)))
                                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(colsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rowsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(deltaTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(foodsTextField))))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(imagePanelBackGround1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelBackGround1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(147, 147, 147))
        );
        imagePanelBackGround1Layout.setVerticalGroup(
            imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelBackGround1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numRowsLabel)
                    .addComponent(rowsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numColsLabel)
                    .addComponent(colsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deltaTimeLabel)
                    .addComponent(deltaTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visibleTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visibleTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagePanelBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodCounterjLabel)
                    .addComponent(foodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addContainerGap())
        );

        getContentPane().add(imagePanelBackGround1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        getValues();
        dispose();
        board.initCounter();
    }//GEN-LAST:event_confirmButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colsTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel deltaTimeLabel;
    private javax.swing.JTextField deltaTimeTextField;
    private javax.swing.JLabel foodCounterjLabel;
    private javax.swing.JTextField foodsTextField;
    private ImagePanelBackGround imagePanelBackGround1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel numColsLabel;
    private javax.swing.JLabel numRowsLabel;
    private javax.swing.JTextField rowsTextField;
    private javax.swing.JLabel visibleTimeLabel;
    private javax.swing.JTextField visibleTimeTextField;
    // End of variables declaration//GEN-END:variables
}
