package Biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface TransferBiz {
	public boolean add(Connection conn,Transfer p)throws SQLException;
	public boolean delete(Connection conn, int eid, int gid, int bid, int rid,Date dt)throws SQLException;
	public boolean update(Connection conn, Transfer p)throws SQLException;
	public Transfer findByID(int eid, int gid, int bid, int rid,Date dt);
	public List<Transfer> findAll();
	public List<Transfer> findByCondition(String condition);
        public List<Transfer> findByCondition(String condition,int mode);
}
