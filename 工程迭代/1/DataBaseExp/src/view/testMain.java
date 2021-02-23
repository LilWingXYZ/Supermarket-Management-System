package view;
import java.util.*;
import Biz.BaseBizImpl;
import OperateTarget.*;
public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBizImpl temp = new BaseBizImpl();
		List<Base> lt = temp.findByCondition("ÖÐÉ½Â·4ºÅ");
		System.out.println(lt.toString());
	}

}
