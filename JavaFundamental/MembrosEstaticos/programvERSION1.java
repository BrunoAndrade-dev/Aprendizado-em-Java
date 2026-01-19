package MembrosEstaticos;
import java.util.*;  

// VERSÃO 1 
public class programvERSION1 {
 
    public static void main (String[] args) { 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in) ; 

        System.out.println("ENTER RADIUS : ");
        double radius = sc.nextDouble() ;

        double c = MembrosEstaticos.calculator.circumference(radius) ; 

        double v = MembrosEstaticos.calculator.volume(radius) ; 

        System.out.printf("Circunferencia : %.2f%n"  , c);

        System.out.printf("Volume : %.2f%n", v);

        System.out.printf("PI : %.2f%n" , MembrosEstaticos.calculator.PI);

        sc.close() ; 
    }

}

