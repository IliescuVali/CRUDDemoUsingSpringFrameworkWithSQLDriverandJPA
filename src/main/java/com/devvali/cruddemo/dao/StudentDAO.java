package com.devvali.cruddemo.dao;

import com.devvali.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);


    Student findById(Integer id);

    List<Student> findAll();

}
