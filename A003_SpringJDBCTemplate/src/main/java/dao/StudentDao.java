package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import model.Student;

public class StudentDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addStudent(Student std) {
		String qry="insert into student values(0,'"+std.getUname()+"','"+std.getEmail()+"','"+std.getPass()+"')";
		jdbcTemplate.update(qry);
		System.out.println("Data inserted!!");
	}

	public void updateStudent(Student std) {
		String qry="update student set pass='"+std.getPass()+"' where id='"+std.getId()+"'";
		jdbcTemplate.update(qry);
		System.out.println("Data Updated!!");
	}

	public void deleteStudent(int i) {
		String qry="delete from student where id="+i+"";
		jdbcTemplate.update(qry);
		System.out.println("Data deleted!!");
	}

	public List<Student> viewAll() {
		
		return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				ArrayList<Student> al=new ArrayList<Student>();
				while(rs.next()) {
					Student st=new Student();
					st.setId(rs.getInt(1));
					st.setUname(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setPass(rs.getString(4));
					al.add(st);
				}
				return al;
			}
		});
	}
	
}
