# 🧮 Calculator

> Calculadora de linha de comando desenvolvida em Java como parte do processo de aprendizado dos fundamentos da linguagem.

---

## 📋 Sobre o Projeto

O **Calculator** é uma aplicação interativa de console feita em Java que permite ao usuário realizar as quatro operações aritméticas básicas de forma simples e direta. O programa exibe um menu em loop contínuo, aguardando a interação do usuário até que ele decida encerrar a sessão.

O projeto foi desenvolvido com foco em praticar conceitos essenciais de Java como estruturas de controle, entrada de dados via terminal, validações e lógica de fluxo de programa.

---

## ✨ Funcionalidades

- ✅ Soma de dois números
- ✅ Subtração de dois números
- ✅ Multiplicação de dois números
- ✅ Divisão com resultado em ponto flutuante
- ✅ Validação de divisão por zero (com mensagem de erro amigável)
- ✅ Validação de opção inválida no menu
- ✅ Menu interativo em loop — permite múltiplas operações sem reiniciar o programa

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 8+ |
| IntelliJ IDEA | IDE utilizada no desenvolvimento |

Sem dependências externas — o projeto usa apenas a biblioteca padrão do Java (`java.util.Scanner`).

---

## 📁 Estrutura do Projeto

```
Calculator/
├── .idea/              # Configurações do IntelliJ IDEA
├── src/                # Código-fonte principal
│   └── Calculator.java # Classe principal com toda a lógica da aplicação
├── .gitignore          # Arquivos ignorados pelo Git
├── calculadora.iml     # Arquivo de módulo do IntelliJ IDEA
└── README.md           # Documentação do projeto
```

### Descrição das pastas

- **`.idea/`** — Pasta gerada pelo IntelliJ IDEA com configurações do ambiente de desenvolvimento. Não faz parte da lógica da aplicação.
- **`src/`** — Diretório principal contendo o código-fonte. A classe `Calculator` é o ponto de entrada e concentra toda a lógica do programa.
- **`calculadora.iml`** — Arquivo de configuração de módulo do IntelliJ IDEA, que define o SDK e os caminhos de build do projeto.

---

## 🖥️ Como o Programa Funciona

Ao iniciar, o programa exibe um menu no terminal com as operações disponíveis:

```
===== CALCULADORA =====

1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Sair

Escolha uma opção:
```

O fluxo de execução segue estas etapas:

1. O usuário escolhe uma operação digitando o número correspondente.
2. O programa solicita o primeiro e o segundo número.
3. O resultado é calculado e exibido imediatamente.
4. O menu é reapresentado automaticamente para uma nova operação.
5. Ao selecionar a opção **5**, o programa encerra corretamente.

Casos especiais como **divisão por zero** ou **opção inválida** são tratados com mensagens de erro claras, sem encerrar o programa abruptamente.

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html) instalado

Para verificar se está instalado corretamente:

```bash
java -version
javac -version
```

### Passos

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Calebe022/Calculator.git
   ```

2. **Acesse a pasta do projeto:**

   ```bash
   cd Calculator/src
   ```

3. **Compile o código:**

   ```bash
   javac Calculator.java
   ```

4. **Execute o programa:**

   ```bash
   java Calculator
   ```

> Alternativamente, abra o projeto no **IntelliJ IDEA** e execute a classe `Calculator` diretamente pela IDE.

---

## 🧠 Conceitos Praticados

Este projeto aborda os seguintes fundamentos de Java:

- **Classe e método `main`** — ponto de entrada da aplicação
- **`Scanner`** — leitura de dados do usuário via console
- **Tipos primitivos** — uso de `int` e `double` conforme a operação
- **Estrutura `while`** — loop para manter o menu ativo entre operações
- **Estruturas condicionais `if / else if`** — seleção da operação correta
- **`break`** — encerramento controlado do loop
- **Casting de tipo** — conversão de `int` para `double` para resultado decimal na divisão
- **Boas práticas** — fechamento do `Scanner` ao final da execução

---

## 📌 Status do Projeto

🟡 **Concluído para fins de aprendizado** — Projeto simples e funcional, desenvolvido para consolidar os fundamentos de Java.

---

## 👨‍💻 Autor

Desenvolvido por **Calebe** como parte da sua jornada de aprendizado em Java.

- GitHub: [@Calebe022](https://github.com/Calebe022)

---

## 📄 Licença

Este projeto está disponível livremente para fins educacionais.
