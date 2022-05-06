package com.shemuchemi.simplespringbootapi.controller;

import com.shemuchemi.simplespringbootapi.entity.Department;
import com.shemuchemi.simplespringbootapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is the controller layer responsible for routing purposes.
 */

@RestController
public class DepartmentController {

    //Dependency Injection and Inversion of Control from SpringFramework.
    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable ("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public Department deleteDepartmentById(@PathVariable ("id") Long departmentId){
        return departmentService.deleteDepartmentById(departmentId);
    }
}
