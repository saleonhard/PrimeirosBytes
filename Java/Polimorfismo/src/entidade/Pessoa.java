package entidade;

public class Pessoa extends Mamifero {
    private String CPF;
    private String codigoIbama;
    
    public Pessoa(){
    
    this.codigoIbama="M001";
    }
    
    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF (String CPF) {
        this.CPF = CPF;
    }
    
    public void locomover() {
        System.out.println("Sou uma pessoa: Posso andar, nadar, correr, etc");
    }
}

