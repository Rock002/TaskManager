package com.example.TaskManager.repository;


import com.example.TaskManager.models.Task;
import com.example.TaskManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAuthor(User author);
}
