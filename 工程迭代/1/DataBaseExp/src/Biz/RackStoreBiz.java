package Biz;
import java.util.List;
import OperateTarget.*;
public interface RackStoreBiz {
	public boolean add(RackStore p);
	public boolean delete(int rid,int gid);
	public boolean update(RackStore p);
	public RackStore findByID(int rid,int gid);
	public List<RackStore> findAll();
	public List<RackStore> findByCondition(String condition);
}
