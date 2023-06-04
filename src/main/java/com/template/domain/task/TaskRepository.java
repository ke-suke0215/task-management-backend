package com.template.domain.task;

/**
 * タスクリポジトリ.
 * 
 * @author isodakeisuke
 */
public interface TaskRepository {

	/**
	 * タスクを新規作成する.
	 * 
	 * @param task タスク
	 * @return タスクid
	 */
	Task create(Task task);
}
