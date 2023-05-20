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

コンテナを停止
```
docker-compose stop
```

コンテナを削除
```
docker-compose down
```

