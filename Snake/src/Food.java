
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
public abstract class Food {
    
    protected Node node;
    
    public Food(Snake snake) {
        node = new Node(getRandomRow(), getRandomCol());
        while(checkSnakePosition(snake)) {
            node = new Node(getRandomRow(), getRandomCol());
        }
        
    }
    
    public abstract void draw(Graphics g, int squareWidth, int squareHeight);
    
    public int getRandomRow() { 
        return (int) (Math.random() * ConfigSingleton.getInstance().getNumRows());
    }
    
    public int getRandomCol() {
        return (int) (Math.random() * ConfigSingleton.getInstance().getNumCols());
    }
    
    public int getRow() {
        return node.getRow();
    }
    
    public int getCol() {
        return node.getCol();
    }
    
    public boolean checkSnakePosition(Snake snake) {
        for(Node n: snake.listNodes) {
            if(n.getRow() == node.getRow() && n.getCol() == node.getCol()) {
                return true;
            }
        }
        return false;
    }
}
