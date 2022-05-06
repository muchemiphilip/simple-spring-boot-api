package com.shemuchemi.simplespringbootapi.repository;


import com.shemuchemi.simplespringbootapi.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This class extends the JPA repository itself
 * because Jpa gives us different methods that we can use directly for
 * interecting with our entities and database itself.
 */

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentName(String departmentName);

    Department findByDepartmentNameIgnoreCase(String departmentName);
}
