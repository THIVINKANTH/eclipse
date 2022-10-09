package Encapsulation;

public class Connected {

	public static void main(String[] args) {
		EmployeeDetails obj=new EmployeeDetails();
		obj.setEmpname("thivin");
		obj.setEmpid(5799);
		obj.setEmpSalary(3.6);
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpSalary());

	}

}
