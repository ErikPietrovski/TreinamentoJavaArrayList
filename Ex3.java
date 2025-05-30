/*3- Crie um programa que armazene 6 números inteiros em um ArrayList e depois pergunte ao usuário 
um número para verificar se ele está na lista.Exiba uma mensagem indicando se o número está ou não presente. */
import java.util.ArrayList; 
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o " + (i+1) + "° numero inteiro");
            int num = myobj.nextInt();
            nums.add(num);
        }
        System.out.println("digite o numero que voce deseja conferir se foi inserido");
        int verify = myobj.nextInt();
        if(nums.contains(verify)){
            System.out.println("o numero " + verify + " esta presente");
        }else{
            System.out.println("o numero digitado nao foi inserido");
        }
        myobj.close();

    }
}
