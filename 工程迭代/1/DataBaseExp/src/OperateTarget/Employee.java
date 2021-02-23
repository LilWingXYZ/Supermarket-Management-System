package OperateTarget;

public class Employee {
	private int eid;
	private String ename;
	private String elevel;
	private String etel;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", elevel=" + elevel + ", etel=" + etel + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getElevel() {
		return elevel;
	}
	public void setElevel(String elevel) {
		this.elevel = elevel;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	
}
