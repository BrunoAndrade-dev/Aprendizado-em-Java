package ClassesPooProduct;

public class Produto {
    public String name; 
    public double valor; // Alterado para double para maior precisão
    public int qnt; 

    public double valor_compra() {
        return valor * qnt;
    }

    public void add_stock(int qnt) { 
        this.qnt += qnt; 
    }

    public void removeProducts(int qnt) { 
        this.qnt -= qnt; 
    }

    // Método para facilitar a exibição dos dados
    public String toString() {
        return name 
            + ", R$ " 
            + String.format("%.2f", valor) 
            + ", " 
            + qnt 
            + " unidades, Total: R$ " 
            + String.format("%.2f", valor_compra());
    }
}