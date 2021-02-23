package Operation;

import Biz.*;
import Dao.DBLink;
import OperateTarget.*;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/*
* Customer:
* Sell:
* Rack:
* RackStore:
*
* addSell 进行销售操作
* */

public class Seller {
	public Employee emp = new Employee();
	public Seller(Employee emp){
	    this.emp=emp;
    }

	public boolean addSell(Sell s) {
		// TODO Auto-generated method stub
        DBLink lk = new DBLink();
        Connection conn = lk.getConnection();
        boolean result =false;

        RackStoreBizImpl rsBiz = new RackStoreBizImpl();
        SellBizImpl sBiz = new SellBizImpl();
        CustomerBizImpl cBiz = new CustomerBizImpl();
        GoodsBizImpl gBiz = new GoodsBizImpl();
        try{
            conn.setAutoCommit(false);

            //从货架取出
            RackStore rs = rsBiz.findByID(s.getGid());
            rs.setGnum(rs.getGnum()-s.getGnum());
            rsBiz.update(conn, rs);

            //加入售卖关系表
            sBiz.add(conn, s);

            //客户消费额度增加
            Customer c = cBiz.findByID(s.getCid());
            Goods g = gBiz.findByID(s.getGid());
            c.setMoney(c.getMoney() + s.getGnum() * g.getGsprice());
            cBiz.update(conn, c);

            conn.commit();
            result = true;
        }catch (SQLException ex1){
            try{
                result=false;
                System.out.print("事务回滚");
                conn.rollback();
            }catch(SQLException ex2){
                ex2.printStackTrace();
            }
            ex1.printStackTrace();
        }finally {
            DbUtils.closeQuietly(conn);
        }
		return result;
	}

	public boolean delete(int mode) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(int mode) {
		// TODO Auto-generated method stub
		return false;
	}

	public List select(int mode) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
