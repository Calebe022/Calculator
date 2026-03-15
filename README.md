# 🧮 Calculadora Java — Console Application

Uma calculadora de linha de comando desenvolvida em Java, criada como projeto de aprendizado para praticar fundamentos da linguagem, como estruturas de controle, entrada de dados pelo console e lógica de fluxo de programa.

---

## 📋 Descrição

O projeto consiste em uma aplicação interativa executada no terminal que permite ao usuário realizar as quatro operações aritméticas básicas: soma, subtração, multiplicação e divisão. O programa exibe um menu de opções em loop contínuo, aguardando a interação do usuário até que ele decida encerrar a sessão.

---

## ✨ Funcionalidades

- **Soma** de dois números inteiros
- **Subtração** de dois números inteiros
- **Multiplicação** de dois números inteiros
- **Divisão** entre dois números, com resultado em ponto flutuante
- **Validação de divisão por zero**, exibindo mensagem de erro ao invés de encerrar o programa abruptamente
- **Validação de opção inválida**, orientando o usuário a tentar novamente
- **Menu interativo em loop**, permitindo múltiplas operações consecutivas sem reiniciar o programa

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão recomendada |
|---|---|
| Java | 8 ou superior |
| JDK | 8+ |

Não há dependências externas. O projeto utiliza apenas a biblioteca padrão do Java (`java.util.Scanner`).

---

## 🚀 Como Executar

### Pré-requisitos

Ter o **JDK (Java Development Kit)** instalado na máquina. Para verificar, execute no terminal:

```
java -version
javac -version
```

### Compilação

No diretório onde o arquivo `Calculator.java` está localizado, compile com:

```
javac Calculator.java
```

### Execução

Após a compilação, execute o programa com:

```
java Calculator
```

---

## 📖 Como Usar

Ao iniciar o programa, o seguinte menu será exibido no terminal:

```
===== CALCULADORA =====

1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Sair
Escolha uma opção:
```

1. Digite o **número da operação** desejada e pressione Enter.
2. Informe o **primeiro número** quando solicitado.
3. Informe o **segundo número** quando solicitado.
4. O resultado será exibido imediatamente.
5. O menu voltará a aparecer para uma nova operação.
6. Para encerrar, escolha a opção **5 - Sair**.

---

## 🧠 Conceitos Praticados

Este projeto foi desenvolvido como exercício de aprendizado e aborda os seguintes conceitos fundamentais de Java:

- **Classe e método `main`** — ponto de entrada de um programa Java
- **`Scanner`** — leitura de dados digitados pelo usuário no console
- **Variáveis e tipos primitivos** — uso de `int` e `double` conforme a necessidade de cada operação
- **Estrutura `while`** — loop de repetição para manter o menu ativo
- **Estruturas `if / else if`** — tomada de decisão para selecionar a operação correta
- **`break`** — interrupção controlada do loop ao selecionar a opção de sair
- **Casting de tipo** — conversão de `int` para `double` para obter resultado decimal na divisão
- **Boas práticas básicas** — fechamento do `Scanner` com `teclado.close()` ao fim do programa

---

## 📂 Estrutura do Projeto

```
calculadora-java/
└── Calculator.java
```

---

## 📄 Licença

Este projeto é de uso livre para fins educacionais.
