package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface GoodsBiz {
	public boolean add(Connection conn,Goods p)throws SQLException;
	public boolean delete(Connection conn, int gid)throws SQLException;
	public boolean update(Connection conn, Goods p)throws SQLException;
	public Goods findByID(int gid);
	public List<Goods> findAll();
	public List<Goods> findByCondition(String condition);
}
