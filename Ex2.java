/*2- Crie um programa que armazene 4 números inteiros em um ArrayList e depois calcule
 e exiba a soma desses números.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int soma = 0;
        ArrayList<Integer> nums = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Insira o " + (i+1) + "° numero inteiro");
            int num = myobj.nextInt();
            nums.add(num);
            soma += num;
        }
        System.out.println("numeros: " + nums);
        System.out.println("soma: " + soma);
        myobj.close();

        
    }
}
