
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class ScoreBoard extends JLabel{
    
    public ScoreBoard() {
        super();
        ConfigSingleton.getInstance().setScore(3);
    }
    
    public void increment(int points) {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        int score = cs.getScore();
        score += points;
        cs.setScore(score);
        setText("Length:" + cs.getScore());
    }
    
    public void reset() {
        ConfigSingleton cs = ConfigSingleton.getInstance();
        cs.setScore(0);
        setText("Length:" + cs.getScore());
    }  
}
