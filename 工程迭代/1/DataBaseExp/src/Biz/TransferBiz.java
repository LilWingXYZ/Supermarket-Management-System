package Biz;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface TransferBiz {
	public boolean add(Transfer p);
	public boolean delete(int eid, int gid, int bid, int rid,Date dt);
	public boolean update(Transfer p);
	public Transfer findByID(int eid, int gid, int bid, int rid,Date dt);
	public List<Transfer> findAll();
	public List<Transfer> findByCondition(String condition);
}
