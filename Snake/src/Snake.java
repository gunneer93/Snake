
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
    
    private ArrayList listNodes;
    private DirectionType direction;
    
    public Snake() {
        direction = DirectionType.Right;
        listNodes = new ArrayList<Node>();
    }

    public void draw(Graphics g, Node node) {
        
    }
    
}
