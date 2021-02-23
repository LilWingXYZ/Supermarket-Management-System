package Biz;

import java.util.Date;
import java.util.List;

import Dao.DBLink;
import OperateTarget.Transfer;

public class TransferBizImpl implements TransferBiz{
	private DBLink lk = new DBLink();
	@Override
	public boolean add(Transfer p) {
		// TODO Auto-generated method stub
		String sql = "insert into Supply values(?,?,?,?,?,?)";
		Object[] params = {p.getEid(),p.getGid(),p.getBid(),p.getRid(),p.getTransdate(),p.getGnum()};
		return lk.update(sql, params);
	}

	@Override
	public boolean delete(int eid, int gid, int bid, int rid,Date dt) {
		// TODO Auto-generated method stub
		String sql = "delete from Transfer where Eid = ? and Gid = ? and Bid = ? and Sid = ? and Transdate = ?";
		Object[] params = {eid,gid,bid,rid,dt};
		return lk.update(sql, params);
	}

	@Override
	public boolean update(Transfer p) {
		// TODO Auto-generated method stub
		String sql =  "update Transfer set Gnum = ? where Eid = ? and Gid = ? and Bid = ? and Sid = ? and Transdate = ? ";
		Object[] params = {p.getGnum(),p.getEid(),p.getGid(),p.getBid(),p.getRid(),p.getTransdate()}; 
		return lk.update(sql, params);
	}

	@Override
	public Transfer findByID(int eid, int gid, int bid, int rid,Date dt) {
		// TODO Auto-generated method stub
		String sql = "select * from Transfer where Eid = ? and Gid = ? and Bid = ? and Sid = ? and Transdate = ?";
		Object[] params = {eid,gid,bid,dt};
		return (Transfer) (lk.get(sql, Transfer.class, params));
	}

	@Override
	public List<Transfer> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Transfer";
		return lk.query(sql, Transfer.class);
	}

	@Override
	public List<Transfer> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Transfer where Gnum like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Transfer.class, params);
	}

}
