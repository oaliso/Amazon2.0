public class Smartphone extends Produto{

 private String memoriaRam;
 private String memoriaGB;

 public Smartphone(int id, String marca, String modelo, Double preco, String memoriaRam, String memoriaGB){
  super(id, marca, modelo, preco);
  this.memoriaRam = memoriaRam;
  this.memoriaGB = memoriaGB;
 }

 public String getMemoriaRam(){
  return this.memoriaRam;
 }

 public String getMemoriaGB(){
  return this.memoriaGB;
 }

 public void setMemoriaRam(String memoriaRam){
  this.memoriaRam = memoriaRam;
 }

 public void setMemoriaGB(String memoriaGB){
  this.memoriaGB = memoriaGB;
 }

 public String getDescricao(){
  return "Smartphone " + this.getMarca() + " " + this.getModelo() + " " + this.getMemoriaRam() + " " + this.getMemoriaGB(); 
 }

 public Double calcularGarantia(int anosDeGarantia){
  return 0.1 * anosDeGarantia * this.getPreco();
 }
      
}
