public class Smartphone extends Produto {


    private String memoriaGB;

    public Smartphone(int id, String marca, String modelo, Double preco, String memoriaGB) {
        super(id, marca, modelo, preco);
        this.memoriaGB = memoriaGB;
    }

    public String getMemoriaGB() {
        return this.memoriaGB;
    }

    public void setMemoriaGB(String memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    @Override
    public String getDescricao() {

        return "Smartphone " + this.getMarca() + " " + this.getModelo() + " " + this.getMemoriaGB();
    }
}