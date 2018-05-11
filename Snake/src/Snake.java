
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

    public ArrayList<Node> listNodes;
    private DirectionType direction;
    private int countGrowSnake;

    public Snake() {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        countGrowSnake = 0;
        direction = DirectionType.RIGHT;
        listNodes = new ArrayList<Node>(3);
        listNodes.add(new Node(cs.getNumRows() / 2, cs.getNumCols() / 2));
        listNodes.add(new Node(cs.getNumRows() / 2, cs.getNumCols() / 2 - 1));
        listNodes.add(new Node(cs.getNumRows() / 2, cs.getNumCols() / 2 - 2));
    }

    public void setCountGrowSnake(int countGrowSnake) {
        this.countGrowSnake = countGrowSnake;
    }

    public void draw(Graphics g, int squareWidth, int squareHeight) {
        Color snake = new Color(255,204,0);
        for (Node n : listNodes) {
            Util.drawSquare(g, n, snake, squareWidth, squareHeight);
        }
    }

    public void move() {
        Node head = listNodes.get(0);
        switch (direction) {
            case UP:
                listNodes.add(0, new Node(head.getRow() - 1, head.getCol()));
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
        if (countGrowSnake == 0) {
            listNodes.remove(listNodes.size() - 1);
        } else {
            countGrowSnake--;
        }
        
    }
    
    public Node getNextNode() {
        Node head = listNodes.get(0);
        Node nextNode = null;
        switch (direction) {
            case UP:
                nextNode = new Node(head.getRow() - 1, head.getCol());
                break;
            case DOWN:
                nextNode = new Node(head.getRow() + 1, head.getCol());
                break;
            case RIGHT:
                nextNode = new Node(head.getRow(), head.getCol() + 1);
                break;
            case LEFT:
                nextNode = new Node(head.getRow(), head.getCol() - 1);
                break;
        }
        return nextNode;
    }

    public boolean hitWall() {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        if (getNextNode().getRow() < 0 || getNextNode().getRow() >= cs.getNumRows()) {
            return true;
        } else {
            if (getNextNode().getCol() < 0 || getNextNode().getCol() >= cs.getNumCols()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hitSnake() {
        for(int i = 1; i < listNodes.size(); i++) {
            if(listNodes.get(i).getRow() == getNextNode().getRow() && listNodes.get(i).getCol() == getNextNode().getCol()) {
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
