import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        nome = scan.next();
        System.out.println("String original: " + nome);

        char[] caracteres = nome.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        String inverter = new String(caracteres);
        System.out.println("String invertida: " + inverter);
    }
}
