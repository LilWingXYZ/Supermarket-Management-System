package OperateTarget;

public class Rack {
	private int rid;
	private String raddr;
	@Override
	public String toString() {
		return "RackStore [rid=" + rid + ", raddr=" + raddr + "]";
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRaddr() {
		return raddr;
	}
	public void setRaddr(String raddr) {
		this.raddr = raddr;
	}
}
