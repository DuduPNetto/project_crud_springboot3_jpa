# Project Web Services

Projeto feito no curso Java Completo 2023. Como introdução ao Java Spring.

# Detalhes

O projeto contém um sistema com base no cadastro de usuários, pedidos, produtos, pagamentos.
Cada uma dessas entidades possui um sistema CRUD (Create, Read, Update, Delete).

As entidades podem ser mudadas por meio de requisições web, e são salvas no banco de dados.

URLS Disponíveis:<br/>
http://localhost:8080/users/<br/>
http://localhost:8080/orders/<br/>
http://localhost:8080/categories/<br/>
http://localhost:8080/products/<br/>
Todas as URLS podem ter um ID adicionado após a barra '/'. Para busca de um ID específico.

Exemplos:<br/>
GET - http://localhost:8080/users/ -> Retorna todos os usuários<br/>
GET - http://localhost:8080/users/1 -> Retorna o usuário de ID 1<br/>
POST - http://localhost:8080/users/ -> Adiciona um usuário com informações via JSON<br/>
DELETE - http://localhost:8080/users/3 -> Deleta o usuário de ID 3<br/>
<<<<<<< HEAD
PUT - http://localhost:8080/users/7 -> Atualiza o usuário de ID 7
=======
PUT - http://localhost:8080/users/7 -> Atualiza o usuário de ID 7
>>>>>>> 2356b424be19d257c7439aa4429b34c0310fc4f2
