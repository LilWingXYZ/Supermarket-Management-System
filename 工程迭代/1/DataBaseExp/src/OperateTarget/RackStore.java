package OperateTarget;

public class RackStore {
	private int rid;
	private int gid;
	private int gnum;
	@Override
	public String toString() {
		return "RackStore [rid=" + rid + ", gid=" + gid + ", gnum=" + gnum + "]";
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	
}
