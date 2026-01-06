import java.util.Scanner; 
public class exercicio5 {
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in) ;
        System.out.println("DIGITE UM NUMERO DE 1 A 7 E VEJA O DIA DA SEMANA : ");
        int x = sc.nextInt();
        String dia = "" ; 
        switch (x) {
            case 1 : 
                dia = "Domingo" ;
                break; 
            case 2 :   
                dia = "Segunda";
                break ;
            case 3 : 
                dia = "Terça" ; 
                break; 
            case 4  :
                dia = "Quarta" ; 
                break ; 
            case 5  : 
                dia = "Quinta" ; 
                break ; 
            case 6 : 
                dia = "Sexta" ;
                break; 
            case 7 : 
                dia = "Sábado" ; 
                break ;  
            default : 
                System.out.println("Opção inválida");                  
        } 

        System.out.println("Hoje é  " +  dia);

        sc.close();
    }
}
