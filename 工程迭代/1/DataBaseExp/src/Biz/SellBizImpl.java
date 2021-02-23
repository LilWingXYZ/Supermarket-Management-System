package Biz;

import java.util.List;
import java.util.Date;
import Dao.DBLink;
import OperateTarget.Sell;

public class SellBizImpl implements SellBiz{
private DBLink lk  = new DBLink();
	
	public boolean add(Sell p) {
		// TODO Auto-generated method stub
		String sql = "insert into Sell values (?,?,?,?,?)";
		Object[] params = {p.getEid(),p.getCid(),p.getGid(),p.getGnum(),p.getSelldate()};
		return lk.update(sql, params);
	}

	
	public boolean delete(int eid,int cid,Date dt) {
		// TODO Auto-generated method stub
		String sql = "delete from Sell where Eid = ? and Cid = ? and Selldate = ?";
		Object[] params = {eid,cid,dt};
		return lk.update(sql, params);
	}

	
	public boolean update(Sell p) {
		// TODO Auto-generated method stub
		String sql = "update Sell set Gid = ?,Gnum = ? where Eid = ? and Cid = ? and Selldate = ?";
		Object[] params = {p.getGid(),p.getGnum(),p.getEid(),p.getCid(),p.getSelldate()};
		return lk.update(sql, params);
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
