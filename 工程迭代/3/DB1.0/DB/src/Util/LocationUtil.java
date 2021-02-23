/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author yhy
 */
public class LocationUtil {
    /**
    * 获取屏幕大小
    * @return
    */
   private static Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
   /**
    * 设置指定组件最大化
    * @param comp
    */
  public static void setFullScreen(Component comp){
     comp.setSize(getScreenSize());
  }
  /**
   * 设置组件屏幕居中
   * @param comp
   */
  public static void setScreenCenter(Component comp){
    java.awt.Dimension Dcomp=comp.getSize();
    if(Dcomp.width>getScreenSize().width){
        Dcomp.width = getScreenSize().width;
    }
    if(Dcomp.height >getScreenSize().height){
        Dcomp.height = getScreenSize().height;
    }
      comp.setLocation((getScreenSize().width-Dcomp.width)/2,
                                          (getScreenSize().height-Dcomp.height)/4);
  }
  /**
   * 将窗体显示在父窗体中间位置
   * @param pcontainer
   * @param container
   */
  public static void setParentCenter (Container pcontainer,Container container ){
         java.awt.Dimension  Dpcontainer=pcontainer.getSize();
         java.awt.Dimension  Dcontainer=container.getSize();
         if(Dcontainer.height>Dpcontainer.height){
                Dcontainer.height=Dpcontainer.height;
         }
         if(Dcontainer.width>Dpcontainer.width){
                Dcontainer.width=Dpcontainer.width;
         }
        // container.setLocation((Dpcontainer.width-Dcontainer.width)/2,(Dpcontainer.height-Dcontainer.height)/2);
         container.setLocation((Dpcontainer.width-Dcontainer.width)/2,(Dpcontainer.height-Dcontainer.height)/4);
    }   
  
}
