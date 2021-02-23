package Biz;
import java.util.List;
import OperateTarget.*;
public interface BaseStoreBiz {
	public boolean add(BaseStore p);
	public boolean delete(int bid,int gid);
	public boolean update(BaseStore p);
	public BaseStore findByID(int bid,int gid);
	public List<BaseStore> findAll();
	public List<BaseStore> findByCondition(String condition);
}
