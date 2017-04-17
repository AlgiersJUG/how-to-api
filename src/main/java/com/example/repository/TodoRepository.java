package com.example.repository;

import com.example.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/14/17.
 */
public interface TodoRepository extends JpaRepository<Todo,Long>{
}
