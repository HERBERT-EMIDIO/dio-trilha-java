# Projeto de Estudo: Pacotes em Java

Este projeto tem como objetivo estudar a utilização de pacotes em Java e como gerenciar classes que possuem o mesmo nome, mas estão localizadas em pacotes diferentes.

## Estrutura do Projeto

A estrutura do diretório `src` do projeto está organizada da seguinte forma:

### Explicação dos Pacotes e Classes

1. **Pacote `com.emidio.curso`**:
   - **Arquivo**: `Aluno.java`
   - **Descrição**: Esta classe representa um aluno no contexto de um curso.

2. **Pacote `com.emidio.escola`**:
   - **Arquivo**: `Aluno.java`
   - **Descrição**: Esta classe representa um aluno no contexto de uma escola.

### Como Utilizar Classes com o Mesmo Nome

Em Java, é possível ter classes com o mesmo nome, desde que elas estejam em pacotes diferentes. Para utilizar essas classes em seu código, você precisa importar a classe específica do pacote desejado. Abaixo estão os exemplos de como importar e criar objetos dessas classes:

#### Importando a Classe `Aluno` do Pacote `com.emidio.curso`

Para usar a classe `Aluno` localizada no pacote `com.emidio.curso`, você deve importar a classe assim:

```java
import com.emidio.curso.Aluno;

// Criando um objeto da classe Aluno do pacote com.emidio.curso
Aluno alunoCurso = new com.emidio.curso.Aluno();

import com.emidio.escola.Aluno;

// Criando um objeto da classe Aluno do pacote com.emidio.escola
Aluno alunoEscola = new com.emidio.escola.Aluno();
