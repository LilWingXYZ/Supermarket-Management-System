package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Dao.DBLink;
import OperateTarget.Producer;

public class ProducerBizImpl implements ProducerBiz{
	private DBLink lk  = new DBLink();
	public boolean add(Connection conn, Producer p)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into Producer values (?,?,?,?)";
		Object[] params = {p.getPid(),p.getPaddr(),p.getPname(),p.getPtel()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}


	public boolean delete(Connection conn, int pid)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from Producer where Pid = ?";
		Object[] params = {pid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public boolean update(Connection conn, Producer p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update Producer set Paddr = ?, Pname = ?,Ptel = ? where Pid = ?";
		Object[] params = {p.getPaddr(),p.getPname(),p.getPtel(),p.getPid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public Producer findByID(int pid) {
		// TODO Auto-generated method stub
		String sql = "select * from Producer where Pid = ?";
		Object[] params = {pid};
		return (Producer)(lk.get(sql,Producer.class, params));
	}

	public List<Producer> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Producer";
		return lk.query(sql, Producer.class);
	}

	public List<Producer> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Producer where Paddr + Pname + Ptel like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Producer.class, params);
	}
}
