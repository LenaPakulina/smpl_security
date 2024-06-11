### SMPL Security
* Текст данного файла написан Chat GPT. Спасибо ему за это. 

** Данный проект создавался с целью написания взаимодействия микросервисов. Основная программа, использующая данный проект находится [здесь](https://github.com/LenaPakulina/smpl_library_api).
## Обзор
SMPL Security - это веб-приложение на языке Java, разработанное для предоставления базовых функций безопасности, таких как регистрация пользователей, аутентификация и хеширование паролей с использованием солёного хеширования. Приложение использует Spring Boot для своей архитектуры бэкенда.

## Структура проекта
```
smpl_security-master/
├── .gitignore
├── pom.xml
├── src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── api/
│   │           └── smpl_security/
│   │               ├── SmplSecurityApplication.java
│   │               ├── controller/
│   │               │   └── UserController.java
│   │               ├── dto/
│   │               │   ├── UserDTO.java
│   │               │   └── UserDTOMapper.java
│   │               ├── hashing/
│   │               │   └── SaltedHashing.java
│   │               ├── model/
│   │               │   └── User.java
│   │               ├── repository/
│   │               │   └── UserRepository.java
│   │               └── service/
│   │                   └── UserService.java
│   └── resources/
│       ├── application.properties
│       └── tables.sql
└── test/
└── java/
└── com/
└── api/
└── smpl_security/
└── SmplSecurityApplicationTests.java
```

## Необходимые компоненты
Java 8 или выше
Maven 3.6 или выше
SQL база данных (например, MySQL, PostgreSQL)
## Инструкции по установке
Клонировать репозиторий:

```
git clone https://github.com/yourusername/smpl_security.git
cd smpl_security
```
## Настроить базу данных:
Обновите файл application.properties с данными для подключения к вашей базе данных.

## Собрать проект:

```
mvn clean install
```
## Запустить приложение:

```
mvn spring-boot:run
```
