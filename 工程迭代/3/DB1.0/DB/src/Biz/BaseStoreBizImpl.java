package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import Dao.*;
import OperateTarget.BaseStore;

public class BaseStoreBizImpl implements BaseStoreBiz {
	private DBLink lk = new DBLink();
	@Override
	public boolean add(Connection conn, BaseStore p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into BaseStore values(?,?,?)";
		Object[] params = {p.getBid(),p.getGid(),p.getGnum()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean delete(Connection conn, int bid, int gid) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "delete from BaseStore where Bid = ? ans Gid = ?";
		Object[] params = {bid,gid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Connection conn, BaseStore p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update BaseStore set Gnum = ? where Bid = ? and Gid = ?";
		Object[] params = {p.getGnum(),p.getBid(),p.getGid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public BaseStore findByID(int bid, int gid) {
		String sql = "select * from BaseStore where Bid = ? and Gid = ?";
		Object[] params = {bid,gid};
		return (BaseStore)(lk.get(sql, BaseStore.class, params));
	}

	@Override
	public List<BaseStore> findAll() {
		String sql = "select * from BaseStore";
		return lk.query(sql, BaseStore.class);
	}

	@Override
	public List<BaseStore> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from BaseStore where Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql,BaseStore.class, params);
	}
        public List<BaseStore> findByCondition(String condition,int mode) {
		// TODO Auto-generated method stub
		String sql = "select * from BaseStore where Gid like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql,BaseStore.class, params);
	}
}
