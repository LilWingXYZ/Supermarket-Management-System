package Biz;
import java.util.List;
import OperateTarget.*;
public interface CustomerBiz {
	public boolean add(Customer p);
	public boolean delete(int cid);
	public boolean update(Customer p);
	public Customer findByID(int cid);
	public List<Customer> findAll();
	public List<Customer> findByCondition(String condition);
}
