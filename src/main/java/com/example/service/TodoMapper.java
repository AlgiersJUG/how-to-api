package com.example.service;

import com.example.domain.Todo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */

@Mapper(componentModel = "spring")
public interface TodoMapper {

    List<TodoDto> toDtos(List<Todo> todos);

    Todo fromDto(TodoDto todoDto);

    TodoDto fromDomain(Todo savedTodo);
}
