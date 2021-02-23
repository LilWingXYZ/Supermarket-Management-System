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

    public class colorTableRender extends DefaultTableCellRenderer {
 
        public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,int column) {
            Component cell = super.getTableCellRendererComponent(table, value,isSelected, hasFocus, row, column);
            float count = (float) value;
            if (count <1000.0){
                cell.setBackground(Color.RED);
            }else if(count < 5000.0){
                cell.setBackground(Color.BLUE);
            }else{
                cell.setBackground(Color.GREEN);
            }
            return cell;
        }
    }

