package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface SupplierBiz {
	public boolean add(Connection conn, Supplier p)throws SQLException;
	public boolean delete(Connection conn, int sid)throws SQLException;
	public boolean update(Connection conn, Supplier p)throws SQLException;
	public Supplier findByID(int sid);
	public List<Supplier> findAll();
	public List<Supplier> findByCondition(String condition);
}
