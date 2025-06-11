package com.example.TaskManager.controllers;

import com.example.TaskManager.models.Task;
import com.example.TaskManager.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.SecureRandom;

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

    @GetMapping("/product/{id}")
    public String productObject(@PathVariable Long id, Model model) {
        model.addAttribute("object", taskService.getTaskById(id));
        return "product";
    }

    @GetMapping("/product/{id}/change")
    public String change(@PathVariable Long id, Model model) {
        model.addAttribute("object", taskService.getTaskById(id));
        return "change";
    }

    @PostMapping("/product/open/{id}")
    public String poductObjectPost(@PathVariable Long id) {
        return "redirect:/product/{id}";
    }

    @PostMapping("/create")
    public String addTask(Task task) {
        taskService.saveTask(task);
        return "redirect:/";
    }

    @PostMapping("/product/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return "redirect:/";
    }

    @PostMapping("/product/{id}/changeform")
    public String changeForm(@PathVariable Long id) {
        return "redirect:/product/{id}/change";
    }

    @PostMapping("/product/{id}/savechange")
    public String saveChange(Task task) {
        taskService.saveTask(task);
        return "redirect:/";
    }
}
