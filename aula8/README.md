# Aula sobre HERANÇA

## Exercícios
Exercício 1: Crei o diagrama de classe so código a baixo:
```java
public class Pessoa {
	public String nome;
	public String cpf;
	public String data_nascimento;

	public Pessoa(String nome, String cpf, String data) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data;
	}
}
```
```java
public class Aluno extends Pessoa {
	public String matricula;
	public Aluno(String nome, String cpf, String data) {
		super(nome, cpf, data);
	}
}
```
```java
public class Professor extends Pessoa {
	public double salario;
	public String disciplina;
	public Professor(String nome, String cpf, String data) {
		super(nome, cpf, data);
	}
}
```
```java
public class Funcionario extends Pessoa {
	public double salario;
	public String data_admissao;
	public String cargo;
	public Funcionario(String nome, String cpf, String data) {
		super(nome, cpf, data);
	}
}
```

Exercício 2: Uma loja que vende CD e DVDS deseja construir um
cadastro com dos seus produtos. Para tanto, foi elaborado o diagrama
de classes dado na figura abaixo.
![img](.github/images/diagrama_heranca.png)

A tabela abaixo fornece uma descrição dos métodos que deverão ser
elaborados para cada uma das classes.

| Método 	| Descrição 	|
|---	|---	|
| getTipo() 	| Retorna uma String com o nome da classe. 	|
| getDetalhes() 	| Retorna uma String com as informações contidas nos campos. 	|
| printDados() 	| Imprime as informações contidas nos campos da classe. Para tanto, usa dois métodos para recuperar estas informações: getTipo() e getDetalhes(). Estas funções por sua vez são polimórficas, ou seja, seu tipo retorno varia de acordo com a classe escolhida, tal que estemétodo é sobreposto nas subclasses. 	|
| inserirDados() 	| Insere os dados necessários para se preencher os campos de um objeto de uma dada classe. Seu comportamento é polimórfico. 	|

Além dos métodos descritos na tabela a cima, deverão ser criados os métodos get e set correspondentes para retorna e modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem parâmetros de cada classe. Criar um programa que simule o uso de um cadastro de CD e DVDs.