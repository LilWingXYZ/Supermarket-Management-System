package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface SupplyBiz {
	public boolean add(Connection conn, Supply p)throws SQLException;
	public boolean delete(Connection conn, int sid, int gid,Date dt)throws SQLException;
	public boolean update(Connection conn,Supply p)throws SQLException;
	public Supply findByID(int sid, int gid,Date dt);
	public List<Supply> findAll();
	public List<Supply> findByCondition(String condition);
}
