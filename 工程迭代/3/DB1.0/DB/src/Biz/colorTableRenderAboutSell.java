/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biz;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Administrator
 */

    public class colorTableRenderAboutSell extends DefaultTableCellRenderer {
 
        public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,int column) {
            Component cell = super.getTableCellRendererComponent(table, value,isSelected, hasFocus, row, column);
            Integer count = (Integer) value;
            if (count <50){
                cell.setBackground(Color.GRAY);
            }else if(count < 100){
                cell.setBackground(Color.CYAN);
            }else if(count < 300) {
            	cell.setBackground(Color.GREEN);
            }
            else{
                cell.setBackground(Color.YELLOW);
            }
            return cell;
        }
    }

