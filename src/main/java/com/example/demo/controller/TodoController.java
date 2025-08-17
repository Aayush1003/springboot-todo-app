package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;


@RestController
@RequestMapping("/todos")
public class TodoController {

	//create Todo
	@Autowired
	private TodoService todoService;
	
	
	@PostMapping
	public Todo createToDo(@RequestBody Todo todo) {
		
		return todoService.create(todo);
		
	}
	
	//get all toDo
	@GetMapping
	public List<Todo> getAll(){
		return todoService.getList();
	}
	
	
	
}
