package OperateTarget;
import java.util.Date;
public class Goods {
	private int gid;
	private String gname;
	private String gpprice;
	private String gsprice;
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
	public String getGpprice() {
		return gpprice;
	}
	public void setGpprice(String gpprice) {
		this.gpprice = gpprice;
	}
	public String getGsprice() {
		return gsprice;
	}
	public void setGsprice(String gsprice) {
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
