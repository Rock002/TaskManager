package com.example.TaskManager.services;

import com.example.TaskManager.models.Task;
import com.example.TaskManager.repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void returnListOfTasks () {
        Mockito.when(taskService.getListOfTask()).thenReturn(getTasks());

        List<Task> result = taskService.getListOfTask();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(getTasks().get(0), result.get(0));
        Assertions.assertEquals(getTasks().get(1), result.get(1));
    }

    private List<Task> getTasks() {
        Task firstTask = new Task();
        Task secondTask = new Task();

        firstTask.setId(1L);
        firstTask.setTitle("first");
        firstTask.setDescription("firstTestTask");

        firstTask.setId(2L);
        firstTask.setTitle("second");
        firstTask.setDescription("secondTestTask");

        return List.of(firstTask, secondTask);

    }
}
