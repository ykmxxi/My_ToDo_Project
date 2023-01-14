package org.example.service;

import java.util.List;

import lombok.AllArgsConstructor;

import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoEntity add(TodoRequest request) {
        return null;
    }

    public TodoEntity searchById(Long id) {
        return null;
    }

    public List<TodoEntity> searchAll() {
        return null;
    }

    public TodoEntity updateById(Long id) {
        return null;
    }

    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }
}
