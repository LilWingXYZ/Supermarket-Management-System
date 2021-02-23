package Biz;


import java.util.List;

import Dao.DBLink;
import OperateTarget.Rack;

public class RackBizImpl implements RackBiz{
	private DBLink lk  = new DBLink();
	public boolean add(Rack p) {
		// TODO Auto-generated method stub
		String sql = "insert into Rack values (?,?)";
		Object[] params = {p.getRid(),p.getRaddr()};
		return lk.update(sql, params);
	}

	public boolean delete(int rid) {
		// TODO Auto-generated method stub
		String sql = "delete from Rack where Rid = ?";
		Object[] params = {rid};
		return lk.update(sql, params);
	}

	public boolean update(Rack p) {
		// TODO Auto-generated method stub
		String sql = "update Rack set Raddr = ? where Rid = ?";
		Object[] params = {p.getRaddr(),p.getRid()};
		return lk.update(sql, params);
	}

	public Rack findByID(int rid) {
		// TODO Auto-generated method stub
		String sql = "select * from Rack where Rid = ?";
		Object[] params = {rid};
		return (Rack)(lk.get(sql,Rack.class, params));
	}

	public List<Rack> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Rack";
		return lk.query(sql, Rack.class);
	}

	public List<Rack> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Rack where Raddr like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Rack.class, params);
	}
}
