import java.util.Scanner ;
import java.util.Locale ; 
public class exercicio6 {
    public static void main (String[] args) { 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in) ;
        // Crie um programa que simule um pequeno menu de conta bancaria. o program deve rodar continuamente até que o usuario decida sair. 
        int op = 0 ; 
        float saldo = 100 ;
        String status ; 
        while (op != 3) { 
            System.out.println(" Digite uma opção : ");
            System.out.println("1 - VER SALDO ") ;
            System.out.println("2 - VER STATUS ");
            System.out.println("3 - SAIR");
            op = sc.nextInt();
            switch (op) { 
                case 1 :
                    System.out.println(" Saldo disponivekl de " + saldo + "REAIS");
                    break ;
                case 2 : 
                    status = "positivo" ; 
                    System.out.println(" Status : " + status);
                    break ; 
                case 3 :
                    System.out.println("SAINDO...");
                    break ; 
                default : 
                    System.out.println("OPÇÃO INVÁLIDA, DIGITE OUTRA...");    
            }
        }
        sc.close();
    }

}
