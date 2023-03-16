import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int a = 0;
        int soma = 0;
        int c = 0;
        List<Integer> lista = new ArrayList<>();

        System.out.println("digite o num que deseja verificar se existe na sequência de Fibonacci");
        num = scan.nextInt();

        while (c < num){

            c = c + 1;
            soma = soma + c;

            lista.add(soma);
        }
        if (lista.contains(num)){
            System.out.println(" o num esta na lista ");
        }
        else {
            System.out.println(" o num nao esta na lista");
        }




    }
}