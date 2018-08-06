package com.tricon.Student.dao;

import java.util.List;

import com.tricon.Student.model.Student;

public interface IStudentDao {
	public List<Student> getName();
	public Student getName(int id);
}
