package com.cloud.taskmanagement.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list/{id}" ,method = RequestMethod.GET )
    public ResponseEntity<ListBean> getTasks(@PathVariable String id){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        return new ResponseEntity<>(service.getAllTasks(id),headers, HttpStatus.OK);
    }


    @RequestMapping(value = "/createNew/{id}" ,method = RequestMethod.GET )
    public ResponseEntity createNewList(@PathVariable String id){
        service.createNewList(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/addTask/{id}/{name}" , method = RequestMethod.GET)
    public ResponseEntity addTask(@PathVariable String id,@PathVariable String name){
        TaskBean taskBean = new TaskBean(name,false);
        service.addTask(id,taskBean);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/deleteTask/{id}/{taskNumber}", method = RequestMethod.GET)
    public ResponseEntity deleteTask(@PathVariable String id, @PathVariable String taskNumber){
        service.deleteTask(id,Integer.parseInt(taskNumber));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        return new ResponseEntity<>(headers, HttpStatus.OK);

    }




}
