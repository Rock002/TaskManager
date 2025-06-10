package com.example.TaskManager.services;

import com.example.TaskManager.models.Task;
import com.example.TaskManager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    public List<Task> getListOfTask() {
        List<Task> taskList = new ArrayList<>();
        taskList = taskRepository.findAll();
        return taskList;
    }
}
