package training.demo.test;



import org.junit.Test;
import org.testng.AssertJUnit;

import training.demo.model.Employee;
import training.demo.service.EmployeeService;

public class NewTest {
	Employee e=new Employee();
	EmployeeService eservice=new EmployeeService();
	
  @Test
  public void testCalculateYearlySalary() {
	  
	  e.setEid(1);
	  e.setEname("xyz");
	  e.setMonthlySal(10000);
	 double yearlySalary= eservice.calculateYearlySalary(e);
	  AssertJUnit.assertEquals(yearlySalary, 120000D);
  }
  
  @Test
  public void testCalculateApprisalBelow10000() {
	  
	  e.setEid(1);
	  e.setEname("xyz");
	  e.setMonthlySal(2000);
	 double salaryApprisal= eservice.calculateApprisal(e);
	  AssertJUnit.assertEquals(salaryApprisal, 500D);
  }
  
  
  @Test
  public void testCalculateApprisalAbove10000() {
	  
	  e.setEid(1);
	  e.setEname("xyz");
	  e.setMonthlySal(12000);
	 double salaryApprisal= eservice.calculateApprisal(e);
	  AssertJUnit.assertEquals(salaryApprisal, 1000D);
  }
}
