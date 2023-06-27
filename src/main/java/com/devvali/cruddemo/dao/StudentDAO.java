package com.devvali.cruddemo.dao;

import com.devvali.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);


    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findBylastName(String theLastName);


    void update(Student theStudent);

}
