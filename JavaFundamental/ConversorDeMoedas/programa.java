package ConversorDeMoedas;
import java.util.* ; 
public class programa  {
    public static void main (String[] str ) { 
        Locale.setDefault(Locale.US) ; 
        Scanner sc  = new Scanner( System.in) ;

        String Linha = "-=" ; 
        System.out.print(Linha.repeat(30)) ; 
        System.out.println("QUANTOS DÓLARES SERÃO COMPRADOS ? ");
        double QtdDolar = sc.nextDouble();

        System.out.println("VALOR A SER PAGO EM REAIS  : ");
        System.out.println("RESULTADO = "  + ConversorDeMoedas.Calc.dolars(QtdDolar) ); 
        
        sc.close(); 

    }
}
