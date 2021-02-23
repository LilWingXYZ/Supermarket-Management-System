package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface ProducerBiz {
	public boolean add(Connection conn, Producer p)throws SQLException;
	public boolean delete(Connection conn, int pid)throws SQLException;
	public boolean update(Connection conn, Producer p)throws SQLException;
	public Producer findByID(int pid);
	public List<Producer> findAll();
	public List<Producer> findByCondition(String condition);
}
