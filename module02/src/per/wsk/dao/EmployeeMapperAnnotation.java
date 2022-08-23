package per.wsk.dao;

import org.apache.ibatis.annotations.Select;
import per.wsk.entity.Employee;


public interface EmployeeMapperAnnotation {
	
	@Select("select * from tbl_employee where id=#{id}")
	public Employee getEmpById(Integer id);
}
