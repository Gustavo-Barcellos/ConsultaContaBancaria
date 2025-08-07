/*
Desafio do curso: Sistema de Conta Bancária Simples

Objetivo:
Simular uma conta bancária virtual com operações básicas de saldo, depósito e transferência.

Requisitos do projeto:
- Exibir dados iniciais do cliente:
  Nome, tipo de conta e saldo inicial (ex: R$ 2500,00)

- Exibir menu de opções repetidamente até o usuário sair:
  1 - Consultar saldo
  2 - Receber valor
  3 - Transferir valor
  4 - Sair

- Funcionalidades:
  - Opção 1: Mostrar saldo atual
  - Opção 2: Solicitar valor a receber e somar ao saldo
  - Opção 3: Solicitar valor a transferir e subtrair do saldo
    > Se o valor for maior que o saldo, exibir mensagem de erro
  - Opção 4: Encerrar aplicação
  - Qualquer outra opção: Mostrar “Opção inválida”

Conceitos a praticar:
- Declaração de variáveis
- Entrada e saída de dados
- Condicionais (if/else)
- Loops (while)
- Organização e nomeação de métodos (ex: recebeTransferencia())

Checklist sugerido:
1. Inicializar os dados do cliente
2. Criar o menu de opções com loop
3. Implementar visualização do saldo
4. Implementar recebimento de valor
5. Implementar transferência com validação
6. Tratar entradas inválidas
*/

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner selecaoUsuario = new Scanner (System.in);
        System.out.println("Digite 1 para exibir as opções!");
        int opcaoSelecionada = selecaoUsuario.nextInt();

        double saldo = 2500;

        while (opcaoSelecionada != 4) {
            System.out.println("Selecione uma opção:\n1 - Consultar saldo\n2 - Receber valor\n3 - Transferir valor\n4 - Sair");
            opcaoSelecionada = selecaoUsuario.nextInt();
            if (opcaoSelecionada == 1) {
                System.out.println(saldo);
            } else if (opcaoSelecionada == 2) {
                Scanner receberValor = new Scanner (System.in);
                System.out.println("Quanto você deseja depositar na conta?");
                double valorAdicionado = selecaoUsuario.nextInt();
                saldo += valorAdicionado;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcaoSelecionada == 3) {
                Scanner transferirValor = new Scanner(System.in);
                System.out.println("Quanto você deseja transferir?");
                double valorRetirado = selecaoUsuario.nextInt();
                if (valorRetirado > saldo) {
                    System.out.println("Valor insuficiente para transferência.");
                } else {
                    saldo -= valorRetirado;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if  (opcaoSelecionada == 4) {
                break;
            } else {
                System.out.println("Digite uma opção válida.");
            }
        }
    }
}
