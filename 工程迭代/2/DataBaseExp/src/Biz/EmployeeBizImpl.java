package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Dao.DBLink;
import OperateTarget.Employee;

public class EmployeeBizImpl implements EmployeeBiz{
	private DBLink lk  = new DBLink();
	@Override
	public boolean add(Connection conn, Employee p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into Employee values (?,?,?,?,?)";
		Object[] params = {p.getEid(),p.getEname(),p.getElevel(),p.getEtel(),p.getPassword()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean delete(Connection conn, int eid) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "delete from Employee where Eid = ?";
		Object[] params = {eid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Connection conn, Employee p)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "update Employee set Ename = ?,Elevel = ?, Etel = ?,Password = ? where Eid = ?";
		Object[] params = {p.getEname(),p.getElevel(),p.getEtel(),p.getPassword(),p.getEid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public Employee findByID(int eid) {
		// TODO Auto-generated method stub
		String sql = "select * from Employee where Eid = ?";
		Object[] params = {eid};
		return (Employee)(lk.get(sql,Employee.class, params));
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Employee";
		return lk.query(sql, Employee.class);
	}

	@Override
	public List<Employee> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Employee where Ename + Elevel + Etel like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Employee.class, params);
	}

}
