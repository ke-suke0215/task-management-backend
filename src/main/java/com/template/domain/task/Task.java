package com.template.domain.task;

import java.time.LocalDateTime;

import com.template.domain.common.Id;

/**
 * タスクエンティティ.
 */
public class Task {
	private Id id;
	private TaskName name;
	private LocalDateTime createdDateTime;

	/**
	 * コンストラクタ.
	 * 
	 * @param id              タスクid
	 * @param name            タスク名
	 * @param createdDateTime 作成日時
	 */
	public Task(Id id, TaskName name, LocalDateTime createdDateTime) {
		if (createdDateTime == null) {
			throw new IllegalArgumentException("タスク名はnull、空文字、空白文字は許可されていません");
		}

		this.id = id;
		this.name = name;
		this.createdDateTime = createdDateTime;
	}

}