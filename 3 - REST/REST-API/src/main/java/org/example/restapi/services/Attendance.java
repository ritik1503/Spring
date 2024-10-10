package org.example.restapi.services;

import org.example.restapi.CustomPojo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Attendance {

    public List<CustomPojo> getListOfPojo()
    {
        List<CustomPojo> listOfPojo = new ArrayList<>();
        listOfPojo.add(new CustomPojo(1, "January", "January"));
        listOfPojo.add(new CustomPojo(2, "February", "February"));
        listOfPojo.add(new CustomPojo(3, "March", "March"));
        return listOfPojo;
    }
    public CustomPojo getPojo(int id)
    {
        return new CustomPojo(id, "October", "LOL");
    }
}
