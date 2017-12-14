package cz.uhk.ppro.rest.controllers;


import cz.uhk.ppro.rest.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public void saveStudent(@RequestBody Student student) {
        System.out.println("Saving student " + student.getLastName());
    }
}
