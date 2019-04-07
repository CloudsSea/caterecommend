package edu.njtu.model;

import org.springframework.stereotype.Component;

/**
 * 实战课程访问数量实体类
 */
@Component
public class CourseClickCount {


    //返回到前端的数据变量名要用name value 因为demo.html里面展示时候用的这两个变量接收数据
    private String name;
    private long value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}

