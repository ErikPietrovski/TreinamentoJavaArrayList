/*10-Crie um programa que simule um sistema de conta bancária. O programa deve permitir:

Criar uma nova conta (nome do titular e saldo inicial).
Listar todas as contas cadastradas.
Remover uma conta pelo nome do titular.
Realizar depósitos em uma conta.
Realizar saques de uma conta.
Use dois ArrayLists: um para armazenar os nomes dos titulares e outro para os saldos. */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> saldos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Criar conta");
            System.out.println("2 - Listar contas");
            System.out.println("3 - Remover conta");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("0 - Sair");
            opcao = myobj.nextInt();
            myobj.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    nomes.add(myobj.nextLine());
                    System.out.print("Saldo inicial: ");
                    saldos.add(myobj.nextDouble());
                    myobj.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println(nomes.get(i) + " - R$ " + saldos.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Nome para remover: ");
                    String nomeRemover = myobj.nextLine();
                    int iRemover = nomes.indexOf(nomeRemover);
                    if (iRemover != -1) {
                        nomes.remove(iRemover);
                        saldos.remove(iRemover);
                    }
                    break;
                case 4:
                    System.out.print("Nome da conta: ");
                    String nomeDeposito = myobj.nextLine();
                    int iDeposito = nomes.indexOf(nomeDeposito);
                    if (iDeposito != -1) {
                        System.out.print("Valor: ");
                        saldos.set(iDeposito, saldos.get(iDeposito) + myobj.nextDouble());
                        myobj.nextLine();
                    }
                    break;
                case 5:
                    System.out.print("Nome da conta: ");
                    String nomeSaque = myobj.nextLine();
                    int iSaque = nomes.indexOf(nomeSaque);
                    if (iSaque != -1) {
                        System.out.print("Valor: ");
                        double valor = myobj.nextDouble();
                        if (saldos.get(iSaque) >= valor) {
                            saldos.set(iSaque, saldos.get(iSaque) - valor);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        myobj.nextLine();
                    }
                    break;
            }
        } while (opcao != 0);

        myobj.close();
    }
}
