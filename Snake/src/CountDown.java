
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alu20491147x
 */
public class CountDown {

    JLabel label;
    Board board;

    /**
     * Creates new form CountDownDialog
     */
    public CountDown(JLabel label, Board board) {
        this.label = label;
        this.board = board;
    }

    public void timerDisplay() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int counter = 3;
                label.setVisible(true);
                for (int i = counter; i > 0; i--) {
                    label.setText("" + i);
                    delayer(1000); 
                }
                label.setText("GO!");
                delayer(1000);
                label.setVisible(false);
                board.initGame();
            }
        });
        t.start();
    }

    public void delayer(long milliseconds) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {

        }
    }
}
