package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import OperateTarget.*;
public interface BaseStoreBiz {
	public boolean add(Connection conn,BaseStore p)throws SQLException;
	public boolean delete(Connection conn, int bid,int gid)throws SQLException;
	public boolean update(Connection conn, BaseStore p) throws  SQLException;
	public BaseStore findByID(int bid,int gid);
	public List<BaseStore> findAll();
        public List<BaseStore> findByCondition(String condition,int mode);
	public List<BaseStore> findByCondition(String condition);
}
