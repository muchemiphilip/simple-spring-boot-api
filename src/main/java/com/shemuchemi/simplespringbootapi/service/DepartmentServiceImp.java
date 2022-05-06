package com.shemuchemi.simplespringbootapi.service;

import com.shemuchemi.simplespringbootapi.entity.Department;
import com.shemuchemi.simplespringbootapi.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department deleteDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

}
