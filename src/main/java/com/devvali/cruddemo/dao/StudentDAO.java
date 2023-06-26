package com.devvali.cruddemo.dao;

import com.devvali.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);


    Student findById(Integer id);

}
