# DIO - Trilha Java Básico

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=ffff&height=120&section=header"/>

<h1 align="center">Olá! Eu sou o Herbert Felipe Emidio da Silva 👋</h1>

[www.dio.me](http://www.dio.me)

## Autores
- **Gleyson Sampaio**

## Projeto: ContaBanco

### Descrição

O projeto **ContaBanco** tem como objetivo exercitar o conteúdo apresentado no módulo de Sintaxe do curso Java Básico da DIO. O projeto permite a criação de um programa que coleta informações sobre uma conta bancária via terminal e exibe uma mensagem formatada com essas informações.

### Funcionalidades

- **Coleta de Dados**: O programa solicita ao usuário informações sobre a conta bancária via terminal.
- **Formatação de Mensagem**: Após a coleta dos dados, o programa exibe uma mensagem formatada com as informações fornecidas pelo usuário.

### Atributos

O programa deve lidar com os seguintes atributos:

| Atributo     | Tipo    | Exemplo     |
|--------------|---------|-------------|
| Numero       | Inteiro | 1021        |
| Agencia      | Texto   | 067-8       |
| Nome Cliente | Texto   | MARIO ANDRADE |
| Saldo        | Decimal | 237.48      |

### Requisitos

1. **Declaração de Variáveis**: Revise as regras de declaração de variáveis em Java.
2. **Entrada de Dados**: Utilize a classe `Scanner` para receber dados do terminal.
3. **Formatação de Mensagem**: Exiba uma mensagem formatada com as informações inseridas pelo usuário.

### Exemplo de Código

Crie a classe `ContaTerminal.java` com o seguinte código:

```java
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Coleta das informações
        System.out.println("Por favor, digite o número da conta:");
        int numero = scan.nextInt();
        scan.nextLine(); // Limpar o buffer do scanner após a leitura do número

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scan.nextLine();

        // Definir o saldo
        double saldo = 237.48;

        // Formatação e exibição da mensagem
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );
        System.out.println(mensagem);

        // Fechar o scanner
        scan.close();
    }
}
