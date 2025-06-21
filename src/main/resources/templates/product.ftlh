<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Задача ${object.id}</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <header>
        <h1>Детали задачи #${object.id}</h1>
    </header>

    <div class="task-detail">
        <span class="task-id">ID: ${object.id}</span>
        <h2>${object.title}</h2>
        <p class="task-description">${object.description}</p>
    </div>

    <div class="task-actions">
        <form action="/product/${object.id}/delete" method="post">
            <button type="submit" class="btn btn-danger">Удалить</button>
        </form>
        <form action="/product/${object.id}/changeform" method="post">
            <button type="submit" class="btn btn-warning">Изменить</button>
        </form>
    </div>
</body>
</html>