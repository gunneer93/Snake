
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
        direction = DirectionType.RIGHT;
        listNodes = new ArrayList<Node>(3);
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2));
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 - 1));
        listNodes.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 - 2));
    }

    public void draw(Graphics g, int squareWidth, int squareHeight) {
        for (Node n : listNodes) {
            Util.drawSquare(g, n, Color.blue, squareWidth, squareHeight);
        }
    }

    public void move(boolean eat) {
        Node head = listNodes.get(0);
        switch (direction) {
            case UP:
                if (direction != DirectionType.DOWN) {
                    listNodes.add(0, new Node(head.getRow() - 1, head.getCol()));
                }
                break;
            case DOWN:
                listNodes.add(0, new Node(head.getRow() + 1, head.getCol()));
                break;
            case RIGHT:
                listNodes.add(0, new Node(head.getRow(), head.getCol() + 1));
                break;
            case LEFT:
                listNodes.add(0, new Node(head.getRow(), head.getCol() - 1));
                break;
        }
        if (!eat) {
            listNodes.remove(listNodes.size() - 1);
        }
        
    }

    public boolean hitWall() {
        Node head = listNodes.get(0);
        if (head.getRow() < 0 || head.getRow() >= Board.NUM_ROWS) {
            return true;
        } else {
            if (head.getCol() < 0 || head.getCol() >= Board.NUM_COLS) {
                return true;
            }
        }
        return false;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public ArrayList<Node> getListNodes() {
        return listNodes;
    }

}
