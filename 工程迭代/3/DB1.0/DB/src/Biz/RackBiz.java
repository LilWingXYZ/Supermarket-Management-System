package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface RackBiz {
	public boolean add(Connection conn, Rack p)throws SQLException;
	public boolean delete(Connection conn, int rid)throws SQLException;
	public boolean update(Connection conn, Rack p)throws SQLException;
	public Rack findByID(int rid);
	public List<Rack> findAll();
	public List<Rack> findByCondition(String condition);
}
