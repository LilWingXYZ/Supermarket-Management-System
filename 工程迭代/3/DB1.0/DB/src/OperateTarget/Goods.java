package OperateTarget;
import java.util.Date;
public class Goods {
	private int gid;
	private String gname;
	private float gpprice;
	private float gsprice;
	private int pid;
	private Date pdate;
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gpprice=" + gpprice + ", gsprice=" + gsprice + ", pid="
				+ pid + ", pdate=" + pdate + "]";
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public float getGpprice() {
		return gpprice;
	}
	public void setGpprice(float gpprice) {
		this.gpprice = gpprice;
	}
	public float getGsprice() {
		return gsprice;
	}
	public void setGsprice(float gsprice) {
		this.gsprice = gsprice;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Date getDatetime() {
		return pdate;
	}
	public void setDatetime(Date datetime) {
		this.pdate = datetime;
	}
}
