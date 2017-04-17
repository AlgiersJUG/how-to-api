package com.example.web.rest;

import com.example.service.TodoDto;
import com.example.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */
@RestController
@RequestMapping("/api/v1")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todos")
    ResponseEntity<List<TodoDto>> findAllTodos() {
        return ResponseEntity.ok().body(todoService.findAll());
    }

    @GetMapping("/todos/{id}")
    ResponseEntity<TodoDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(todoService.findById(id));
    }

    @PostMapping("/todos")
    ResponseEntity<TodoDto> create(@RequestBody TodoDto todoDto) throws URISyntaxException {
        TodoDto dto = todoService.save(todoDto);
        return ResponseEntity.created(new URI("/api/v1/todos/" + dto.getId())).body(dto);
    }
}
