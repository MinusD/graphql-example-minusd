url: `http://localhost:8080/graphiql`

```graphql
mutation {
    createBook(
        name: "Война и мир",
        genre: "Роман",
        author: "Лев Толстой"
    ) {
        id
    }
}
```

```graphql
mutation {
    createBook(
        name: "Преступление и наказание",
        genre: "Роман",
        author: "Федор Достоевский"
    ) {
        id
    }
}
```

```graphql
{
    books {
        id
        name
    }
}
```

```graphql
{
    book(id: 1) {
        id,
        name,
        genre,
        author
    }
}
```

```shell
docker build -t minusd/graphql-example:latest .
```