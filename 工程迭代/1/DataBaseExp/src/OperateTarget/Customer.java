package OperateTarget;

public class Customer {
	private int cid;
	private String ctel;
	private String cname;
	private String money;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", ctel=" + ctel + ", cname=" + cname + ", money=" + money + "]";
	}
	
}
