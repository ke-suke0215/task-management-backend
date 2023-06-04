package com.template.domain.common;

/**
 * idを表す.
 */
public class GeneralId {
	private long id;

	/**
	 * コンストラクタ.
	 */
	private GeneralId(long id) {
		this.id = id;
	}

	/**
	 * idを生成する.
	 * 
	 * @param id id
	 * @return 生成されたid
	 */
	GeneralId of(long id) {
		return new GeneralId(id);
	}
}
