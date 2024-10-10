package org.example.restapi.controllers;

import org.example.restapi.CustomPojo;
import org.example.restapi.services.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
//use RestController instead of Controller inorder to remove @ResponseBody annotations
public class ApiController {

    //to call a service inside controller
    //we will use AutoWired
    private final Attendance attendance;

    @Autowired
    public ApiController(Attendance attendance) {
        this.attendance = attendance;
    }

//  @RequestMapping(value ="/getAPI",method = RequestMethod.GET)
    @GetMapping(value ="/getAPI")
    public List<CustomPojo> pojosList(){
        return this.attendance.getListOfPojo();
    }

    @GetMapping(value = "/getAPI/{id}")
    public CustomPojo pojosById(@PathVariable("id") int id){
        return this.attendance.getPojo(id);
    }

}
