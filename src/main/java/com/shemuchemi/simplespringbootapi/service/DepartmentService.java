package com.shemuchemi.simplespringbootapi.service;

import com.shemuchemi.simplespringbootapi.entity.Department;

import java.util.List;

public interface DepartmentService {

     Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    Department deleteDepartmentById(Long departmentId);
}
