package com.example.TaskManager.controllers;

import com.example.TaskManager.models.Task;
import com.example.TaskManager.models.User;
import com.example.TaskManager.services.TaskService;
import com.example.TaskManager.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.SecureRandom;
import java.util.ArrayList;

@Controller
public class TaskController {
    private final TaskService taskService;
    private final UserService userService;

    public TaskController(TaskService taskService, UserService userService) {
        this.taskService = taskService;
        this.userService = userService;
    }


    @GetMapping("/")
    public String mainPage(Model model, Authentication authentication) {
        User currentUser = userService.findByUsername(authentication.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        model.addAttribute("tasks", taskService.getListOfTask(currentUser));
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
    public String addTask(Task task, Authentication authentication) {
        String username = authentication.getName();
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        task.setAuthor(user);
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
