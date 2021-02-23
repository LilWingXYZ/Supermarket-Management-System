package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import Dao.DBLink;
import OperateTarget.Supply;

public class SupplyBizImpl implements SupplyBiz{
	private DBLink lk = new DBLink();

	@Override
	public boolean add(Connection conn,Supply p)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into Supply values(?,?,?,?)";
		Object[] params = {p.getSid(),p.getGid(),p.getSupdate(),p.getGnum()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean delete(Connection conn, int sid, int gid,Date dt)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "delete from Supply where Sid = ? ans Gid = ? and Supdate = ?";
		Object[] params = {sid,gid,dt};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Connection conn,Supply p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update Supply set Gnum = ? where Sid = ? and Gid = ? and Supdate = ?";
		Object[] params = {p.getGnum(),p.getSid(),p.getGid(),p.getSupdate()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public Supply findByID(int sid, int gid, Date dt) {
		String sql = "select * from Supply where Sid = ? and Gid = ? and Supdate = ?";
		Object[] params = {sid,gid,dt};
		return (Supply)(lk.get(sql, Supply.class, params));
	}

	@Override
	public List<Supply> findAll() {
		String sql = "select * from Supply";
		return lk.query(sql, Supply.class);
	}

	@Override
	public List<Supply> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Supply where Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql,Supply.class, params);
	}
}
