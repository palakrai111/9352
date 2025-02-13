package in.sp.crmproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.sp.crmproject.entity.Employee;

@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee,Integer>
{
   void deleteByEmail(String email);
  // List<Employee> findByEmail(String email);
   Employee findByEmail(String email);
}
