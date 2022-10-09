package Encapsulation;

public class EmployeeDetails 
{
	private String empname;
	private int empid;
	private double empSalaray;
	public String getEmpname()
	{
		return empname;
	}
	public void setEmpname(String empnames)
	{
		empname=empnames;
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public double getEmpSalary()
	{
		return empSalaray;
	}
	public void setEmpSalary(double empSalary)
	{
		this.empSalaray=empSalary;
	}

}
