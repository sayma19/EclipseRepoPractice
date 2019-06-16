package training.demo.service;

import training.demo.model.Employee;

public class EmployeeService {
	
	
	public double calculateYearlySalary(Employee e) {
		
		
		return e.getMonthlySal()*12;
		

	}
	
	/**
	 * calculate Apprisal
	 * @param e employee
	 * @return Apprisal double value
	 */
	public double calculateApprisal(Employee e) {
		
		if(e.getMonthlySal()>10000) {
			
			return 500;
		}else {
			
			return 1000;
		}
		

		
		
	}

}
