
import java.util.Scanner;

public class Aplication {
    public static int[] Encoding(String name) {
        int tam_string = name.length();
        int cod[] = new int[tam_string];
        System.out.print("O texto plano e = ");
        for (int i = 0; i < tam_string; i++) {
            char c = name.charAt(i);
            if ((int) c == 32){
                cod[i] = 55;
            }
            else cod[i] = (int) c - 55;
            System.out.print(cod[i]);
        }
        System.out.println();
        return cod;
    }

    public static int ChavePublica() {
        return 0;
    }

    public static int ChavePrivada() {
        return 0;
    }

    public static int Encripting(String name) {
        Encoding(name);
        return 0;
    }

    public static int Desencripting() {
        return 0;
    }
    public static String Desencoding(int[] code) {
        
        return "a";
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um frase ou palavra a ser encriptografada:");
        String name = src.nextLine();
        Encripting(name.toUpperCase());
    }

    
}
