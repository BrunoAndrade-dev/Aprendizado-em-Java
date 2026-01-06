import java.util.Scanner; 
import java.util.Locale ; 
public class exercicio4 {
    public static void main (String[] args) {
        // Estruturas cumulativas
        //Uma operadora de telefonia cobra 50 reais por um plano basico que dá direito a 100
        //minutos de telefone. Cada minuto que exceder a franquia de 100 minutos custa 2 reais.
        Locale.setDefault(Locale.US) ; 
        Scanner sc = new Scanner (System.in);
        int minutos , acumulo ; 
        float valorTotal ; 
        
        System.out.println("Digite a quantidade de minutos consumidos : ") ; 
        minutos = sc.nextInt(); 
        if (minutos <= 100) {
            valorTotal = 50; 
            System.out.println("Você deverá pagar um valor de " + valorTotal);
        } else if (minutos > 100) { 
            acumulo = minutos - 100 ; 
            valorTotal = 50 + (acumulo * 2) ; 
            System.out.printf("Houve um acrescimo de %d " ,acumulo,  " minutos, então o valor final é : %.2f ",   valorTotal);  
        }
        
        sc.close();
    }
}
