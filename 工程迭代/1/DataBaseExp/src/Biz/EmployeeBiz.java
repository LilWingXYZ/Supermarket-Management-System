package Biz;
import java.util.List;
import OperateTarget.*;
public interface EmployeeBiz {
	public boolean add(Employee p);
	public boolean delete(int eid);
	public boolean update(Employee p);
	public Employee findByID(int eid);
	public List<Employee> findAll();
	public List<Employee> findByCondition(String condition);
}
