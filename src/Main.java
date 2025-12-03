import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /* Inicializar dados do cliente*/

        String nome = "Ruan Almeida Santos";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println(String.format("""
                *****************************
                Dados iniciais do cliente:
                
                Nome:               %s
                Tipo conta:         %s
                Saldo inicial:      R$ %f
                
                ******************************
                """, nome, tipoConta, saldo));

        /* fim dos dados do cliente*/


        for (int i = 0; i < 100; i++) {  /* loop para continuação dos operadores*/


        /* Menu de opções */

        System.out.println(String.format("""
                Operações
                
                1- Consultar Saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """));


        System.out.println(String.format("""
                Digite a opção desejada:                  (este campo só aceita numeros)
                """));

        int numEscolhido = leitor.nextInt();

        if (numEscolhido == 1){            /* opção 1 - CONSULTAR SALDO */
            System.out.println(String.format("""
                    O saldo autal é R$ %.2f
                    """, saldo));
        } else if(numEscolhido == 2){       /* opção 2 - RECEBER VALOR*/
            System.out.println("Digite o valor que ira receber: ");
            double valorReceber = leitor.nextDouble();
            saldo += valorReceber;
            System.out.println(String.format("""
                    Última transação recebida: %.2f
                    Saldo atualizado: %.2f
                    """, valorReceber, saldo));
        } else if(numEscolhido == 3){        /* opção 3 - TRANSFERIR VALOR */
            System.out.println("Quantos reais deseja transferir?");

            double valorTransferido = leitor.nextDouble();
            if (valorTransferido > saldo){
                System.out.println("Transeferencia invalida -> valor maior que saldo");
                System.out.println(String.format("""
                       
                        Saldo atual: %.2f
                        """, saldo));
            }else{
                saldo = saldo - valorTransferido;
                System.out.println(String.format("""
                    Valor transferido: %.2f
                    Saldo atualizado: %.2f
                    """, valorTransferido, saldo));}
        }else if(numEscolhido == 4){       /* opção 4 - SAIR*/
            System.out.println(String.format("""
                    Obrigado %s estamos desligando
                    """, nome));
            i = 100;
        }

      }
    }
}