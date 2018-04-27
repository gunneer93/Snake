
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
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
    private PauseDialog pauseDialog;
    private GameOverDialog gameOverDialog;
    
    
    public Board() {
        initValues();
        timer = new Timer(deltaTime, this);
        keyAdapter = new MyKeyAdapter();
    }
    
    public void initValues() {
        requestFocusInWindow();
        deltaTime = 400; 
    }
    
    public void initGame() {
        removeKeyListener(keyAdapter);
        addKeyListener(keyAdapter);
        initValues();
        snake = new Snake();
        food = new Food(snake);
        timer.start();
    }
    
    public void processGameOver() {
        timer.stop();
        //String sb = "" + scoreBoard.getScore();
        //scoreBoard.setText("GAMEOVER!" + " Your score was: " + sb);
        removeKeyListener(keyAdapter);
        gameOverDialog = new GameOverDialog((JFrame) getParent().getParent().getParent().getParent(), true, this);
        gameOverDialog.setLocationRelativeTo(this);
        gameOverDialog.getContentPane().setBackground(Color.white);
        gameOverDialog.setVisible(true);
    }
    
    public boolean eat() {
        Node head = snake.getListNodes().get(0);
        if(head.getRow() == food.getRow()  && head.getCol() == food.getCol()) {
            return true;
        }
        return false;
    }
    
    //Game Loop
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!snake.hitWall()) {
            
            if(eat()) {
                snake.move(true);
            } else {
                snake.move(false);
            }
            repaint();
            Toolkit.getDefaultToolkit().sync();
        } else {
            processGameOver();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if( snake != null) {
            snake.draw(g, squareWidth(), squareHeight());
        }
        if( food != null) {
            food.draw(g, squareWidth(), squareHeight());
        }
        Util.drawBorder(g, Color.RED, squareWidth(), squareHeight());
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
                        if(snake.getDirection()!= DirectionType.RIGHT) {
                            snake.setDirection(DirectionType.LEFT);
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(snake.getDirection() != DirectionType.LEFT) {
                            snake.setDirection(DirectionType.RIGHT);
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(snake.getDirection() != DirectionType.DOWN) {
                            snake.setDirection(DirectionType.UP);
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if(snake.getDirection() != DirectionType.UP) {
                            snake.setDirection(DirectionType.DOWN);
                        }
                        break;
                    case KeyEvent.VK_P:
                         pauseDialog = new PauseDialog((JFrame) getParent().getParent().getParent().getParent(), true, Board.this);
                        if(!timer.isRunning()) {
                            timer.start();
                            pauseDialog.setVisible(false);
                        } else {
                            timer.stop();
                            pauseDialog.setLocationRelativeTo(Board.this);
                            pauseDialog.setVisible(true);
                        } 
                    default:
                        break;
                }
            repaint();
        }
    }
    
    
}
