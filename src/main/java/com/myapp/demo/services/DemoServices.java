package com.myapp.demo.services;

import com.myapp.demo.enums.SchoolSet;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class DemoServices{


    List < SchoolSet > schoolSets = Arrays.asList(SchoolSet.values());
    public DemoServices(){

    }

    public List < SchoolSet > getSchoolSet() {
        return schoolSets;
    }
}
