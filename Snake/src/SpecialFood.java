
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class SpecialFood {
    
    private int visibleTime;
    
    private Node node;
    
    public SpecialFood(Snake snake, int visibleTime) {
        this.visibleTime = visibleTime;
        node = new Node(getRandomRow(), getRandomCol());
    }
    
    public void draw(Graphics g, int squareWidth, int squareHeight) {
        Util.drawSquare(g, node, Color.yellow, squareWidth, squareHeight);
    }
    
    public int getRandomRow() { 
        return (int) (Math.random() * Board.NUM_ROWS);
    }
    
    public int getRandomCol() {
        return (int) (Math.random() * Board.NUM_COLS);
    }
    
    public int getRow() {
        return node.getRow();
    }
    
    public int getCol() {
        return node.getCol();
    }
    
}
