package Biz;

import java.util.List;

import Dao.DBLink;
import OperateTarget.RackStore;

public class RackStoreBizImpl implements RackStoreBiz{
	private DBLink lk  = new DBLink();
	public boolean add(RackStore p) {
		// TODO Auto-generated method stub
		String sql = "insert into RackStore values (?,?,?)";
		Object[] params = {p.getRid(),p.getGid(),p.getGnum()};
		return lk.update(sql, params);
	}

	public boolean delete(int rid, int gid) {
		// TODO Auto-generated method stub
		String sql = "delete from RackStore where Rid = ? and Gid = ?";
		Object[] params = {rid,gid};
		return lk.update(sql, params);
	}

	public boolean update(RackStore p) {
		// TODO Auto-generated method stub
		String sql = "update RackStore set Gnum = ? where Rid = ? and Gid = ?";
		Object[] params = {p.getGnum(),p.getRid(),p.getGid()};
		return lk.update(sql, params);
	}

	public RackStore findByID(int rid,int gid) {
		// TODO Auto-generated method stub
		String sql = "select * from RackStore where Rid = ? and Gid = ?";
		Object[] params = {rid,gid};
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
