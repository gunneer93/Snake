/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class FoodFactory {
    
    Snake snake;
    Board board;
    
    public FoodFactory(Snake snake, Board board) {
        this.board = board;
        this.snake = snake;
    }
    
    public Food getFood() {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        if(cs.getCountFoods() == cs.getFoods()) {
            cs.setCountFoods(0);
            return new SpecialFood(snake, cs.getSpecialVisibleTime(), board);
        } else {
            return new NormalFood(snake);
        }        
    }
}
