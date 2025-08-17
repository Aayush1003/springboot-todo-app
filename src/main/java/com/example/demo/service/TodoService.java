package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Todo;


@Service
public class TodoService {

//	
//	@Autowired
//	private TodoService todoService;

	
	private List<Todo> list = new ArrayList<>();
	
	public Todo create(Todo todo) {
		list.add(todo);
		return todo;
		
	}
	
	
	
	public Todo createTodo(@RequestBody Todo todo) {
		return create(todo);
	}



	public List<Todo> getList() {
		// TODO Auto-generated method stub
		return list;
	}
	
	
	
	
	
	
}
