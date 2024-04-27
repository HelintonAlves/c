import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        
        try{
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            float altura = sc.nextFloat();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Minha idade é " + idade + " anos.");
            System.out.println("Tenho " + altura + "m de altura.");
            sc.close();
        }catch(InputMismatchException e){
            System.out.println("Digite os campos idade e altura precisam ser numéricos");
        }     


    }
    
}
