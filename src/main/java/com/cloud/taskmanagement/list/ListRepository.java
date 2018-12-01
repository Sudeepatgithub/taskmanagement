package com.cloud.taskmanagement.list;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ListRepository extends MongoRepository<ListBean,Integer> {

     ListBean findById(String id);

     void deleteById(String integer);
}
