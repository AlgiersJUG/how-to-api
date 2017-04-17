package com.example.service;

import com.example.domain.Todo;
import com.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */
@Service
public class TodoService {

    @Autowired
    public TodoMapper mapper;

    @Autowired
    TodoRepository todoRepository;

    public List<TodoDto> findAll() {
        return mapper.toDtos(todoRepository.findAll());
    }

    public TodoDto save(TodoDto todoDto) {
        Todo todo = mapper.fromDto(todoDto);
        Todo savedTodo = todoRepository.save(todo);
        return mapper.fromDomain(savedTodo);
    }

    public TodoDto findById(Long id) {
        Todo one = todoRepository.findOne(id);
        if (one == null) {
            throw new TodoBusinessException("Todo with ID " + id + " not found");
        }
        return mapper.fromDomain(one);
    }
}
