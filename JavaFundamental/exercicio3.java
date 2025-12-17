import java.util.Scanner;
import java.util.Locale ;
public class exercicio3 {
    public static void main (String[] args){
        // Simulador de notas  com estrutura de condição para saber se o aluno foi aprovado ou não
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float p1, p2, p3 ; 
        String nomeAluno ; 
        int faltas ; 
        float media = 0 ;
        System.out.println("\n Nome do Aluno : ") ; 
        nomeAluno = sc.nextLine() ;
        System.out.println("\\n Nota 1 -> ") ; 
        p1 = sc.nextFloat(); 
        System.out.println(" Nota 2 ->") ; 
        p2 = sc.nextFloat(); 
        System.out.println("Nota 3 ->" ); 
        p3 = sc.nextFloat() ; 
        System.out.println("Quantas Faltas você teve ? : ") ; 
        faltas = sc.nextInt(); 
        if (faltas < 20){
            media = (p1+ p2 + p3) / 3 ; 
        }else {
            System.out.println("Aluno reprovado por falta :/") ; 
        }

        if (media < 6.0){
            System.out.println("Aluno " + nomeAluno + "  REPROVADO COM MÉDIA  : " + media);
        } else {
            System.out.println("Aluno " + nomeAluno + "APROVADO COM MÉDIA : " + media);
        }
        sc.close();


    }
}
