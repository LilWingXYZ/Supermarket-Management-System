package Biz;
import java.util.List;
import OperateTarget.*;
public interface SupplierBiz {
	public boolean add(Supplier p);
	public boolean delete(int sid);
	public boolean update(Supplier p);
	public Supplier findByID(int sid);
	public List<Supplier> findAll();
	public List<Supplier> findByCondition(String condition);
}
