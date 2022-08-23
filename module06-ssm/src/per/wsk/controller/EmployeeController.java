package per.wsk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import per.wsk.entity.Employee;
import per.wsk.service.EmployeeService;


import java.util.List;
import java.util.Map;

/**
 * @Author wb_weishaokang
 * @date 2021/11/23 11:58 上午
 * @description
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getemps")
    public String emps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps", emps);
        return "list";
    }

}
