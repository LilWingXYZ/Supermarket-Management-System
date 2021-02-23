package Biz;

import java.util.List;
import Dao.*;
import OperateTarget.BaseStore;

public class BaseStoreBizImpl implements BaseStoreBiz {
	private DBLink lk = new DBLink();
	@Override
	public boolean add(BaseStore p) {
		// TODO Auto-generated method stub
		String sql = "insert into BaseStore values(?,?,?)";
		Object[] params = {p.getBid(),p.getGid(),p.getGnum()};
		return lk.update(sql, params);
	}

	@Override
	public boolean delete(int bid, int gid) {
		// TODO Auto-generated method stub
		String sql = "delete from BaseStore where Bid = ? ans Gid = ?";
		Object[] params = {bid,gid};
		return lk.update(sql, params);
	}

	@Override
	public boolean update(BaseStore p) {
		// TODO Auto-generated method stub
		String sql = "update BaseStore set Gnum = ? where Bid = ? and Gid = ?";
		Object[] params = {p.getGnum(),p.getBid(),p.getGid()};
		return lk.update(sql, params);
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

}
