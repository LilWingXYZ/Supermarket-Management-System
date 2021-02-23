package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.Base;
import Dao.DBLink;
public class BaseBizImpl implements BaseBiz {
	@Override
	public boolean add(Connection conn, Base p)throws SQLException {
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "insert into Base values(?,?,?)";
		Object[] params = {p.getBid(),p.getBaddr(),p.getBname()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean delete(Connection conn, int bid) throws SQLException{
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "delete from Base where Bid = ?";
		Object[] params = {bid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Connection conn, Base p) throws SQLException{
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "update Base set Baddr = ?,Bname = ? where Bid = ?";
		Object[] params = {p.getBaddr(),p.getBname(),p.getBid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public Base findByID(int bid) {
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "select * from Base where Bid = ?";
		Object[] params = {bid};
		return (Base) (lk.get(sql,Base.class, params));
	}

	@Override
	public List<Base> findAll() {
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "select * from Base";
		return (lk.query(sql, Base.class));
	}
	@Override
	public List<Base> findByCondition(String condition) {
		// TODO Auto-generated method stub
		DBLink lk = new DBLink();
		String sql = "select * from Base where Baddr + Bname like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Base.class, params);
	}

}
