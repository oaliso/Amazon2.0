/*

Classe Desenvolvida por:
Alisson de Carvalho Silva

*/

public abstract class Produto{

  public Produto( int id, String marca, String modelo, Double preco){
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    this.preco = preco;
  }

  private int id;
  private String marca;
  private String modelo;
  private Double preco;

  public Double getPreco () {
    return this.preco;
  }

  public abstract String getDescricao();

  public abstract Double calcularGarantia();



}