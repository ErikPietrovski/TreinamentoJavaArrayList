/*4- Escreva um programa que leia 5 números inteiros e os 
armazene em um ArrayList. Em seguida, remova todos os números negativos e exiba a lista final. */
import java.util.ArrayList;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<Float> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i+1) + "° número:");
            float num = myobj.nextFloat();
            nums.add(num);
        }
        nums.removeIf(f -> f < 0);
        System.out.println("os numeros negativos foram removidos: " + nums);
        myobj.close();
    }
}

