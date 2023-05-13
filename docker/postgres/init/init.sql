-- DB作成
CREATE DATABASE task_management;
-- 作成したDBに接続
\c task_management;
-- テーブル作成
DROP TABLE IF EXISTS task;
CREATE TABLE task (
	id integer NOT NULL PRIMARY KEY,
	name char(100) NOT NULL,
	created_date_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
-- ID用シーケンス作成
CREATE SEQUENCE task_id_seq START 1;
-- サンブルデータの登録
INSERT INTO task (id, name) VALUES(nextval('task_id_seq'), 'sample task');