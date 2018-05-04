
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
public class Util {
    
    public static void drawSquare(Graphics g, Node node, Color color, int squareWidth, int squareHeight) {
        int x = node.getCol() * squareWidth;
        int y = node.getRow() * squareHeight;
        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth - 2, squareHeight - 2);
        g.setColor(color.black);
        g.drawLine(x, y + squareHeight - 1, x, y);
        g.drawLine(x, y, x + squareWidth - 1, y);
        g.setColor(color.black);
        g.drawLine(x + 1, y + squareHeight - 1, x + squareWidth - 1, y + squareHeight - 1);
        g.drawLine(x + squareWidth - 1, y + squareHeight - 1, x + squareWidth - 1, y + 1);
    }
    
    public static void drawBorder(Graphics g, Color color, int squareWidth, int squareHeight) {
        g.setColor(Color.black);
        g.drawRect(0, 0, Board.NUM_COLS * squareWidth, Board.NUM_ROWS * squareHeight);
    }
    
}
