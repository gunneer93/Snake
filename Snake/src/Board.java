
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
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
    private Snake snake;
    private Food food;
    private Node node;
    private MyKeyAdapter keyAdapter;
    
    
    public Board() {
        initValues();
        timer = new Timer(deltaTime, this);
    }
    
    public void initValues() {
        setFocusable(true);
        deltaTime = 500;
        snake = new Snake();
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
        if( snake != null) {
            snake.draw(g, squareWidth(), squareHeight());
        }
        //food.draw(g, node);
    }
    
    private int squareWidth() {
        return getWidth() / NUM_COLS;
    }
    
    private int squareHeight() {
        return getHeight() / NUM_ROWS;
    }
    
    class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        snake.move()
                        break;
                    case KeyEvent.VK_RIGHT:
                        
                        break;
                    case KeyEvent.VK_UP:
                        
                        break;
                    case KeyEvent.VK_DOWN:
                        
                        break;
                    case KeyEvent.VK_P:
                         
                    default:
                        break;
                }
            repaint();
        }
    }
    
    
}
