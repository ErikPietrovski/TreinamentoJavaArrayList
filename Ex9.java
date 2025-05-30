/*9- Crie um programa que mantenha uma lista de filmes favoritos. O programa deve permitir:

Adicionar um filme à lista.
Listar todos os filmes.
Remover um filme da lista.Verificar se um livro já foi lido.Remover um contato da agenda pelo nome. */
import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> filmes = new ArrayList<>();
        ArrayList<String> livros = new ArrayList<>();
        ArrayList<String> contatos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n1 - Adicionar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Remover filme");
            System.out.println("4 - Adicionar livro");
            System.out.println("5 - Verificar se livro foi lido");
            System.out.println("6 - Adicionar contato");
            System.out.println("7 - listar contatos");
            System.out.println("7 - Remover contato");
            System.out.println("0 - Sair");
            opcao = myobj.nextInt();
            myobj.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Filme: ");
                    filmes.add(myobj.nextLine());
                    break;
                case 2:
                    System.out.println("Filmes:" + filmes);
                    break;
                case 3:
                    System.out.print("Filme para remover: ");
                    filmes.remove(myobj.nextLine());
                    break;
                case 4:
                    System.out.print("Livro: ");
                    livros.add(myobj.nextLine());
                    break;
                case 5:
                    System.out.print("Livro a verificar: ");
                    String livro = myobj.nextLine();
                    if (livros.contains(livro)) {
                        System.out.println("Já foi lido.");
                    } else {
                        System.out.println("Ainda não foi lido.");
                    }
                    break;
                case 6:
                    System.out.print("Contato: ");
                    contatos.add(myobj.nextLine());
                    break;
                case 7:
                    System.out.print("lista de contatos: " + contatos);
                    break;
                case 8:
                    System.out.print("Contato para remover: ");
                    contatos.remove(myobj.nextLine());
                    break;
            }
        } while (opcao != 0);

        myobj.close();
    }
}
