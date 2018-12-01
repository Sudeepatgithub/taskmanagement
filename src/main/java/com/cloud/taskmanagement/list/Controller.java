package com.cloud.taskmanagement.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list/{id}" ,method = RequestMethod.GET )
    public ListBean getTasks(@PathVariable String id){
        return service.getAllTasks(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/createNew/{id}" ,method = RequestMethod.GET )
    public void createNewList(@PathVariable String id){
        service.createNewList(id);
    }

    @RequestMapping(value = "/addTask/{id}/{name}" , method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTask(@PathVariable String id,@PathVariable String name){
        TaskBean taskBean = new TaskBean(name,false);
        service.addTask(id,taskBean);
    }

    @RequestMapping(value = "/deleteTask/{id}/{taskNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTask(@PathVariable String id, @PathVariable String taskNumber){
        service.deleteTask(id,Integer.parseInt(taskNumber));
    }




}
