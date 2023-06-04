package com.template.domain.task;

import java.time.LocalDateTime;
import javax.persistence.*;
import com.template.domain.common.GeneralId;

/**
 * タスクエンティティ.
 */
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_id_seq")
    @SequenceGenerator(name = "task_id_seq", sequenceName = "task_id_seq", allocationSize = 1)
    private GeneralId id;
    @Column(name = "name", nullable = false)
    private TaskName name;
    @Column(name = "created_date_time", nullable = false)
    private LocalDateTime createdDateTime;

    /**
     * コンストラクタ.
     *
     * @param id              タスクid
     * @param name            タスク名
     * @param createdDateTime 作成日時
     */
    public Task(GeneralId id, TaskName name, LocalDateTime createdDateTime) {
        if (createdDateTime == null) {
            throw new IllegalArgumentException("作成日時はnull、空文字、空白文字は許可されていません");
        }

        this.id = id;
        this.name = name;
        this.createdDateTime = createdDateTime;
    }

}