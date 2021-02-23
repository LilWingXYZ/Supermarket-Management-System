package Biz;
import java.util.List;
import OperateTarget.*;
public interface RackBiz {
	public boolean add(Rack p);
	public boolean delete(int rid);
	public boolean update(Rack p);
	public Rack findByID(int rid);
	public List<Rack> findAll();
	public List<Rack> findByCondition(String condition);
}
