package OperateTarget;

public class Producer {
	private int pid;
	private String paddr;
	private String pname;
	private String ptel;
	
	@Override
	public String toString() {
		return "Producer [pid=" + pid + ", paddr=" + paddr + ", pname=" + pname + ", ptel=" + ptel + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtel() {
		return ptel;
	}
	public void setPtel(String ptel) {
		this.ptel = ptel;
	}
}
