/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;


 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFDateUtil;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.apache.poi.ss.usermodel.Sheet;
 import org.apache.poi.ss.usermodel.Workbook;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author cong's pc
 */
public class ExcelReadUtil {
    private String errorInfo;
     
     /**
      * 楠岃瘉EXCEL鏂囦欢鏄惁鍚堟硶 
      */
    public boolean validateExcel(String filePath){ 
     
     /**鍒ゆ柇鏂囦欢鍚嶆槸鍚︿负绌烘垨鑰呮枃浠舵槸鍚﹀瓨鍦� */
        if(!CEVUtil.fileExist(filePath)){
            errorInfo = "鏂囦欢涓嶅瓨鍦�";
            return false; 
        }
     
         /**妫�鏌ユ枃浠舵槸鍚︽槸Excel鏍煎紡鐨勬枃浠� */  
        if (!CEVUtil.isExcel(filePath))  {  
            errorInfo = "鏂囦欢鍚嶄笉鏄痚xcel鏍煎紡";  
            return false;  
        } 
        return true;  
    }
     
     /** 
      * @鎻忚堪锛氭牴鎹枃浠跺悕璇诲彇excel鏂囦欢 
      */  
     public List<List<String>> read(String filePath){
        List<List<String>> dataLst = new ArrayList<List<String>>();  
        InputStream is = null;  
        try{
             /** 楠岃瘉鏂囦欢鏄惁鍚堟硶 */  
            if (!validateExcel(filePath)){ 
                System.out.println(errorInfo);
                return null;
            }  
             /** 鍒ゆ柇鏂囦欢鐨勭被鍨嬶紝鏄�2003杩樻槸2007 */  
            boolean isExcel2003 = true; 
            if (CEVUtil.isExcel2007(filePath)){ 
                isExcel2003 = false;  
            }  
             /** 璋冪敤鏈被鎻愪緵鐨勬牴鎹祦璇诲彇鐨勬柟娉� */  
            is = new FileInputStream(new File(filePath));
            Workbook wb = null;  
            if (isExcel2003){  
                wb = new HSSFWorkbook(is);  
            }else{  
                wb = new XSSFWorkbook(is);  
            }
            is.close();
            dataLst = readWB(wb);
        }catch (IOException e){  
            e.printStackTrace();  
        }catch (Exception ex){  
            ex.printStackTrace();  
        }finally{
            if (is != null){  
                try{  
                    is.close();  
                }catch (IOException e){  
                    is = null;  
                    e.printStackTrace();  
                }  
            }  
        }  
        return dataLst;  
    }
     
     /** 
      * @鎻忚堪锛氳鍙栨暟鎹� 
      */  
    private List<List<String>> readWB(Workbook wb){  
        List<List<String>> dataLst = new ArrayList<List<String>>();
         /**寰楀埌鎬荤殑shell */
        int sheetAccount = wb.getNumberOfSheets();
         /** 寰楀埌绗竴涓猻hell */
        Sheet sheet = wb.getSheetAt(0);  
         /** 寰楀埌Excel鐨勮鏁� */  
        int rowCount = sheet.getPhysicalNumberOfRows();
         /** 涔熷彲浠ラ�氳繃寰楀埌鏈�鍚庝竴琛屾暟*/
        int lastRowNum = sheet.getLastRowNum();
         /** 寰幆Excel鐨勮 */  
        for (int r = 0; r < rowCount; r++){  
            Row row = sheet.getRow(r);  
            if (row == null){  
                continue;  
            }  
            List<String> rowLst = new ArrayList<String>();  
             /** 寰幆Excel鐨勫垪 */  
            for (int c = 0; c < row.getPhysicalNumberOfCells(); c++){  
                Cell cell = row.getCell(c);  
                String cellValue = "";  
                if (null != cell){  
                     // 浠ヤ笅鏄垽鏂暟鎹殑绫诲瀷  
                    switch (cell.getCellType()){ 
                     //XSSFCell鍙互杈惧埌鐩稿悓鐨勬晥鏋�
                    case HSSFCell.CELL_TYPE_NUMERIC: // 鏁板瓧  
                        if (HSSFDateUtil.isCellDateFormatted(cell)) {//鏃ユ湡绫诲瀷
                            double d = cell.getNumericCellValue();
                            // Date date = cell.getDateCellValue();
                            Date date = HSSFDateUtil.getJavaDate(d);
                            cellValue =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
                            cellValue = cell.getDateCellValue() + "";  
                        }
                        else{//鏁板�肩被鍨�          
                            cellValue = ((int)cell.getNumericCellValue())+"";
                        }
                        break;  
                   case HSSFCell.CELL_TYPE_STRING: // 瀛楃涓�  
                       cellValue = cell.getStringCellValue();  
                       break;  
                   case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean  
                       cellValue = cell.getBooleanCellValue() + "";  
                       break;  
                   case HSSFCell.CELL_TYPE_FORMULA: // 鍏紡  
                       cellValue = cell.getCellFormula() + "";  
                       break;  
                   case HSSFCell.CELL_TYPE_BLANK: // 绌哄��  
                       cellValue = "";  
                       break;  
                   case HSSFCell.CELL_TYPE_ERROR: // 鏁呴殰  
                       cellValue = "闈炴硶瀛楃";  
                       break;
                   default:  
                       cellValue = "鏈煡绫诲瀷";  
                       break;  
                     }  
                 }  
                 System.out.print(cellValue +"\t");//杈撳嚭琛ㄤ腑淇℃伅
                 rowLst.add(cellValue);  
             }
             System.out.println();
             dataLst.add(rowLst);  
         }  
         return dataLst;  
     }  
}
