/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *验证字符创格式
 * @author dell
 */
public class StringUtil{
    public static boolean checkLength(String s){
        if(s.length()==0){
            return false;
        }else{
            return true;
        }
    }
    public static boolean checkDigit(String s) throws NullPointerException{
        String regex = "[0-9]+";
        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkDecimal(String s) throws NullPointerException{
        String regex = "([0-9]*.[0-9]+)|([0-9]+)";
        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }
    }
}
