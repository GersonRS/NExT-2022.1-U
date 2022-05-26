# Exercício
## Banco de dados com lista de livros
### Etapa 1 - Crie a tabela
Quais são os seus livros favoritos? Você pode criar uma tabela no banco de dados e guardá-los lá! Nesse primeiro passo, crie uma tabela para guardar a sua lista de livros. Esta deverá conter colunas para `id`, `name`, e `rating` (identificador, nome e avaliação - use os nomes em inglês).

### Etapa 2 - Adicione livros
Agora adicione à tabela três dos seus livros favoritos.

---

## Banco de dados de sucessos de bilheteria

```sql
CREATE TABLE movies (id INTEGER PRIMARY KEY, name TEXT, release_year INTEGER);
INSERT INTO movies VALUES (1, "Avatar", 2009);
INSERT INTO movies VALUES (2, "Titanic", 1997);
INSERT INTO movies VALUES (3, "Star Wars: Episode IV - A New Hope", 1977);
INSERT INTO movies VALUES (4, "Shrek 2", 2004);
INSERT INTO movies VALUES (5, "The Lion King", 1994);
INSERT INTO movies VALUES (6, "Disney's Up", 2009);
```

### Etapa 1 - Selecione tudo
Este banco de dados contém uma lista incompleta de sucessos de bilheteria e seu ano de lançamento. Nesse desafio, você vai obter os resultados do banco de dados de formas diferentes! Nessa primeira etapa, selecione todos os filmes (`movies`).

### Etapa 2 - Filtrar filmes recentes
Agora faça uma segunda pesquisa para obter os filmes lançados no ano 2000 ou depois, não antes (consulte `release_year`). Ordene os resultados para que os filmes mais antigos sejam listados primeiro. Você deverá ter 2 comandos `SELECT` depois deste passo.

---

## Estatísticas do banco de dados de lista de afazeres

```sql
CREATE TABLE todo_list (id INTEGER PRIMARY KEY, item TEXT, minutes INTEGER);
INSERT INTO todo_list VALUES (1, "Wash the dishes", 15);
INSERT INTO todo_list VALUES (2, "vacuuming", 20);
INSERT INTO todo_list VALUES (3, "Learn some stuff on KA", 30);
```

### Etapa 1 - Insira uma tarefa
Esta é uma tabela contendo uma lista de afazeres com o número de minutos que vai levar para completar cada item. Insira outro item à lista de afazeres com o tempo estimado em minutos que ele vai levar.

### Etapa 2 - Faça a soma
Selecione a soma SUM de minutos que vai levar para fazer todos os itens da sua lista de afazeres. Você deve ter apenas uma instrução SELECT.

---

## Seletor de músicas de karaokê

```sql
CREATE TABLE songs (
    id INTEGER PRIMARY KEY,
    title TEXT,
    artist TEXT,
    mood TEXT,
    duration INTEGER,
    released INTEGER);
    
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("Bohemian Rhapsody", "Queen", "epic", 60, 1975);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("Let it go", "Idina Menzel", "epic", 227, 2013);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("I will survive", "Gloria Gaynor", "epic", 198, 1978);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("Twist and Shout", "The Beatles", "happy", 152, 1963);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("La Bamba", "Ritchie Valens", "happy", 166, 1958);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("I will always love you", "Whitney Houston", "epic", 273, 1992);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("Sweet Caroline", "Neil Diamond", "happy", 201, 1969);
INSERT INTO songs (title, artist, mood, duration, released) VALUES ("Call me maybe", "Carly Rae Jepsen", "happy", 193, 2011);
```

### Etapa 1
Você já cantou alguma vez em um karaokê? É um lugar onde você canta com seus amigos, é muito divertido. Criamos uma tabela com músicas e, nesse desafio, você vai usar consultas para decidir quais músicas cantar. Nessa primeira etapa, selecione todos os títulos das músicas.

### Etapa 2
Talvez seus amigos gostem de cantar apenas músicas recentes ou realmente épicas. Adicione outro SELECT que usaOR para mostrar os títulos das músicas que são do tipo "epic" ou que tenham data de lançamento posterior a 1990.

(Dica: se você não se lembra de como selecionar linhas nas quais uma coluna do tipo `TEXT` ou `VARCHAR` é igual a um valor, você pode usar o `LIKE`).

### Etapa 3
As pessoas se tornam exigentes no fim da noite. Adicione outro SELECT que usa ANDpara mostrar títulos de músicas épicas, "epic", **e** lançadas após 1990, __e__ que tenham menos de 4 minutos de duração.
Perceba que a coluna de duração, duration, é medida em segundos.

---

## Criador de lista de reprodução

```sql
CREATE TABLE artists (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    country TEXT,
    genre TEXT);

INSERT INTO artists (name, country, genre)
    VALUES ("Taylor Swift", "US", "Pop");
INSERT INTO artists (name, country, genre)
    VALUES ("Led Zeppelin", "US", "Hard rock");
INSERT INTO artists (name, country, genre)
    VALUES ("ABBA", "Sweden", "Disco");
INSERT INTO artists (name, country, genre)
    VALUES ("Queen", "UK", "Rock");
INSERT INTO artists (name, country, genre)
    VALUES ("Celine Dion", "Canada", "Pop");
INSERT INTO artists (name, country, genre)
    VALUES ("Meatloaf", "US", "Hard rock");
INSERT INTO artists (name, country, genre)
    VALUES ("Garth Brooks", "US", "Country");
INSERT INTO artists (name, country, genre)
    VALUES ("Shania Twain", "Canada", "Country");
INSERT INTO artists (name, country, genre)
    VALUES ("Rihanna", "US", "Pop");
INSERT INTO artists (name, country, genre)
    VALUES ("Guns N' Roses", "US", "Hard rock");
INSERT INTO artists (name, country, genre)
    VALUES ("Gloria Estefan", "US", "Pop");
INSERT INTO artists (name, country, genre)
    VALUES ("Bob Marley", "Jamaica", "Reggae");

CREATE TABLE songs (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    artist TEXT,
    title TEXT);

INSERT INTO songs (artist, title) VALUES ("Taylor Swift", "Shake it off");
INSERT INTO songs (artist, title) VALUES ("Rihanna", "Stay");
INSERT INTO songs (artist, title) VALUES ("Celine Dion", "My heart will go on");
INSERT INTO songs (artist, title) VALUES ("Celine Dion", "A new day has come");
INSERT INTO songs (artist, title) VALUES ("Shania Twain", "Party for two");
INSERT INTO songs (artist, title) VALUES ("Gloria Estefan", "Conga");
INSERT INTO songs (artist, title) VALUES ("Led Zeppelin", "Stairway to heaven");
INSERT INTO songs (artist, title) VALUES ("ABBA", "Mamma mia");
INSERT INTO songs (artist, title) VALUES ("Queen", "Bicycle Race");
INSERT INTO songs (artist, title) VALUES ("Queen", "Bohemian Rhapsody");
INSERT INTO songs (artist, title) VALUES ("Guns N' Roses", "Don't cry");
```

### Etapa 1
Criamos um banco de dados de músicas e artistas e, nesse desafio, você vai criar listas de reprodução a partir desses dados. Nessa primeira etapa, selecione o título, `title`, de todas as músicas cujo artista, `artist`, é a banda ___"Queen"___.

### Etapa 2
Agora você vai fazer uma lista de reprodução ***"Pop"***. Para se preparar, selecione o nome,`name`, de todos os artistas do gênero ***"Pop"***.
(Dica: lembre-se de digitar ***"Pop"***, porque o SQL considera isso diferente de ***"pop"***).

### Etapa 3
Para terminar de criar a lista de reprodução ***"Pop"***, adicione outra busca que vai selecionar o título, `title`, de todas as músicas dos artistas do gênero ***"Pop"***. Ela deve usar `IN` em uma sub-busca aninhada com base em sua busca anterior.

---

# Projeto: Projetar o banco de dados de uma loja

Crie sua própria loja! Ela deve vender um tipo de produto como roupas, bicicletas ou qualquer coisa que seja de seu interesse. Você deve ter uma tabela para todos os itens na sua loja e pelo menos 5 colunas para o tipo de dado que você considera armazenar. Você deve vender pelo menos 15 itens e usar as instruções select para ordenar seus itens por preço e mostrar pelo menos uma estatística sobre os itens.