package Biz;

import java.util.List;

import Dao.DBLink;
import OperateTarget.Supplier;

public class SupplierBizImpl implements SupplierBiz {
	private DBLink lk = new DBLink();
	@Override
	public boolean add(Supplier p) {
		// TODO Auto-generated method stub
		String sql = "insert into Supplier values(?,?,?,?)";
		Object[] params = {p.getSid(),p.getSaddr(),p.getStel(),p.getSname()};
		return lk.update(sql, params);
	}

	@Override
	public boolean delete(int sid) {
		// TODO Auto-generated method stub
		String sql = "delete from Supplier where Sid = ?";
		Object[] params = {sid};
		return lk.update(sql, params);
	}

	@Override
	public boolean update(Supplier p) {
		// TODO Auto-generated method stub
		String sql = "update Supplier set Saddr = ?, Stel = ?, Sname = ? where Sid = ?";
		Object[] params = {p.getSaddr(),p.getStel(),p.getSname(),p.getSid()};
		return lk.update(sql, params);
	}

	@Override
	public Supplier findByID(int sid) {
		String sql = "select * from BaseStore where Sid = ?";
		Object[] params = {sid};
		return (Supplier)(lk.get(sql, Supplier.class, params));
	}

	@Override
	public List<Supplier> findAll() {
		String sql = "select * from Supplier";
		return lk.query(sql, Supplier.class);
	}

	@Override
	public List<Supplier> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Supplier where Saddr + Stel + Sname like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql,Supplier.class, params);
	}
}
