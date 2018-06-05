package cn.ssm.service;

import java.util.List;
import cn.ssm.po.Student;

public interface StudentService {
	
	List<Student> getAllStudent() throws Exception;
	
	Student getStudentById(String sid) throws Exception;
	
	void deleteStudentById(String sid) throws Exception;
	
	void updateStudent(Student stu) throws Exception;
	
	boolean addStudent(Student stu) throws Exception;
}
