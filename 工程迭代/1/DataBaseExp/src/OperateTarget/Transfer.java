package OperateTarget;
import java.util.Date;
public class Transfer {
	private int eid;
	private int gid;
	private int bid;
	private int rid;
	private int gnum;
	private Date transdate;
	@Override
	public String toString() {
		return "Transfer [eid=" + eid + ", gid=" + gid + ", bid=" + bid + ", rid=" + rid + ", gnum=" + gnum
				+ ", transdate=" + transdate + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public Date getTransdate() {
		return transdate;
	}
	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}
	
}
