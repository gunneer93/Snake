/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class Game extends javax.swing.JFrame {
    
    GameModeDialog gameModeDialog;
    CustomSettingsDialog customSettingsDialog;

    /**
     * Creates new form Game
     */
    public Game() {
        setLocationRelativeTo(null);
        initComponents();
        board.setLabelCountDown(countDown);
        board.setScoreBoard(scoreBoard);
        customSettingsDialog = new CustomSettingsDialog(this, true, board);
        gameModeDialog = new GameModeDialog(this, true, board, customSettingsDialog);
        StartGameDialog startGameDialog = new StartGameDialog(this, true, board, gameModeDialog);
        startGameDialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        scoreBoard = new ScoreBoard();
        board = new Board();
        countDown = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        setPreferredSize(new java.awt.Dimension(402, 376));

        scoreBoard.setText("scoreBoard");
        getContentPane().add(scoreBoard, java.awt.BorderLayout.PAGE_END);

        countDown.setFont(new java.awt.Font("Noto Mono", 1, 78)); // NOI18N
        countDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countDown.setText("0");

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countDown)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(countDown, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(board, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Board board;
    private javax.swing.JLabel countDown;
    private javax.swing.JMenuItem jMenuItem1;
    private ScoreBoard scoreBoard;
    // End of variables declaration//GEN-END:variables
}
