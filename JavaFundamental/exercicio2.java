import java.util.Scanner;
import java.util.Locale;
public class exercicio2 {
    public static void main (String[] args) {
        //  Em uma mercearia, todos os produtos possuem um código de identificação, faça um programa que elabore o troco de um pruuto, lendo o preço unitpario, a quantidade comprada e o valor em dinheiro dada pelo cliente.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in); 
        String nomeP ; 
        float precoU ; 
        int quantidade ; 
        float valorD  ;
        System.out.println("Digite o nome do produto : "); 
        nomeP = sc.nextLine();
        System.out.println("Digite o preço unitpario do produto :"); 
        precoU = sc.nextFloat() ;
        System.out.println("Digite a quantidade comprada : ");
        quantidade = sc.nextInt() ; 
        System.out.println("Digite o valor que deseja dar na compra");
        valorD = sc.nextFloat() ;
        float Fpreco ; 
        Fpreco = precoU *quantidade ;
        System.out.println("O preço total da compra é : " + String.format("%.2f", Fpreco)) ;
        float troco ; 
        troco = valorD - Fpreco;
        if (troco < 0 ) { 
            System.out.println("Valor insuficiente para a compra") ;
        }
        else {
            System.out.println("O troco é : " + String.format("%.2f", troco)) ;
        }
        System.out.println("Você comprou : " + nomeP) ;
        System.out.println("Preço unitpario : " + String.format("%.2f", precoU)) ;
        System.out.println("Quantidade comprada : " + quantidade) ;
        System.out.println("Valor final = " +String.format("%.2f", Fpreco));
        sc.close();
        
    }

}
