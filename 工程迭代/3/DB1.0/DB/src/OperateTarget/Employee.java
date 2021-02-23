package OperateTarget;

public class Employee {
	private int eid;
	private String ename;
	private int elevel;
	private String etel;
	private String password;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", elevel=" + elevel + ", etel=" + etel + "]";
	}
        public String idToString(){
            return eid+"";
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
	public int getElevel() {
		return elevel;
	}
	public void setElevel(int elevel) {
		this.elevel = elevel;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
