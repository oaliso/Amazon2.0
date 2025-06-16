public class Notebook extends Produto {
 private String processador;
 private int memoriaRam;

 public Notebook(int id, String marca, String modelo, Double preco, String processador, int memoriaRam){
  super(id, marca, modelo, preco);
  this.processador = processador;
  this.memoriaRam = memoriaRam;
 }

 public String getProcessador(){
  return this.processador;
 }

 public int getMemoriaRam(){
  return this.memoriaRam;
 }

 public void setProcessador(String processador){
  this.processador = processador;
 }

 public void setMemoriaRam(int memoriaRam){
  this.memoriaRam = memoriaRam;
 }

 public String getDescricao(){
  return "Notebook " + this.getMarca() + " " + this.getModelo() + " " + this.getProcessador() + " " + this.getMemoriaRam();
 }
  
 public Double calcularGarantia(int anosDeGarantia){
  return 0.1 * anosDeGarantia * this.getPreco();
 }
}

