package org.example.service;

import java.util.List;

import lombok.AllArgsConstructor;

import org.example.model.TodoItem;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoItem add(TodoRequest request) {
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle(request.getTitle());
        todoItem.setOrder(request.getOrder());
        todoItem.setCompleted(request.getCompleted());

        return this.todoRepository.save(todoItem);
    }

    public TodoItem searchById(Long id) {
        return this.todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<TodoItem> searchAll() {
        return this.todoRepository.findAll();
    }

    public TodoItem updateById(Long id, TodoRequest request) {
        TodoItem todoItem = this.searchById(id);

        if (request.getTitle() != null) {
            todoItem.setTitle(request.getTitle());
        }
        if (request.getOrder() != null) {
            todoItem.setOrder(request.getOrder());
        }
        if (request.getCompleted() != null) {
            todoItem.setCompleted(request.getCompleted());
        }

        return this.todoRepository.save(todoItem);
    }

    public void deleteById(Long id) {
        this.todoRepository.deleteById(id);
    }

    public void deleteAll() {
        this.todoRepository.deleteAll();
    }
}
