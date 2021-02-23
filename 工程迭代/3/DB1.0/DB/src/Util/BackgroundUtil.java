/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author cong's pc
 */
public class BackgroundUtil extends JComponent{
        private static final long serialVersionUID = 1L;
    private Icon backImage;
  public BackgroundUtil() {
        this(null);
    }
  public BackgroundUtil(Icon b){
       setBackImage(b);
    }
    public Icon getBackImage() {
        return backImage;
    }

    public void setBackImage(Icon b) {
//        this.offImage=null;
        this.backImage = b;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
         if(backImage!=null){
           ImageIcon imageIcon=(ImageIcon) backImage;
           Image image=imageIcon.getImage();
           g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
         }
    }
}
