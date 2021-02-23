package OperateTarget;
import java.lang.*;
public class Base {
	private Integer bid;
	private String baddr;
	private String bname;
	@Override
	public String toString() {
		return "Base [bid=" + bid + ", baddr=" + baddr + ", bname=" + bname + "]";
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBaddr() {
		return baddr;
	}
	public void setBaddr(String baddr) {
		this.baddr = baddr;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
