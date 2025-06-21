<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Редактирование задачи ${object.id}</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <header>
        <h1>Редактирование задачи #${object.id}</h1>
    </header>

    <section class="task-form">
        <form action="/product/${object.id}/savechange" method="post">
            <div class="form-group">
                <label for="title">Название задачи:</label>
                <input type="text" id="title" name="title" value="${object.title}" required>
            </div>
            <div class="form-group">
                <label for="description">Описание задачи:</label>
                <input type="text" id="description" name="description" value="${object.description}" required>
            </div>
            <div class="task-actions">
                <button type="submit" class="btn btn-primary">Сохранить изменения</button>
                <a href="/product/${object.id}" class="btn btn-outline">Отмена</a>
            </div>
        </form>
    </section>
</body>
</html>