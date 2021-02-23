package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Dao.DBLink;
import OperateTarget.Purchase;
import java.util.Date;
public class PurchaseBizImpl implements PurchaseBiz{
	private DBLink lk  = new DBLink();
	public boolean add(Connection conn, Purchase p)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into Purchase values (?,?,?,?,?)";
		Object[] params = {p.getEid(),p.getGid(),p.getSid(),p.getGnum(),p.getPurdate()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public boolean delete(Connection conn, int eid,int gid,int sid,Date dt)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from Purchase where Eid = ? and Gid = ? and Sid =? and Purdate = ?";
		Object[] params = {eid,gid,sid,dt};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public boolean update(Connection conn,Purchase p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update Purchase set Gnum = ? where Eid = ? and Gid = ? and Sid = ? and Purdate = ?";
		Object[] params = {p.getGnum(),p.getEid(),p.getGid(),p.getSid(),p.getPurdate()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	public Purchase findByID(int eid,int gid, int sid, Date dt) {
		// TODO Auto-generated method stub
		String sql = "select * from Purchase where Eid = ? and Gid = ? and Sid = ? and Purdate = ?";
		Object[] params = {eid,gid,sid,dt};
		return (Purchase)(lk.get(sql,Purchase.class, params));
	}

	public List<Purchase> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Purchase";
		return lk.query(sql, Purchase.class);
	}

	public List<Purchase> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Purchase where Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Purchase.class, params);
	}
}
