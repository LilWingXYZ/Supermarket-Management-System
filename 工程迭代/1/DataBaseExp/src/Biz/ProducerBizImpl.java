package Biz;

import java.util.List;

import Dao.DBLink;
import OperateTarget.Producer;

public class ProducerBizImpl implements ProducerBiz{
	private DBLink lk  = new DBLink();
	public boolean add(Producer p) {
		// TODO Auto-generated method stub
		String sql = "insert into Producer values (?,?,?,?)";
		Object[] params = {p.getPid(),p.getPaddr(),p.getPname(),p.getPtel()};
		return lk.update(sql, params);
	}

	public boolean delete(int pid) {
		// TODO Auto-generated method stub
		String sql = "delete from Producer where Pid = ?";
		Object[] params = {pid};
		return lk.update(sql, params);
	}

	public boolean update(Producer p) {
		// TODO Auto-generated method stub
		String sql = "update Producer set Paddr = ?, Pname = ?,Ptel = ? where Pid = ?";
		Object[] params = {p.getPaddr(),p.getPname(),p.getPtel(),p.getPid()};
		return lk.update(sql, params);
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
