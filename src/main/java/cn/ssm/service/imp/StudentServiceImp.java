package cn.ssm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.StudentMapper;
import cn.ssm.po.Student;
import cn.ssm.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> getAllStudent() throws Exception {

		return studentMapper.getAllStudent();
	}
	
	@Override
	public Student getStudentById(String sid) throws Exception {

		return studentMapper.getStudentById(sid);
	}

	@Override
	public void deleteStudentById(String sid) throws Exception {

		studentMapper.deleteStudentById(sid);
	}

	@Override
	public void updateStudent(Student stu) throws Exception {

		studentMapper.updateStudent(stu);
	}

	@Override
	public boolean addStudent(Student stu) throws Exception {
		
		Student s = getStudentById(stu.getSid());
		if(s != null) {
			return false;
		}
		
		studentMapper.addStudent(stu);
		return true;
	}

	
	
}
