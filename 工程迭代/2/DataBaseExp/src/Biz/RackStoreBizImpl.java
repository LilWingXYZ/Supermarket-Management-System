package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Dao.DBLink;
import OperateTarget.RackStore;

public class RackStoreBizImpl implements RackStoreBiz{
	private DBLink lk  = new DBLink();

	public boolean add(Connection conn, RackStore p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into RackStore values (?,?,?)";
		Object[] params = {p.getRid(),p.getGid(),p.getGnum()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public boolean delete(Connection conn, int gid)throws SQLException{

		// TODO Auto-generated method stub
		String sql = "delete from RackStore where Gid = ?";
		Object[] params = {gid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public boolean update(Connection conn, RackStore p) throws  SQLException{
		// TODO Auto-generated method stub
		String sql = "update RackStore set Gnum = ?, Rid = ? where Gid = ?";
		Object[] params = {p.getGnum(),p.getRid(),p.getGid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public RackStore findByID(int gid) {
		// TODO Auto-generated method stub
		String sql = "select * from RackStore where Gid = ?";
		Object[] params = {gid};
		return (RackStore)(lk.get(sql,RackStore.class, params));
	}

	public List<RackStore> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from RackStore";
		return lk.query(sql, RackStore.class);
	}

	public List<RackStore> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from RackStore where Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, RackStore.class, params);
	}
}
