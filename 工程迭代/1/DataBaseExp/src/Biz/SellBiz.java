package Biz;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface SellBiz {
	public boolean add(Sell p);
	public boolean delete(int eid,int cid,Date dt);
	public boolean update(Sell p);
	public Sell findByID(int eid,int cid,Date dt);
	public List<Sell> findAll();
	public List<Sell> findByCondition(String condition);
}
