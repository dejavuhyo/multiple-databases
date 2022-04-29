# Spring Boot Multiple Databases

## 1. 설명
Spring Boot로 여러 데이터 소스를 구성하고 사용하는 방법이다.

## 2. 개발환경

* OpenJDK 11

* spring-boot 2.6.7

* spring boot mybatis 2.2.2

* Oracle 12c

* PostgreSQL 13.5

## 3. DatabaseConfig

* PrimaryDatabaseConfig: Oracle 접속 설정

* SecondaryDatabaseConfig: PostgreSQL 접속 설정

## 4. Mapper

* PrimaryMapper: Oracle Mapper 설정

* SecondaryMapper: PostgreSQL Mapper 설정

## 5. Rest API 실행

### 1) Oracle 데이터 조회

* GET
  - http://localhost:8080/oracleList

### 2) PostgreSQL 데이터 조회

* GET
  - http://localhost:8080/postgresqlList
