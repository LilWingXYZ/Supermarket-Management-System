package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface PurchaseBiz {
	public boolean add(Connection conn, Purchase p)throws SQLException;
	public boolean delete(Connection conn, int eid,int gid,int sid,Date dt)throws SQLException;
	public boolean update(Connection conn, Purchase p)throws SQLException;
	public Purchase findByID(int eid,int gid,int sid,Date dt);
	public List<Purchase> findAll();
	public List<Purchase> findByCondition(String condition);
}
