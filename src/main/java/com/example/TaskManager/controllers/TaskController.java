package com.example.TaskManager.controllers;

import com.example.TaskManager.models.Task;
import com.example.TaskManager.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("tasks", taskService.getListOfTask());
        return "index";
    }

    @PostMapping("/create")
    public String addTask(Task task) {
        taskService.saveTask(task);
        return "redirect:/";
    }
}
