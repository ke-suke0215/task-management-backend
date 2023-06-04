# task management app

## アプリケーションの起動方法

SpringBoot、PostgreSQLを動かす場合

```sh
./gradlew clean build # アプリケーションのビルド
docker-compose up -d  # コンテナを起動
```

PostgreSQLのみ動かす場合（SpringBootをローカルで起動する場合に使用）

```sh
cd docker/postgres/   # PostgreSQL用のDockerfileがあるディレクトリに移動
docker-compose up -d  # コンテナを起動
```

その他コンテナ操作
```sh
docker-compose stop   # コンテナ停止
docker-compose down   # コンテナ削除
```
## DBへの接続

dockerのインスタンスへ接続
```sh
docker exec -it task-management bash
```

DBへ接続
```sh
psql -U postgres -d task_management
```
