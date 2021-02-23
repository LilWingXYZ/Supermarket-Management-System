package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface SellBiz {
	public boolean add(Connection conn, Sell p)throws SQLException;
	public boolean delete(Connection conn, int eid,int cid,Date dt)throws SQLException;
	public boolean update(Connection conn, Sell p)throws SQLException;
	public Sell findByID(int eid,int cid,Date dt);
	public List<Sell> findAll();
	public List<Sell> findByCondition(String condition);
}
