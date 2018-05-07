
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    public Timer timer;
    private int countFoods;
    private JFrame parentFrame;
    private Snake snake;
    private Food food;
    private SpecialFood specialFood;
    private Node node;
    private MyKeyAdapter keyAdapter;
    private ScoreBoard scoreBoard;
    private PauseDialog pauseDialog;
    private GameOverDialog gameOverDialog;
    private JLabel labelCountDown;
    
    
    public Board() {
        initValues();
        keyAdapter = new MyKeyAdapter();
    }
    
    public void setLabelCountDown(JLabel labelCountDown) {
        this.labelCountDown = labelCountDown;
    }
    
    public void initValues() {
        requestFocusInWindow();
    }
    
    public void initGame() {
        removeKeyListener(keyAdapter);
        addKeyListener(keyAdapter);
        initValues();
        
        if (timer != null) {
            timer.stop();
        }
        timer = new Timer(deltaTime, this);
        scoreBoard.reset();
        snake = new Snake();
        food = new Food(snake);
        timer.start();
    }
    
    public void initCounter() {
        CountDown cd = new CountDown(labelCountDown, this);
        cd.timerDisplay();
    }
    
    public void cleanBoard() {
        snake = null;
        food = null;
        scoreBoard.reset();
    }
    
    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }
    
    public void processGameOver() {
        timer.stop();
        String sb = "" + scoreBoard.getScore();
        scoreBoard.setText("GAMEOVER!" + " Your score was: " + sb);
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
    
    public boolean eatSpecial() {
        if(specialFood != null) {
           Node head = snake.getListNodes().get(0);
            if(head.getRow() == specialFood.getRow() && head.getCol() == specialFood.getCol()) {
                return true;
            } 
        }

        return false;
    }
    
    public void removeSpecialFood() {
        specialFood.timer.stop();
        specialFood = null;
    }
    
    //Game Loop
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!snake.hitWall() && !snake.hitSnake()) {
            if(eatSpecial()) {
                scoreBoard.increment(3);
                snake.setCountGrowSnake(3);
                removeSpecialFood();
            }
            if(eat()) {
                snake.setCountGrowSnake(1);
                countFoods++;
                scoreBoard.increment(1);
                snake.move();
                food = new Food(snake);
                if(countFoods == 5) {
                    if(specialFood == null) {
                        specialFood = new SpecialFood(snake, 10000, this);
                        
                    }
                    countFoods = 0;
                }
            } else {
                snake.move();
            }
            repaint();
            Toolkit.getDefaultToolkit().sync();
        } else {
            processGameOver();
        }
    }

    public void setDeltaTime(int deltaTime) {
        this.deltaTime = deltaTime;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        if( food != null) {
            food.draw(g, squareWidth(), squareHeight());
        }
        if( specialFood != null) {
            specialFood.draw(g, squareWidth(), squareHeight());
        }
        if( snake != null) {
            snake.draw(g, squareWidth(), squareHeight());
        }
        Util.drawBorder(g, Color.blue, squareWidth(), squareHeight());
    }
    
    private int squareWidth() {
        return getWidth() / NUM_COLS;
    }
    
    private int squareHeight() {
        return getHeight() / NUM_ROWS;
    }
    
    public void drawBackground(Graphics g) {
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().
        getResource("snake-background.png"));
        g.drawImage(imagenFondo.getImage(), 0, 0,
        tamanio.width, tamanio.height, null);
        setOpaque(false); 
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
