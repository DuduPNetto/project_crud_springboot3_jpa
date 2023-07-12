# Project Web Services

Projeto feito no curso Java Completo 2023. Como introdução ao Java Spring.

# Detalhes

O projeto contém um sistema com base no cadastro de usuários, pedidos, produtos, pagamentos.
Cada uma dessas entidades possui um sistema CRUD (Create, Read, Update, Delete).

As entidades podem ser mudadas por meio de requisições web, e são salvas no banco de dados.

URLS Disponíveis:
http://localhost:8080/users/
http://localhost:8080/orders/
http://localhost:8080/categories/
http://localhost:8080/products/
Todas as URLS podem ter um ID adicionado após a barra '/'. Para busca de um ID específico.

Exemplos:
GET - http://localhost:8080/users/ -> Retorna todos os usuários
GET - http://localhost:8080/users/1 -> Retorna o usuário de ID 1
POST - http://localhost:8080/users/ -> Adiciona um usuário com informações via JSON
DELETE - http://localhost:8080/users/3 -> Deleta o usuário de ID 3
PUT - http://localhost:8080/users/7 -> Atualiza o usuário de ID 7
