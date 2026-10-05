public class Cachorro extends Animal {
    
    private String porte;

    //CONSTRUTOR 
    public Cachorro(String porte, String nome, String cor, String raca, int idade, String sexo, boolean adotado) {
        super(nome, cor, raca, idade, sexo, adotado);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    //Sobrescreve o método emitirSom da superclasse
    @Override 
    public void emitirSom(){
        System.out.println("Au au!");
    }
}
