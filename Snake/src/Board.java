
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
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
public class Board extends JPanel implements ActionListener{
    
    public static final int NUM_ROWS = 30;
    public static final int NUM_COLS = 30;
    
    private int deltaTime;
    private Timer timer;
    private Node[][] matrix;
    private Snake snake;
    private Food food;
    private Node node;
    
    
    public Board() {
        initValues();
        timer = new Timer(deltaTime, this);
    }
    
    public void initValues() {
        setFocusable(true);
        deltaTime = 500;
        
    }
    
    public void initGame() {
        initValues();
        timer.start();
    }
    
    //Game Loop
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.draw(g, node);
        food.draw(g, node);
    }
    
    private int squareWidth() {
        return getWidth() / NUM_COLS;
    }
    
    private int squareHeight() {
        return getHeight() / NUM_ROWS;
    }
    
    
}
