package Biz;
import java.util.List;
import OperateTarget.*;
public interface GoodsBiz {
	public boolean add(Goods p);
	public boolean delete(int gid);
	public boolean update(Goods p);
	public Goods findByID(int gid);
	public List<Goods> findAll();
	public List<Goods> findByCondition(String condition);
}
