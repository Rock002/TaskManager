<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Задача ${object.id}</title>
</head>
<body>
        <div>
            <p>${object.title}</p>
            <p>${object.description}</p>
        </div>
        <form action="/product/${object.id}/delete" method="post">
            <input type="submit" value="Удалить"/>
        </form>
        <form action="/product/${object.id}/changeform" method="post">
            <input type="submit" value="Изменить"/>
        </form>
</body>
</html>