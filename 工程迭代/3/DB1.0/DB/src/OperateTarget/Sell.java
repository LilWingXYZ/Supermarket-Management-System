package OperateTarget;
import java.util.Date;
public class Sell {
	private int eid;
	private int gid;
	private int cid;
	private int gnum;
	private Date selldate;
	@Override
	public String toString() {
		return "Sell [eid=" + eid + ", gid=" + gid + ", cid=" + cid + ", gnum=" + gnum +  ", selldate=" + selldate + "]";
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public Date getSelldate() {
		return selldate;
	}
	public void setSelldate(Date selldate) {
		this.selldate = selldate;
	}
}
