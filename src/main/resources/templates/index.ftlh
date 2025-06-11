<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Главная Страница</title>
</head>
<body>
    <p>Задачи</p><br><br>
    <form action="/create" method="post">
        <input type="text" name="title"/><br>
        <input type="text" name="description"/><br>
        <input type="submit" value="Добавить задачи"/><br>
    </form>

    <#list tasks as task>
        <div>
            <p>${task.title}</p>
            <p>${task.description}</p><br>
            <form action="/product/open/${task.id}" method="post">
                <input type="submit" value="открыть задачу"/><br>
            </form>
        </div>
    </#list>

</body>
</html>