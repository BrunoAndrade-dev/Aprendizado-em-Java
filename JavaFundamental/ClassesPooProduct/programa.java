package ClassesPooProduct;
import java.util.Locale ; 
import java.util.Scanner ; 
public class programa {

    public static void main (String[] args) { 
        Locale.setDefault(Locale.US) ; 
        Scanner sc = new Scanner (System.in) ; 

        Produto product = new Produto() ; 
        System.out.println("Insira os dados do produto : ");
        System.out.print("NAME : ");
        product.name = sc.nextLine() ; 
        System.out.print("PREÇO : ");
        product.valor = sc.nextDouble();
        System.out.print("QUANTIDADE : ");
        product.qnt = sc.nextInt() ; 

        System.out.println("Dados do produto " + product );

        sc.close() ; 
    }
}
