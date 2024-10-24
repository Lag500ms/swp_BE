package com.SWP391_Project.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response extends Throwable {
    private boolean success;
    private String message;
    private Object data;
}
