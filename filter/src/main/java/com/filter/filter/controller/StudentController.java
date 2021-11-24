package com.filter.filter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.filter.filter.entity.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private List<Student> list = new ArrayList<>();
    {
        list.add(new Student(1, "mihir", "12th"));
        list.add(new Student(2, "salu", "11th"));
    }

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return list;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {

        return list.stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @DeleteMapping("/{id}")
    public List<Student> delete(@PathVariable int id) {
        return list.stream().filter(e -> e.getId() != id).collect(Collectors.toList());

    }

    @PutMapping("/{id}")
    public List<Student> update(@PathVariable int id) {

        return list.stream().map(e -> {
            if (e.getId() == id) {
                e.setName("raju");
                e.setStandared("11th");
            }
            return e;
        }

        ).collect(Collectors.toList());
    }

}
