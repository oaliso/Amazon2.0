/*

Classe Desenvolvida por:
Alisson de Carvalho Silva

*/

public abstract class Produto{

  private int id;
  private String marca;
  private String modelo;
  private Double preco;

  public Produto( int id, String marca, String modelo, Double preco){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.preco = preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Double getPreco () {
    return this.preco;
  }

  public int getId () {
    return this.id;
  }

  public String getMarca () {
    return this.marca;
  }

  public String getModelo () {
    return this.modelo;
  }

  public abstract String getDescricao();

}