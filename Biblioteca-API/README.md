#Desafio Crie a sua própria API

## Diagrama de Classes

```mermaid
    class Books {
        - id: String
        - title: String
        - year: int
    }
    class Author {
        - id: String
        - name: String
        - Books: List<Books>
    }

    Books --o{ Author : Has
```