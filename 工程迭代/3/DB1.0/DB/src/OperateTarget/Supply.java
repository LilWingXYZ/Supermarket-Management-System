package OperateTarget;
import java.util.Date;
public class Supply {
	private int sid;
	private int gid;
	private Date supdate;
	private int gnum;
	@Override
	public String toString() {
		return "Supply [sid=" + sid + ", gid=" + gid + ", supdate=" + supdate + ", gnum=" + gnum + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Date getSupdate() {
		return supdate;
	}
	public void setSupdate(Date supdate) {
		this.supdate = supdate;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
}
