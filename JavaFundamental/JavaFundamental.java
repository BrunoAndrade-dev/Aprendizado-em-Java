import java.util.Scanner;
import java.util.Locale;
public class JavaFundamental {
    //Lendo um texto até a quebra de linha
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);  
        int x ;
        double y ; 
        char c ; 
        //x = sc.next();
        //System.out.println("Você digitou: " + x);
        //sc.close(); 
        // Para ler numero int
        x = sc.nextInt();
        System.out.println("Você Digitou :" + x) ; 
        

        // Para ler numero double
        y = sc.nextDouble();
        System.out.println("Vpocê digitou : " + y ) ;
        sc.close();
        // Para ler um caractere
        c = sc.next().charAt(0);
        System.out.println("Você Digitou :"+ c );
    }
}


    

