package edu.njtu.controller;

import edu.njtu.service.SparkTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SparkController {
    @Autowired
    private SparkTestService sparkTestService;

    @RequestMapping("/demo/spark")
    public Map<String, Object> sparkDemo() {
//        return sparkTestService.sparkDemo();
        return null;
    }
}
