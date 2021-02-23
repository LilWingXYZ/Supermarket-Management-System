package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Dao.DBLink;
import OperateTarget.*;
public interface BaseBiz {
	public boolean add(Connection conn, Base p)throws SQLException;
	public boolean delete(Connection conn, int bid)throws SQLException;
	public boolean update(Connection conn, Base p)throws SQLException;
	public Base findByID(int bid);
	public List<Base> findAll();
	public List<Base> findByCondition(String condition);
}
