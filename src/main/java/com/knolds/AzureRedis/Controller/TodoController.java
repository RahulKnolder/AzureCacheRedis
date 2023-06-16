package com.knolds.AzureRedis.Controller;


import com.knolds.AzureRedis.Model.Todo;
import com.knolds.AzureRedis.reposetory.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/rahul")
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @GetMapping("/sinha")
    public Iterable<Todo> findAllTodos() {
        return todoRepository.findAll();
    }
}
