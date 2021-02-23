package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface CustomerBiz {
	public boolean add(Connection conn, Customer p)throws SQLException;
	public boolean delete(Connection conn, int cid)throws SQLException;
	public boolean update(Connection conn, Customer p)throws SQLException;
	public Customer findByID(int cid);
	public List<Customer> findAll();
	public List<Customer> findByCondition(String condition);
        public List<Customer> findByCondition(String condition,int mode);
}
