package Operation;
import java.util.*;
public interface BasicOPUser {
	public boolean add(int mode);
	public boolean delete(int mode);
	public boolean update(int mode);
	public List select(int mode);
}
