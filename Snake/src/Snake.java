
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class Snake {
    
    private ArrayList<Node> listNodes;
    private DirectionType direction;
    
    public Snake() {
        direction = DirectionType.Right;
        listNodes = new ArrayList<Node>(3);
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2));
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 -1));
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 -2));
    }

    public void draw(Graphics g, int squareWidth, int squareHeight) {
        for(Node n : listNodes) {
            Util.drawSquare(g, n, Color.green, squareWidth, squareHeight);
        }
    }
    
    public void move() {
        switch(direction) {
            case UP:
                listNodes.add()
                break;
            case DOWN:
                
                break;
            case RIGTH:
                
                break;
            case LEFT:
                
                break;
        }
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }
    
}
