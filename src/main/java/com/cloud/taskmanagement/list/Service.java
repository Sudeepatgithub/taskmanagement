package com.cloud.taskmanagement.list;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    ListRepository listRepository;

    public ListBean getAllTasks(String id){
        return listRepository.findById(id);
    }

    public void createNewList(String id){
        List<TaskBean> list = new LinkedList<>();
        ListBean listBean = new ListBean(id,list);
        listRepository.save(listBean);
    }

    public void addTask(String id, TaskBean task){
        ListBean listBean = listRepository.findById(id);
        listBean.tasks.add(task);
        listRepository.deleteById(id);
        listRepository.save(listBean);
    }
    public void deleteTask(String listId,int taskNumber){
        ListBean listBean = listRepository.findById(listId);
        listBean.getTasks().remove(taskNumber);
        listRepository.deleteById(listId);
        listRepository.save(listBean);
    }
}
