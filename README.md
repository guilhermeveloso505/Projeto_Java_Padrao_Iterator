# Padrão de Projeto Iterator

# Sobre o Projeto

Este projeto implementa o padrão de projeto comportamental **Iterator (Iterador)** em Java, simulando o gerenciamento e a consulta de clientes de uma conta.

O sistema permite armazenar diferentes clientes e percorrer essa coleção para realizar consultas, como verificar a quantidade de clientes cadastrados e contar o total de clientes existentes na conta.

# Elementos do Projeto

O projeto possui três classes principais:

- **Cliente:** representa um cliente, armazenando seu nome e sua situação de cadastro.
- **Conta:** armazena uma coleção de clientes e implementa a interface `Iterable`, permitindo percorrer seus elementos por meio de um iterador.
- **Sistema:** disponibiliza operações para contar os clientes cadastrados e obter a quantidade total de clientes de uma conta.

# Aplicação do Padrão Iterator

O padrão Iterator permite percorrer os elementos de uma coleção sem precisar conhecer diretamente sua estrutura interna, facilitando o acesso e a manipulação dos dados.

Neste projeto, a classe Conta implementa a interface `Iterable<Cliente>` e disponibiliza o método `iterator()`, responsável por retornar um iterador da coleção de clientes.

A classe Sistema utiliza duas formas de iteração: o laço `for-each`, para contar os clientes cadastrados, e o iterador explícito, utilizando os métodos `hasNext()` e `next()`, para contar o total de clientes.

Dessa forma, o sistema mantém a organização, simplifica a navegação pela coleção e permite percorrer seus elementos de maneira padronizada.