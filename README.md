## Task Manager - Система управления задачами

Приложение для управления задачами с аутентификацией пользователей, созданное на Spring Boot. Позволяет создавать, просматривать, редактировать и удалять задачи.

### Особенности

- Регистрация и аутентификация пользователей
- CRUD операции с задачами
- Защита данных с помощью Spring Security
- Хранение задач в PostgreSQL
- Просмотр детальной информации о задаче

### Технологический стек

- Язык: Java 24
- Фреймворк: Spring Boot 3.5
- База данных: PostgreSQL
- Безопасность: Spring Security, BCrypt
- Шаблонизация: Freemarker
- Сборка: Maven
- Другие технологии: Lombok, Hibernate, JPA

### Функциональные возможности
#### Любой пользователь
- Регистрация пользователя
- Вход в систему
#### Аутентифицированный пользователь 
- Просмотр всех задач
- Создание новой задачи
- Редактирование задачи
- Удаление задачи
- Просмотр деталей задачи

### Запуск проекта

#### Предварительные требования

#### 1. Установите:
    - Java 24
    - PostgreSQL
    - Maven

#### 2. Создайте базу данных в PostgreSQL:
    CREATE DATABASE taskmanager;

#### 3.	Настройте подключение к БД в application.properties:
    spring.application.name=TaskManager
    spring.datasource.url=jdbc:postgresql://localhost:5432/taskmanager
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

### Сборка и запуск
#### 1.	Клонируйте репозиторий:
      git clone https://github.com/Rock002/TaskManager.git
      cd TaskManager
#### 2.	Соберите проект с помощью Maven:
      mvn clean package
#### 3.	Запустите приложение:
      java -jar target/task-manager-0.0.1-SNAPSHOT.jar
#### 4.	Приложение будет доступно по адресу (если он свободен):
      http://localhost:8080

### Использование
#### 1.	Регистрация
      Перейдите по ссылке http://localhost:8080/registration и заполните форму:
      Имя пользователя
      Пароль
#### 2.	Вход в систему
      Используйте свои учетные данные для входа:
      http://localhost:8080/login
#### 3.	Работа с задачами
      o	Главная страница: Просмотр всех задач
      o	Создание: Нажмите "Добавить задачу"
      o	Редактирование: Нажмите "Изменить" на карточке задачи
      o	Удаление: Нажмите "Удалить" на карточке задачи
