package ClassesPOO;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) { 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        triangulo t1 = new triangulo();
        triangulo t2 = new triangulo();

        System.out.println("Digite as medidas do triângulo 1: ");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo 2: ");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();
        double p1 = (t1.a + t1.b + t1.c) / 2.0 ; 
        double p2 = (t2.a + t2.b + t2.c) / 2.0 ; 
        System.out.printf("Área do triângulo 1: %.4f%n", p1); 
        System.out.printf("Área do triângulo 2 : %4f%n" , p2) ; 

        


        sc.close(); 
    }
}
