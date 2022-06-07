<h3 align="center">
  Challenge 2: Star Wars Store
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

Nesse desafio, você irá desenvolver e fazer o deploy de uma API REST para a Dock. Agora você irá praticar o que você aprendeu até agora no modulo de Back-End do NExT com Python e Flask, para criar uma pequena API para um banco digital.

Essa será uma API que receberá requisições de um aplicativo movel (Android e iOS). Sua missão é construir uma nova conta digital Dock para os clientes utilizarem através de endpoints(rotas), onde receberão requisições em um novo backend que deverá gerenciar as contas e seus portadores (os donos das contas digitais).

O candidato tem a liberdade de realizar o desafio da maneira que achar melhor, usando ou não a arquitetura, bibliotecas foi forma de codificar. 

Deverá informar quais tecnologias foram usadas(biblioteca, estrutura e versão do python), como instalar, rodar e efetuar os acessos neste arquivo README.md na seção <a href="#informações-do-projeto">Informações do projeto</a>

## Orientações

Para este projeto você poderá criar um novo repositorio ou nesta pasta criar a estrutura que irá compor o seu projeto, ficando a seu criterio como proceder para realizar este desafio.

Desenvolva o case seguindo as melhores práticas que julgar necessário, aplique todos os conceitos, se atente a qualidade, utilize toda e qualquer forma de governança de código válido.

## Configuração do Projeto

Python 3.*, Flask, pip para gerenciamento de dependências e MySQL Database para banco de dados.

Para que vocês tenham os dados para exibir em tela, vocês deverão criar alguns registros no seu banco de dados para te prover esses dados.

Ao se ter a base de dados, vocês deverão criar a aplicação Flask e as suas rotas, onde retornaram seus devidos dados

## Funcionalidades da API

- Deve ser possível criar e remover **portadores**
    - Um **portador** deve conter apenas seu *nome completo* e *CPF*
    - O *CPF* deve ser válido e único no cadastro de **portadores**
- As **contas digital Dock** devem conter as seguintes funcionalidades:
    - A conta deve ser criada utilizando o *CPF* do **portador**
    - Uma conta deve ter seu *saldo*, *número* e *agência* disponíveis para consulta
    - Necessário ter funcionalidade para fazer a *consulta de extrato* da conta *por período*
    - Um **portador** pode fechar a **conta digital Dock** a qualquer instante
    - Executar as operações de *saque* e *depósito*
        - *Depósito* é liberado para todas as *contas ativas* e *desbloqueadas*
        - *Saque* é permitido para todas as *contas ativas* e *desbloqueadas* desde que haja *saldo disponível* e não ultrapasse o limite diário de *2 mil reais*
- Precisamos *bloquear* e *desbloquear* a **conta digital Dock** a qualquer momento
- A **conta digital Dock** nunca poderá ter o *saldo negativo*

## Informações do projeto

### Dependencias do projeto (bibliotecas)

### Estrutura de Arquivos
A estrutura de arquivos está da seguinte maneira:
```bash
    aqui você deverá colocar a estrutura do seu projeto.
    exemplo da aula18:
    aula18
    ├── app.py
    ├── ext
    │   ├── api
    │   │   ├── __init__.py
    │   │   └── resource.py
    │   ├── cli
    │   │   ├── commands.py
    │   │   └── __init__.py
    │   ├── config
    │   │   └── __init__.py
    │   ├── database
    │   │   └── __init__.py
    │   ├── __init__.py
    │   ├── models.py
    │   └── site
    │       ├── __init__.py
    │       ├── main.py
    │       └── templates
    │           ├── layout
    │           │   └── base.html
    │           └── product
    │               ├── create.html
    │               └── index.html
    ├── __init__.py
    └── setup.py

    9 directories, 16 files

>>> PS.: apague esta parte e faça o seu
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