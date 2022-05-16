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