
import static java.lang.Math.pow;
import java.util.Scanner;

public class Aplication {

    public static final int P = 5, Q = 11, E = 7;

    public class Chaves {

        public static int n = P * Q;
        public static int z = (P - 1) * (Q - 1);
        public static int d = (z*2+1)/E;
    }

    public class Coding {

        public static char[] name;

        public static int tam_string;
        public static int[] code;
        private static boolean[] cripto;

        public static void Encoding(String name) {

            tam_string = name.length();
            code = new int[tam_string];
            Coding.name = new char[tam_string];
            for (int i = 0; i < tam_string; i++) {
                Coding.name[i] = name.charAt(i);
            }

            for (int i = 0; i < tam_string; i++) {
                Coding.name[i] = name.charAt(i);
                if ((int) Coding.name[i] == 32) {
                    code[i] = 55;
                } else {
                    code[i] = (int) Coding.name[i] - 55;
                }
            }

        }

        public static void Dencoding(int[] code) {
            for (int i = 0; i < tam_string; i++) {
                if (code[i] == 55) {
                    name[i] = 32;
                } else {
                    name[i] = (char) (code[i] + 55);
                }

            }

        }
    }

    public class Cripting {

        public static int cripto[] = new int[Coding.tam_string];
        public static int mensagem_plana[] = new int[Coding.tam_string];
        
        

        public static void Encripting() {
            for (int i = 0; i < Coding.tam_string; i++) {
                
                cripto[i] = (int) (Math.pow(Coding.code[i], E) % Chaves.n);
            }

        }

        public static int[] Desencripting() {
            for (int i = 0; i < Coding.tam_string; i++) {
                mensagem_plana[i] = (int) (Math.pow(cripto[i], Chaves.d) % Chaves.n);
            }
            return mensagem_plana;

        }

    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um frase ou palavra a ser encriptografada:");
        String name = src.nextLine();
        Coding.Encoding(name.toUpperCase());
        Cripting.Encripting();
        Cripting.Desencripting();
        System.out.println("pre codigo");
        for (int i = 0; i < Coding.tam_string; i++) {
            System.out.print(Coding.code[i]);
        }
        System.out.println("\nrsa");
        for (int i = 0; i < Coding.tam_string; i++) {
            System.out.print(Cripting.cripto[i]);
        }
        System.out.println();
        for (int i = 0; i < Coding.tam_string; i++) {
            System.out.print(Cripting.mensagem_plana[i]);
        }
        
    
    }
}
