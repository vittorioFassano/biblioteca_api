# API da Biblioteca Vittorio

Esta é uma API para gerenciar livros na Biblioteca Vittorio.

## Rotas Disponíveis

- **Listar todos os livros**: `GET /livros`

  localhost:8080/livros

- **Cadastrar um novo livro**: `POST /livros`

  localhost:8080/livros

- **Atualizar um livro existente**: `PUT /livros/{id}`

  localhost:8080/livros/{id}

- **Deletar um livro**: `DELETE /livros/{id}`

   localhost:8080/livros/{id}

## Exemplo de requisição post para cadastrar um livro

{
  "titulo": "Harry Potter e o Cálice de Fogo",
  "informacoes": {
    "autor": "J.K. Rowling",
    "publicacao": "08-07-2000",
    "editora": "Bloomsbury"
  }
}
