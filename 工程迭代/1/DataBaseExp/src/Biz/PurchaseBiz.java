package Biz;
import java.util.Date;
import java.util.List;
import OperateTarget.*;
public interface PurchaseBiz {
	public boolean add(Purchase p);
	public boolean delete(int eid,int gid,int sid,Date dt);
	public boolean update(Purchase p);
	public Purchase findByID(int eid,int gid,int sid,Date dt);
	public List<Purchase> findAll();
	public List<Purchase> findByCondition(String condition);
}
