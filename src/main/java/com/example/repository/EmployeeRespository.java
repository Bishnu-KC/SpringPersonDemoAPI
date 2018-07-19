package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



import com.example.model.Employee;

@Repository
public class EmployeeRespository {
	@Autowired
	JdbcTemplate jdbc;
	public List<Employee> findAll()
	{
		return jdbc.query("SELECT * FROM EMPLOYEE", new BeanPropertyRowMapper(Employee.class));
	}
	
	
	public Employee fineOne(int empId)
	{
		return (Employee) jdbc.queryForObject("select * from employee where empId=?", 
				new Object[] { empId },
				new BeanPropertyRowMapper(Employee.class));
	}
	
	public int deleteOne(int empId)
	{
		return jdbc.update("delete from employee where empId=?", new Object[] { empId });
	}
	
	public Object addOne(Employee employee)
	{
		return jdbc.update("insert into employee (empId,fname,,lName,dptId,hdate,activities)" 
							+ "values(?,?,?,?,?,?)",
				new Object[] { employee.getEmpId(),employee.getfName(),employee.getlName(),employee.getDptId(),employee.getHdate(),employee.isActivities()
						 });
	}
	
	public int UpdateOne(Employee employee)
	{
		return jdbc.update(
				"	update employee	" + "	set fName =?, lName=?,dptId=?,hdate=?,activities=? 	" + "	where empId=?	",
				new Object[] { employee.getfName(), employee.getlName(),employee.getDptId(),employee.getHdate(),
						employee.isActivities()

				});
	
	}
	
	class EmployeeRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			Employee employee = new Employee();
			employee.setEmpId(rs.getInt("empId"));
			employee.setfName(rs.getString("fName"));
			employee.setlName(rs.getString("lName"));
			employee.setDptId(rs.getInt("dptId"));
			employee.setHdate(rs.getDate("hdate"));
			employee.setActivities(rs.getBoolean("activities"));
			
			return employee;
		}
		
	}

	}

