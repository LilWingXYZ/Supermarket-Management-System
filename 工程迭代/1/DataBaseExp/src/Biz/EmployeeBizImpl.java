package Biz;

import java.util.List;

import Dao.DBLink;
import OperateTarget.Employee;

public class EmployeeBizImpl implements EmployeeBiz{
	private DBLink lk  = new DBLink();
	@Override
	public boolean add(Employee p) {
		// TODO Auto-generated method stub
		String sql = "insert into Employee values (?,?,?,?)";
		Object[] params = {p.getEid(),p.getEname(),p.getElevel(),p.getEtel()};
		return lk.update(sql, params);
	}

	@Override
	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		String sql = "delete from Employee where Eid = ?";
		Object[] params = {eid};
		return lk.update(sql, params);
	}

	@Override
	public boolean update(Employee p) {
		// TODO Auto-generated method stub
		String sql = "update Employee set Ename = ?,Elevel = ?, Etel = ? where Eid = ?";
		Object[] params = {p.getEname(),p.getElevel(),p.getEtel(),p.getEid()};
		return lk.update(sql, params);
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
