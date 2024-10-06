package com.hari2030.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari2030.todo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>
{

}
