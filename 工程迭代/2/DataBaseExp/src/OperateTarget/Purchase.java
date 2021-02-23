package OperateTarget;
import java.util.Date;;
public class Purchase {
	private int gid;
	private int eid;
	private int sid;
	private int gnum;
	private Date purdate;
	
	@Override
	public String toString() {
		return "Purchase [gid=" + gid + ", eid=" + eid + ", sid=" + sid + ", gnum=" + gnum + ", purdate=" + purdate
				+ "]";
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public Date getPurdate() {
		return purdate;
	}
	public void setPurdate(Date purdate) {
		this.purdate = purdate;
	}
}
