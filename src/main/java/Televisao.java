public class Televisao extends Produto{
 private int polegadas;
 private String resolucao;

 public Televisao(int id, String marca, String modelo, Double preco, int polegadas, String resolucao){
  super(id, marca, modelo, preco);
  this.polegadas = polegadas;
  this.resolucao = resolucao;
 }

 public int getPolegadas(){
  return this.polegadas;
 }

 public String getResolucao(){
  return this.resolucao;
 }

 public void setPolegadas(int polegadas){
  this.polegadas = polegadas;
 }

 public void setResolucao(String resolucao){
  this.resolucao = resolucao;
 }

 public String getDescricao(){
  return "Televisão " + this.getMarca() + " " + this.getModelo() + " " + this.getPolegadas() + " " + this.getResolucao();
 }

 public Double calcularGarantia(int anosDeGarantia){
  return 0.1 * anosDeGarantia * this.getPreco();
 }
      
}
