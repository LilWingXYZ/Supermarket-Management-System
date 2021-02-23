package Biz;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface SupplyBiz {
	public boolean add(Supply p);
	public boolean delete(int sid, int gid,Date dt);
	public boolean update(Supply p);
	public Supply findByID(int sid, int gid,Date dt);
	public List<Supply> findAll();
	public List<Supply> findByCondition(String condition);
}
