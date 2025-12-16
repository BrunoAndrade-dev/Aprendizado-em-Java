public class funcoesMtm {
    public static void main (String[] args) {
        double x = 25.0;
        double y = 4.0 ; 
        double z = 2.0 ; 
        double A , B , C ;
        A = Math.sqrt(x) ;
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        
        System.out.println("Raiz quadrada :") ; 
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        A = Math.pow(x , y) ; 
        B = Math.pow(x , 2.0);
        System.out.println("Potência :");
        System.out.println(x + "elevado a " + y + " = " + A) ; 
        System.out.println(x + "elevado a 2 = " + B) ; 

        A = Math.abs(y);
        B= Math.abs(z) ; 

        System.out.println("Valor Absoluto de " + y + "=" + A ) ; 
        System.out.println("Valor Absoluto de " + z + "=" + B ) ;
    }
}
