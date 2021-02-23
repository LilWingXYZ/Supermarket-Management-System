/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *产生内部窗体，并保证唯一性
 * @author dell
 */
public class FrameUtil {
    //创建一个容纳内部窗体的集合
    public static HashMap<String,JInternalFrame> framemap = new HashMap<String,JInternalFrame>();
    //产生内部窗体的思路：当点击菜单，首先在集合中查找是否已经存在对象（判断键值是否存在），
    //如果已经存在就从集合中获取对象，如果不存在生成新的对象
    //并存入集合(键值为类名称)
    public static JInternalFrame buildFrame(Class clazz){
         JInternalFrame frame = null;
        if(framemap.containsKey(clazz.getName())){
            frame = framemap.get(clazz.getName());
        }else{
             try {
                 //集合中不存在键，说明之前没有创建过
                 frame = (JInternalFrame)clazz.newInstance();
                 //存入集合
                 framemap.put(clazz.getName(), frame);
             } catch (Exception ex) {
                ex.printStackTrace();
             }
        }
        return frame;
    }
}
