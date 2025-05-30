/*7- Crie um programa que simule uma agenda de contatos. O programa deve permitir:

Adicionar um contato (nome).
Listar todos os contatos.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> contatos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("0 - Sair");
            opcao = myobj.nextInt();
            myobj.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    contatos.add(myobj.nextLine());
                    break;
                case 2:
                    System.out.println("Contatos:" + contatos);
                    break;
            }
        } while (opcao != 0);

        myobj.close();
    }
}

