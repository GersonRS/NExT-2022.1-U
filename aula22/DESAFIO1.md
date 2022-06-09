
<h3 align="center">
  Challenge 1: Star Wars Store
</h3>
<br>

<p align="center">
  <a href="#sobre-o-desafio">Sobre o desafio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#orienta%C3%A7%C3%A3o">Orientações</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#configura%C3%A7%C3%A3o-do-projeto">Configuração do Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#funcionalidades-da-api">Funcionalidades da API</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#informações-do-projeto">Informações do projeto</a>
  <a href="#expandindo-os-horizontes">Expandindo os horizontes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#licen%C3%A7a">Licença</a>
</p>

---

## Sobre o desafio

Nesse desafio, você irá desenvolver uma API REST para a loja de Star Wars. Agora você irá praticar o que você aprendeu até agora no modulo de Back-End do NExT com Java e Spring, para criar uma pequena API para um e-commerce.

Essa será uma API que receberá requisições de um aplicativo movel (Android e iOS). Todos os itens serão colocados em um carrinho do lado do aplicativo e passados para a API para realizar uma transação e-commerce.

O candidato tem a liberdade de realizar o desafio da maneira que achar melhor, usando ou não a arquitetura, bibliotecas e forma de codificar.

Deverá informar quais tecnologias foram usadas(biblioteca, estrutura e versão do java), como instalar, rodar e efetuar os acessos neste arquivo README.md na seção <a href="#informações-do-projeto">Informações do projeto</a>

## Orientações

Para este projeto você poderá criar um novo repositorio ou nesta pasta criar a estrutura que irá compor o seu projeto, ficando a seu criterio como proceder para realizar este desafio.

Desenvolva o case seguindo as melhores práticas que julgar necessário, aplique todos os conceitos, se atente a qualidade, utilize toda e qualquer forma de governança de código válido.

## Configuração do Projeto

Java >= 8, Spring Boot, Maven para gerenciamento de dependências e MySQL Database para banco de dados.

Para que vocês tenham os dados para exibir em tela, vocês deverão criar alguns registros no seu banco de dados para te prover esses dados.

Ao se ter a base de dados, vocês deverão criar a aplicação Spring e as suas rotas, onde retornaram seus devidos dados

## Funcionalidades da API


### POST `/starstore/product`
Esse método deve receber um produto novo e inseri-lo em um banco de dados para ser consumido pela própria API.
```json
{
   "title":"Blusa do Imperio",
   "price":7990,
   "zipcode":"78993-000",
   "seller":"João da Silva",
   "thumbnailHd":"https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg",
   "date":"26/11/2015"
}
```
| Campo       | Tipo   |
|-------------|--------|
| title       | String |
| price       | int    |
| zipcode     | String |
| seller      | String |
| thumbnailHd | String |
| date        | String |


### GET `/starstore/products`
Esse método da API deve retornar o seguinte JSON
```json
[
  {
    "title": "Blusa do Imperio",
    "price": 7990,
    "zipcode": "78993-000",
    "seller": "João da Silva",
    "thumbnailHd": "https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg",
    "date": "26/11/2015"
  },
  {
    "title": "Blusa Han Shot First",
    "price": 7990,
    "zipcode": "13500-110",
    "seller": "Joana",
    "thumbnailHd": "https://cdn.awsli.com.br/1000x1000/21/21351/produto/7234148/55692a941d.jpg",
    "date": "26/11/2015"
  },
  {
    "title": "Sabre de luz",
    "price": 150000,
    "zipcode": "13537-000",
    "seller": "Mario Mota",
    "thumbnailHd": "http://www.obrigadopelospeixes.com/wp-content/uploads/2015/12/kalippe_lightsaber_by_jnetrocks-d4dyzpo1-1024x600.jpg",
    "date": "20/11/2015"
  }
]
```

| Campo       | Tipo   |
|-------------|--------|
| title       | String |
| price       | int    |
| zipcode     | String |
| seller      | String |
| thumbnailHd | String |
| date        | String |


Após o usuário adicionar todos os itens desejados no carrinho, ele finalizará a compra.
Para isso, você precisará fazer o método `buy` na sua API.

### POST `/starstore/buy`
Esse método irá receber os dados da compra, junto com os dados do usuário.
```json
{
   "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
   "client_name":"Luke Skywalker",
   "total_to_pay":1236,
   "credit_card":{
      "card_number":"1234123412341234",
      "value":7990,
      "cvv":789,
      "card_holder_name":"Luke Skywalker",
      "exp_date":"12/24"
   }
}

```

+ Transaction

| Campo        | Tipo       |
|--------------|------------|
| client_id    | String     |
| client_name  | String     |
| total_to_pay | int        |
| credit_card  | CreditCard |

+ CreditCard

| Campo            | Tipo   |
|------------------|--------|
| card_number      | String |
| card_holder_name | String |
| value            | int    |
| cvv              | int    |
| exp_date         | String |


### GET `/starstore/history`
Esse método deve retornar todos as compras realizadas na API
```json
[
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   }
]
```
| Campo            | Tipo   |
|------------------|--------|
| card_number      | String |
| cliend_id        | String |
| value            | int    |
| date             | String |
| purchase_id      | String |

### GET `/starstore/history/{clientId}`
Esse método deve retornar todos as compras realizadas na API por um cliente específico
```json
[
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   }
]
```

## Informações do projeto

### Dependencias do projeto (bibliotecas)

### Estrutura de Arquivos
A estrutura de arquivos está da seguinte maneira:
```bash
   aqui você deverá colocar a estrutura do seu projeto.
   exemplo da aula22:
   aula22
   ├── HELP.md
   ├── mvnw
   ├── mvnw.cmd
   ├── pom.xml
   ├── src
   │   ├── main
   │   │   ├── java
   │   │   │   └── br
   │   │   │       └── org
   │   │   │           └── cesar
   │   │   │               └── aula22
   │   │   │                   └── Aula22Application.java
   │   │   └── resources
   │   │       ├── application.properties
   │   │       ├── static
   │   │       └── templates
   │   └── test
   │       └── java
   │           └── br
   │               └── org
   │                   └── cesar
   │                       └── aula22
   │                           └── Aula22ApplicationTests.java
   └── target
      ├── classes
      │   ├── application.properties
      │   └── br
      │       └── org
      │           └── cesar
      │               └── aula22
      │                   └── Aula22Application.class
      └── test-classes
         └── br
               └── org
                  └── cesar
                     └── aula22
                           └── Aula22ApplicationTests.class

27 directories, 13 files
```

## Expandindo os horizontes

Essa é uma aplicação totalmente escalável, isso significa que além das específicações, após finalizado o desafio, é totalmente possível implementar mais funcionalidades a essa aplicação, e essa será uma ótima maneira para fixar os conhecimentos.

Você pode implementar desde funcionalidades simples que não foram específicadas nos testes, como a finalização completa de um pedido, ou uma página que irá mostrar dados do pedido realizado.

Faça um post no Linkedin ou Instagram e postar o código do Github é uma boa forma de demonstrar seus conhecimentos e esforços para evoluir na sua carreira para oportunidades futuras.

Além disso, use sua criatividade para testar novas coisas, existem muitas possibilidades de aprendizado!

## Licença

Esse projeto está distribuído sob a licença MIT. Veja o arquivo [LICENSE](../LICENCE) para mais detalhes ou logo a baixo.

```
MIT License

Copyright (c) 2022 Gerson

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

Feito com 💜 by GersonRS