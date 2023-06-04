package com.template.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.template.domain.task.Task;
import com.template.domain.task.TaskRepository;

/**
 * Jpaを利用したタスクリポジトリ.
 * 
 * @author isodakeisuke
 */
public interface JpaTaskRepository extends JpaRepository<Task, Long>, TaskRepository {

}
