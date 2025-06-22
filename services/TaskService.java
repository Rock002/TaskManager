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
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void deleteTaskById(Long id) {
        Task delTask = getTaskById(id);
        taskRepository.delete(delTask);
    }

}
