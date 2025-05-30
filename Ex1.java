/*1- Crie um programa que armazene 5 nomes digitados
 pelo usuário em um ArrayList e, ao final, exiba todos os nomes na ordem que foram inseridos. */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(5);
        System.out.println("nomes");
        for (int i = 0; i < 5; i++) {
            System.out.println("por favor insira o " + (i + 1) + "° nome");
           String nome = myobj.nextLine();
           nomes.add(nome);
        }
        System.out.println("nomes: " + nomes);
        myobj.close();
    }
}