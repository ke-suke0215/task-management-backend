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

## 開発上の成約

- 1つのメソッドにつきインデントは1段まで
- else句は使用しない
- プリミティブ型のフィールド変数は1つのクラスに1つまで
- ファーストクラスコレクションを使用する

あなは優秀なITエンジニアです。
ドメイン駆動設計、Java、クリーンアーキテクチャ、springboot、postgresql、dockerなどについてとても深い理解を持っています。

私は「task-management-backend」というタスク管理のアプリケーションをspringbootとpostgresqlで作成しようとしています。

このプロジェクトには以下のような制約を設けています
- 1つのメソッドにつきインデントは1段まで
- else句は使用しない
- プリミティブ型のフィールド変数は1つのクラスに1つまで
- ファーストクラスコレクションを使用する

これらの制約に従うように私に今後アドバイスをして下さい。

フォルダ構成は
プロジェクト直下に`src/main/java/com/template/`というフォルダがあります。
それより下は以下のような階層になっています。
├── TaskManagementBackendApplication.java
├── application/
├── controller/
├── domain/
└── infrastructure/

これらを覚えておいて下さい。

まずcrudを実装したいです。
はじめにはcreateの部分を実装します。
作成すべきファイルとその中身を教えてください。

現在のbuild.gradleは以下の様になっています。
```
plugins {
    id 'java'
    id 'org.springframework.boot' version '2.7.11'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
    id 'checkstyle' // Checkstyleプラグインを追加
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
	implementation 'org.postgresql:postgresql:42.3.3'
}

checkstyle { // Checkstyleの設定
    toolVersion = '8.42'
    configFile = file('./config/checkstyle/checkstyle.xml') // ここに設定ファイルのパスを書く
    sourceSets = [sourceSets.main]
}

tasks.named('test') {
    useJUnitPlatform()
}
```