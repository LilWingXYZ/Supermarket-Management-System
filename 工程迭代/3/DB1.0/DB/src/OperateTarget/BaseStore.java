package OperateTarget;

public class BaseStore {
	private int bid;
	private int gid;
	private int gnum;
	@Override
	public String toString() {
		return "BaseStore [bid=" + bid + ", gid=" + gid + ", gnum=" + gnum + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
