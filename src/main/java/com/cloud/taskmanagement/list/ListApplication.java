package com.cloud.taskmanagement.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ListApplication {

	@Autowired
	ListRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListApplication.class, args);
	}

/*
	@Bean
	CommandLineRunner runner(){
		return args -> {

			userRepository.deleteAll();
			TaskBean taskBean = new TaskBean("Sudeep",false);
			TaskBean taskBean1 = new TaskBean("Sakshi",false);
			TaskBean taskBean2= new TaskBean("Dhruv",false);
			TaskBean taskBean3 = new TaskBean("Priyam",false);
			TaskBean taskBean4 = new TaskBean("Riya",false);
			List<TaskBean> list  = new ArrayList<>();
			list.add(taskBean);
			list.add(taskBean1);
			list.add(taskBean2);
			list.add(taskBean3);
			list.add(taskBean4);
			userRepository.save(new ListBean("123",list));
			userRepository.save(new ListBean("442",list));

		};
	}*/
}
