package com.springmvcproject.spmvcdemo.controller;

import com.springmvcproject.spmvcdemo.model.Employee;
import com.springmvcproject.spmvcdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/index")
    public String check(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    @PostMapping("/saveEmployee")
    public String saveEmp(@ModelAttribute Employee employee){
        employeeRepo.save(employee);
        return "welcome";
    }

    @PostMapping("/login")
    public String loginEmp(@ModelAttribute Employee employee){
        if (employee.getUserId().equals("Admin")&&employee.getPassword().equals("Admin123")){
            return "welcome2";
        }
        return "notfound";
    }

}
