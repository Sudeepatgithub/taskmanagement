package com.cloud.taskmanagement.list;

import org.springframework.context.annotation.Bean;

public class TaskBean {

    public TaskBean(){}

    public TaskBean(String name, boolean isChecked) {
        this.isChecked = isChecked;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    String name;

    boolean isChecked;

    @Override
    public String toString() {
        return name +"  "+ isChecked;
    }
}
