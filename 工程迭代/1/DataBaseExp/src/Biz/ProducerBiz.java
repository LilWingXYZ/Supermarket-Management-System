package Biz;
import java.util.List;
import OperateTarget.*;
public interface ProducerBiz {
	public boolean add(Producer p);
	public boolean delete(int pid);
	public boolean update(Producer p);
	public Producer findByID(int pid);
	public List<Producer> findAll();
	public List<Producer> findByCondition(String condition);
}
