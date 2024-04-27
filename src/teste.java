import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String args[]) {  

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);    

        System.out.println("Escolha seu plano: ");

        String plano = leitor.next();
        
        switch ( plano ) {

            case "B" : {

                System.out.println("Plano básico");
                break;
            }

            case "M" : {

                System.out.print("plano midia");

                break;
            }

            case "T" : {

                System.out.print("plano turbo");

                break;
            }     

            default: {

                System.out.print("nenhuma opção selecionada");

            }
        }
    }
    
}
