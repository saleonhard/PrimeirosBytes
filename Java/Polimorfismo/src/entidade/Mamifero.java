package entidade;



public class Mamifero {
    private double peso;
    private String codigoIbama;
    
    
    
    public double getPeso() {
        return peso;
    }

    public void setPeso (double peso) {
        this.peso = peso;
    }
    
    public void locomover() {
        System.out.println("Sou mamífero: Posso andar, voar, nadar, correr, etc");
    }
}