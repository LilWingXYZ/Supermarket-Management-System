package Biz;
import java.util.List;
import OperateTarget.Base;
import Dao.DBLink;
public class BaseBizImpl implements BaseBiz {
	private DBLink lk = new DBLink();
	@Override
	public boolean add(Base p) {
		// TODO Auto-generated method stub
		String sql = "insert into Base values(?,?,?)";
		Object[] params = {p.getBid(),p.getBaddr(),p.getBname()};
		return lk.update(sql, params);
	}

	@Override
	public boolean delete(int bid) {
		// TODO Auto-generated method stub
		String sql = "delete from Base where Bid = ?";
		Object[] params = {bid};
		return lk.update(sql, params);
	}

	@Override
	public boolean update(Base p) {
		// TODO Auto-generated method stub
		String sql = "update Base set Baddr = ?,Bname = ? where Bid = ?";
		Object[] params = {p.getBaddr(),p.getBname(),p.getBid()};
		return (lk.update(sql,params));
	}

	@Override
	public Base findByID(int bid) {
		// TODO Auto-generated method stub
		String sql = "select * from Base where Bid = ";
		Object[] params = {bid};
		return (Base) (lk.get(sql,Base.class, params));
	}

	@Override
	public List<Base> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Base";
		return (lk.query(sql, Base.class));
	}
	@Override
	public List<Base> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Base where Baddr + Bname like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Base.class, params);
	}

}
