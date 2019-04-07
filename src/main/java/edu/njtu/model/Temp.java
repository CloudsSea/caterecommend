package edu.njtu.model;

import edu.njtu.model.ori.Hours;

public class Temp {
    private Hours hours;

    public Hours getHours() {
        return hours;
    }

    public void setHours(Hours hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "hours=" + hours +
                '}';
    }
}
