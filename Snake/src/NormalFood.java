
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
public class NormalFood extends Food{
    
    public NormalFood(Snake snake) {
        super(snake);
        ConfigSingleton.getInstance().setCountFoods(ConfigSingleton.getInstance().getCountFoods() + 1);
    }
    
    @Override
    public void draw(Graphics g, int squareWidth, int squareHeight) {
        Color food = new Color(255,71,26);
        Util.drawSquare(g, node, food, squareWidth, squareHeight);
    }  
}
