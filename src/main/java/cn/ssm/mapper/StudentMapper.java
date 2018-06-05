package cn.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;

import cn.ssm.po.Student;

public interface StudentMapper {
	
	List<Student> getAllStudent() throws Exception;
	
	void deleteStudentById(@Param("sid") String sid) throws Exception;
	
	void updateStudent(Student stu) throws Exception;
	
	Student getStudentById(@Param("sid") String sid) throws Exception;
	
	void addStudent(Student stu) throws Exception;
	
}
