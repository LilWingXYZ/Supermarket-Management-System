package Biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import OperateTarget.Customer;
import Dao.DBLink;
public class CustomerBizImpl implements CustomerBiz{
	private DBLink lk  = new DBLink();
	@Override
	public boolean add(Connection conn, Customer p)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into Customer values (?,?,?,?)";
		Object[] params = {p.getCid(),p.getCtel(),p.getCname(),p.getMoney()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean delete(Connection conn, int cid) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "delete from Customer where cid = ?";
		Object[] params = {cid};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Connection conn, Customer p) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update Customer set Ctel = ?,Cname = ?, Money = ? where Cid = ?";
		Object[] params = {p.getCtel(),p.getCname(),p.getMoney(),p.getCid()};
		boolean flag = false;
		try{
			flag = lk.update(conn, sql, params);
		} catch (SQLException e) {
			throw e;
		}
		return flag;
	}

	@Override
	public Customer findByID(int cid) {
		// TODO Auto-generated method stub
		String sql = "select * from Customer where Cid = ?";
		Object[] params = {cid};
		return (Customer)(lk.get(sql,Customer.class, params));
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from Customer";
		return lk.query(sql, Customer.class);
	}

	@Override
	public List<Customer> findByCondition(String condition) {
		// TODO Auto-generated method stub
		String sql = "select * from Customer where Ctel + Cname + Money like ?";
		Object[] params = {"%"+condition+"%"};
		return lk.query(sql, Customer.class, params);
	}

}
