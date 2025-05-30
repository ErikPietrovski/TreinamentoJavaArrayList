/* 5- Crie um programa que leia 4 palavras, armazene em um ArrayList, e depois exiba
 essas palavras na ordem inversa.*/
import java.util.ArrayList;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            System.out.println("Insira a " + (i+1) + "° palavra");
            String palavra = myobj.nextLine();
            palavras.add(palavra);
           
            }
            System.out.println("Palavras na ordem inversa:");
            for (int i = palavras.size() - 1; i >= 0; i--) {
                System.out.println(palavras.get(i));
        }
        myobj.close();
    }
}
