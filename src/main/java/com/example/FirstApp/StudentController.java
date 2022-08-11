package com.example.FirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ashwin","Dudankar");
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ishan","Ambekar"));
        students.add(new Student("Sanvi","Ambekar"));
        students.add(new Student("Diya","Ambekar"));
        students.add(new Student("Chinnu","Ambekar"));
        return students;
    }
    //@PathVariable annotation
    @GetMapping("/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName")String firstName,
    @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

}
