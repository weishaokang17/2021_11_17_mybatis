package per.wsk.dao;


import per.wsk.entity.Employee;
import per.wsk.entity.OraclePage;

import java.util.List;

public interface EmployeeMapper {

	public Employee getEmpById(Integer id);

	public List<Employee> getEmps();

	public Long addEmp(Employee employee);

	public void getPageByProcedure(OraclePage page);

}
