package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface RackStoreBiz {
	public boolean add(Connection conn, RackStore p)throws SQLException;
	public boolean delete(Connection conn, int gid)throws SQLException;
	public boolean update(Connection conn, RackStore p)throws SQLException;
	public RackStore findByID(int gid);
	public List<RackStore> findAll();
	public List<RackStore> findByCondition(String condition);
}
