package com.tricon.Student.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.Student.dao.IStudentDao;
import com.tricon.Student.model.Student;
import com.tricon.Student.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentDao studentDao; 
	

	@Override
	public List<Student> getAllUsers() {
		// TODO Auto-generated method stub
		return studentDao.getName();
	}

	@Override
	public Student getUser(int id) {
		// TODO Auto-generated method stub
		return studentDao.getName(id);
	}

}
