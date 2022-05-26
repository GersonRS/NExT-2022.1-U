# CRUD com JPA, Hibernate e MySQL

Baixe o zip ou faça o clone deste repositório em seu workspace
```git
git clone https://github.com/natancardosodev/CRUD-JPA-Hibernate.git
```
## Banco de dados
Inicie o SGBD MySQL e crei o schema blog:
```sql
CREATE DATABASE blog
```
O JPA criará as tabelas, contudo o database deverá ser criado manualmente.
## Execução
- Execute no console a classe CategoriaTest que está dentro do pacote exemplo.jpa.teste e então salvará duas categorias.
- Depois execute o LocalTest no mesmo pacote, e então fará as operações do CRUD (Criar, Ler, Atualizar e Excluir), fazendo sempre um relacionamento com a tabela Categoria.