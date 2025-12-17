import java.util.Scanner; 
import java.util.Locale;
public class exercicio1 {
    public static void main (String[] args) {
        //Fazer um programa para ler medidas de largura e comprimento como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, mostrar a área do terreno, o valor do metro quadrado.
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner (System.in);
        
        double largura ;
        double comprimento ;
        double vmetro ;
        System.out.println("Digite a largura do terreno : ");
        largura = sc.nextDouble() ;
        System.out.println("Digite o comprimento do terreno :") ; 
        comprimento = sc.nextDouble() ; 
        System.out.println("Digite o valor do metro quadrado : ") ;
        vmetro = sc.nextDouble() ;

        double area = largura * comprimento ; 

        System.out.println("AREA DO TERRENO = " + String.format("%.2f", area)) ;

        double preco = area * vmetro ;
        System.out.println("Preço do terreno = " + String.format("%.2f", preco)) ; 
        sc.close();

    }
}
