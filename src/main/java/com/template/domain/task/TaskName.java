package com.template.domain.task;

/**
 * タスク名.
 */
public class TaskName {

	private String name;

	/**
	 * コンストラクタ.
	 */
	private TaskName(String name) {
		this.name = name;
	}

	/**
	 * タスク名を生成する.
	 * 
	 * @param name タスク名
	 * @return 生成されたタスク名
	 */
	static TaskName of(String name) {
		TaskName taskName = new TaskName(name);
		if (taskName.isBlank()) {
			throw new IllegalArgumentException("タスク名はnull、空文字、空白文字は許可されていません");
		}
		return taskName;
	}

	/**
	 * 値がnull, 空文字, 空白文字のいずれかかを返す.
	 */
	private boolean isBlank() {
		if (name.isBlank()) {
			return true;
		}
		return false;
	}
}
