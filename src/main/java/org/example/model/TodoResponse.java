package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {

    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoItem todoItem) {
        this.id = todoItem.getId();
        this.title = todoItem.getTitle();
        this.order = todoItem.getOrder();
        this.completed = todoItem.getCompleted();

        this.url = "http://localhost:8080/" + this.id;
    }
}
