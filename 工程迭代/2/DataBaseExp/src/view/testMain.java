package view;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import Biz.BaseBizImpl;
import Biz.EmployeeBizImpl;
import Dao.DBLink;
import OperateTarget.*;
import Operation.Seller;
import org.apache.commons.dbutils.DbUtils;


public class testMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BaseBizImpl temp = new BaseBizImpl();
		EmployeeBizImpl eBiz = new EmployeeBizImpl();
		Connection conn = new DBLink().getConnection();
		//DBLink dl = new DBLink();
		//List<Base> lt = temp.findByCondition(dl, "É½¶«");
		Base ba1 = new Base();
		Employee emp = eBiz.findByID(2);
		Seller ser=new Seller(emp);
		Sell s=new Sell();

		s.setGid(1);

		s.setCid(1);
		s.setEid(2);
		s.setGnum(1);
		s.setSelldate(new Date());

		ser.addSell(s);
		DbUtils.closeQuietly(conn);
		List<Base> b = temp.findAll();
		//for(Base p: b)
		//System.out.println(p);
	}

}
