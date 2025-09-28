package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    //Find all students
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    //Find student with id
    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }
    //Create new student
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    //Update student by id
    public Student updateStudent(Long id, Student studentDetails) {
        return studentRepository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setAge(studentDetails.getAge());
            student.setEmail(studentDetails.getEmail());
            return studentRepository.save(student);
        }).orElseThrow(()->new RuntimeException("Student not found with id: "+id));
    }
    //Delete student by id
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
