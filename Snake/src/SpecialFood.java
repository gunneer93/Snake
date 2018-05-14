
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class SpecialFood extends Food implements ActionListener {
    
    public Timer timer;
    private Board board;
    
    public SpecialFood(Snake snake, int visibleTime, Board board) {
        super(snake);
        this.board = board;
        timer = new Timer(visibleTime, this);
        timer.start();
        visibleTime = ConfigSingleton.getInstance().getSpecialVisibleTime();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        timer.stop();
        board.removeSpecialFood();
    }

    @Override
    public void draw(Graphics g, int squareWidth, int squareHeight) {
       Color food = new Color(255,255,26);
       Util.drawSquare(g, node, food, squareWidth, squareHeight);
    }
    
}
