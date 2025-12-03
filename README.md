# 🏦 Simulação de Conta Bancária em Java

Este projeto foi desenvolvido como parte dos estudos iniciais de **Desenvolvimento Back-End Java** na plataforma **Alura**.

Ele representa uma aplicação de console simples que simula operações básicas de uma conta corrente, como consulta de saldo, recebimento e transferência de valores.

## 🚀 Funcionalidades

O programa executa um loop de operações até que o usuário escolha a opção de sair. As funcionalidades implementadas são:

1.  **Consultar Saldo:** Exibe o saldo atual da conta.
2.  **Receber Valor:** Adiciona um valor especificado ao saldo da conta.
3.  **Transferir Valor:** Subtrai um valor especificado do saldo da conta, com validação para garantir que o saldo seja suficiente para a operação.
4.  **Sair:** Encerra a execução do programa.

## ⚙️ Tecnologias e Conceitos

* **Linguagem:** Java
* **Controle de Versão:** Git e GitHub
* **Estruturas de Controle:**
    * `for` loop para manter o menu de operações ativo.
    * `if-else if-else` para gerenciar as opções do menu e a lógica de transferência de saldo.
* **Entrada de Dados:** Uso da classe `java.util.Scanner` para interação com o usuário.
* **Variáveis e Tipos:** Uso de `double` para valores monetários e `String` para dados do cliente.
* **Formatação:** Uso de `System.out.println(String.format(...))` para formatar a saída de dados, especialmente valores monetários (`%.2f`).

## 🛠️ Como Executar

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)
    ```
    *(Lembre-se de substituir o link acima pelo seu link real do GitHub)*

2.  **Abra no Ambiente de Desenvolvimento:**
    * Abra a pasta do projeto no IntelliJ IDEA, VS Code ou qualquer IDE Java de sua preferência.

3.  **Execute:**
    * Execute o arquivo `src/Main.java`. O programa iniciará no console, exibindo os dados iniciais e o menu de opções.

---
**Desenvolvido por:** [Seu Nome Completo - Ex: Ruan Almeida]
**Plataforma:** Alura - Formação Back-End Java
