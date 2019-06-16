package training.demo.model;

public class Employee {
	
	private int eid;
	private String ename;
	private double monthlySal;
	
	
	
	public Employee() {
		super();
	}



	public Employee(int eid, String ename, double monthlySal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.monthlySal = monthlySal;
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getMonthlySal() {
		return monthlySal;
	}



	public void setMonthlySal(double monthlySal) {
		this.monthlySal = monthlySal;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", monthlySal=" + monthlySal + "]";
	}
	
	
	
	
	

}
