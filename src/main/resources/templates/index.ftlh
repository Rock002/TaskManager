<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Manager</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <header>
        <h1>Task Manager</h1>
    </header>

    <section class="task-form">
        <h2 style="color: var(--secondary); margin-top: 0;">Добавить новую задачу</h2>
        <form action="/create" method="post">
            <div class="form-group">
                <label for="title">Название задачи:</label>
                <input type="text" id="title" name="title" required placeholder="Введите название">
            </div>
            <div class="form-group">
                <label for="description">Описание задачи:</label>
                <input type="text" id="description" name="description" required placeholder="Введите описание">
            </div>
            <button type="submit" class="btn btn-primary">Добавить задачу</button>
        </form>
    </section>

    <section>
        <h2 style="color: var(--secondary);">Список задач</h2>
        <div class="task-list">
            <#list tasks as task>
                <div class="task-card">
                    <div class="task-header">
                        <h3 class="task-title">${task.title}</h3>
                    </div>
                    <p class="task-description">${task.description}</p>
                    <div class="task-actions">
                        <form action="/product/open/${task.id}" method="post">
                            <button type="submit" class="btn btn-primary">Подробнее</button>
                        </form>
                    </div>
                </div>
            </#list>
        </div>
    </section>
</body>
</html>