/*6- Crie um programa que simule uma lista de compras. O programa deve permitir:

Adicionar itens à lista.
Exibir todos os itens.
Remover um item da lista. */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar item");
            System.out.println("2 - Exibir lista");
            System.out.println("3 - Remover item");
            System.out.println("0 - Sair");
            opcao = myobj.nextInt();
            myobj.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Item: ");
                    lista.add(myobj.nextLine());
                    break;
                case 2:
                    System.out.println("Itens:" + lista);
                    break;
                case 3:
                    System.out.print("Item para remover: ");
                    lista.remove(myobj.nextLine());
                    break;
            }
        } while (opcao != 0);

        myobj.close();
    }
}
