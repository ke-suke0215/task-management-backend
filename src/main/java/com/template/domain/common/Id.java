package com.template.domain.common;

/**
 * idを表す.
 */
public class Id {
	private long id;

	/**
	 * コンストラクタ.
	 */
	private Id(long id) {
		this.id = id;
	}

	/**
	 * idを生成する.
	 * 
	 * @param id id
	 * @return 生成されたid
	 */
	Id of(long id) {
		return new Id(id);
	}
}
