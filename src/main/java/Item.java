public class Item {
  private int quantidade;
  private Produto produto;

  public Item (Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
  }

  public double calcularSubTotal(){

    try {
      return produto.getPreco() * this.quantidade;
    }catch(Exception e){
      return 0.0;
    }
    
  }

}