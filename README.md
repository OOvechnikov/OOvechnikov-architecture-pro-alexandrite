# OOvechnikov-architecture-pro-alexandrite

## Как запустить MVP трассировки.

1. Перейти в папку ~/Task3/services и запустить контейнеры.

```
    cd .../Task3/services
    docker-compose up -d
```

2. Выполнить GET /order/{productName} запрос.

3. Открыть в браузере: http://localhost:16686.

[Пример результата](Task3/tracing.png)