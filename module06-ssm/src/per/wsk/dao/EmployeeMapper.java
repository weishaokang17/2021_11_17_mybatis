package per.wsk.dao;


import per.wsk.entity.Employee;

import java.util.List;



public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	

}
