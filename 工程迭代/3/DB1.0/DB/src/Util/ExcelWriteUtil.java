/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author cong's pc
 */
public class ExcelWriteUtil {
        //打印商品销售信息,传入标题（数组） int 标题数组长度（下标+1）
    public static void printSale(List psalelist,File file,String[] title,int limit){
        WritableWorkbook book = null;

        try {
                //2==============创建excel文件并设置数据显示格式          
            book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
        } catch (IOException ex) {
            Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
        try{
            sheet1.setRowView(0, 400); //设置标题行的高度
            for(int i = 0;i < limit;++ i){
                sheet1.setColumnView(i, 20);//设置所有标题列宽20
            } 
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
        WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
        WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);     
        WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中
        WritableCellFormat format1 = new WritableCellFormat(font1);
        try {
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设
            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
        } catch (WriteException ex) {
            Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
            //3 ============设置第一行为列名,并添加列名
        for(int i = 0;i < limit;++ i ){
            try {
                sheet1.addCell(new Label(i, 0, title[i], format));
            } catch (WriteException ex) {
                Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            //4 =====================取出List集合中的的内容，放到Excel中
        int row = psalelist.size();//获取集合的长度作为表格的行数
        for (int i = 0; i < row; i++) {
            String pro =  psalelist.get(i).toString();
            String[] unit = null;
            unit = pro.split(",");
            for(int j = 0;j < limit;++ j){
                try {
                    sheet1.addCell(new Label(j, i + 1 ,unit[j], format1));//改进
                } catch (WriteException ex) {
                    Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            //Public static String getInfo(int i){
//Switch(i){
//case 1: 
//return this.getPname();
//Case 2:
//return this.getFirstmonth().toString;
//}
//    }
//            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (IOException ex) {
            Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(ExcelWriteUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
}
