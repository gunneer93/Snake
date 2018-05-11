
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alu20491147x
 */
public class ImagePanelBackGround extends JPanel{
    
    public ImagePanelBackGround(){
        super();
    }
    
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      Dimension dimension = getSize();
      ImageIcon imagenFondo = new ImageIcon(getClass().
      getResource("snake-background.png"));
      g.drawImage(imagenFondo.getImage(), 0, 0,
      dimension.width, dimension.height, null);
      setOpaque(false); 
    }
}
