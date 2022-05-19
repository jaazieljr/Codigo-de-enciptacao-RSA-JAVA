
import static java.lang.Math.pow;
import java.util.Scanner;

public class Aplication {

    public static final int P = 5, Q = 11;

    public class Chaves {

        public static int n = P * Q;
        public static int z = (P - 1) * (Q - 1);
        public static int e = 7;
        public static int d = (2 * (n - 1) + 1) / e;
    }

    public class Coding {

        public static int tam_string;
        public static int[] code;

        public static int[] Encoding(String name) {
            tam_string = name.length();
            code = new int[tam_string];
            for (int i = 0; i < tam_string; i++) {
                char c = name.charAt(i);
                if ((int) c == 32) {
                    code[i] = 55;
                } else {
                    code[i] = (int) c - 55;
                }
            }

            return code;
        }
    }
    
    public class Cripting{
        public static long [] cripto;
        public static int [] mensagem_plana;
        
        public static long [] Encripting(int [] code) {
            for (int i=0;i<Coding.tam_string;i++){
                mensagem_plana[i]=code[i];
                cripto[i] = (long) pow(mensagem_plana[i],Chaves.e)%Chaves.n;
            }
            return cripto; 
            
           }
        public static int[] Desencripting(long [] code) {
            for (int i=0;i<Coding.tam_string;i++){
                cripto[i] = code[i];
                mensagem_plana [i] = (int) (pow(cripto[i], Chaves.d)%Chaves.n); 
            }
            return mensagem_plana;
        
    }
        
    }
    
    
    

    

    

    public static String Desencoding(int[] code) {

        return "a";
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Digite um frase ou palavra a ser encriptografada:");
        String name = src.nextLine();
        Coding.Encoding(name.toUpperCase());
    }

}
