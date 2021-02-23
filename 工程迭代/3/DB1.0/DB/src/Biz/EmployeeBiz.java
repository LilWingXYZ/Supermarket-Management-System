package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface EmployeeBiz {
	public boolean add(Connection conn, Employee p)throws SQLException;
	public boolean delete(Connection conn, int eid)throws SQLException;
	public boolean update(Connection conn, Employee p)throws SQLException;
	public Employee findByID(int eid);
	public List<Employee> findAll();
	public List<Employee> findByCondition(String condition);

}
