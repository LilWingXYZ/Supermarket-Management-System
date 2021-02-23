package Biz;
import java.util.List;
import OperateTarget.*;
public interface BaseBiz {
	public boolean add(Base p);
	public boolean delete(int bid);
	public boolean update(Base p);
	public Base findByID(int bid);
	public List<Base> findAll();
	public List<Base> findByCondition(String condition);
}
