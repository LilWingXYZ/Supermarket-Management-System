package OperateTarget;

public class Supplier {
	private int sid;
	private String saddr;
	private String sname;
	private String stel;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStel() {
		return stel;
	}
	public void setStel(String stel) {
		this.stel = stel;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", saddr=" + saddr + ", sname=" + sname + ", stel=" + stel + "]";
	}
	
}
