/*8- Crie um programa que gerencie uma lista de livros lidos. O programa deve permitir:

Adicionar um livro à lista.
Listar todos os livros.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> livros = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("0 - Sair");
            opcao = myobj.nextInt();
            myobj.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Livro: ");
                    livros.add(myobj.nextLine());
                    break;
                case 2:
                    System.out.println("Livros lidos:" + livros);
                    break;
            }
        } while (opcao != 0);

        myobj.close();
    }
}
