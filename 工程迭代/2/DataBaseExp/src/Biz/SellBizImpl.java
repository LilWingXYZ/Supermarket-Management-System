package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;
import Dao.DBLink;
import OperateTarget.Sell;

public class SellBizImpl implements SellBiz{
private DBLink lk  = new DBLink();
	
	public boolean add(Connection conn,Sell p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into Sell values (?,?,?,?,?)";
		Object[] params = {p.getEid(),p.getCid(),p.getGid(),p.getGnum(),p.getSelldate()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	
	public boolean delete(Connection conn,int eid,int cid,Date dt) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from Sell where Eid = ? and Cid = ? and Selldate = ?";
		Object[] params = {eid,cid,dt};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	
	public boolean update(Connection conn,Sell p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update Sell set Gid = ?,Gnum = ? where Eid = ? and Cid = ? and Selldate = ?";
		Object[] params = {p.getGid(),p.getGnum(),p.getEid(),p.getCid(),p.getSelldate()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	
	public Sell findByID(int eid,int cid,Date dt) {
		// TODO Auto-generated method stub
		String sql = "select * from Sell where Eid = ? and Cid = ? and Selldate = ?";
		Object[] params = {eid,cid,dt};
		return (Sell)(lk.get(sql,Sell.class, params));
	}


	public List<Sell> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Sell";
		return lk.query(sql, Sell.class);
	}

	public List<Sell> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Sell where Gid + Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Sell.class, params);
	}
}
