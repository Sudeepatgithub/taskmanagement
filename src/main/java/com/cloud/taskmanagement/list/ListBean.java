package com.cloud.taskmanagement.list;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "lists")
public class ListBean {

    @Id
    String id;
    List<TaskBean> tasks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TaskBean> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskBean> tasks) {
        this.tasks = tasks;
    }

    public ListBean(String id, List<TaskBean> tasks){
        this.id = id;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return  id + " "+ tasks.toString();
    }
}
