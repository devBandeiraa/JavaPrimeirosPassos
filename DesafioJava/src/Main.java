import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("***************************\n");


        String nome = "Jhordan Bandeira";
        System.out.println("Nome do cliente: " + nome);

        String tipoConta = "Corrente";
        System.out.println("Tipo de Conta: " + tipoConta);

        double saldo = 2500;
        System.out.println("Saldo atual: " + saldo + "\n");


        System.out.println("Operações\n");


        int opcao = 0;
        while (opcao != 4){

            System.out.println("""
                    1- Consultar Saldos
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    """);
        System.out.println("Digite a opção desejada: ");
        opcao = leitura.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double novoSaldo = leitura.nextDouble();
                    saldo = saldo + novoSaldo;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    double novoValor = leitura.nextDouble();
                    saldo = saldo - novoValor;
                    System.out.println("Saldo atualizado: " + saldo);
            }
            
        }


        }


    }
